package agh.cs.lab9;

import agh.cs.lab9.json.LocalSejmometrCreator;
import com.neovisionaries.i18n.CountryCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class OptionsParser {
    private String[] args;
    private final int argsLength;
    private final String[] selectEquivalents = {"select"};
    private final String[] updateEquivalents = {"update"};
    private final String[] representativeEquivalents = {"representative", "rep", "representatives"};
    private final String[] avgEquivalents = {"avg", "average"};
    private final String[] officeEquivalents = {"office"};
    private final String[] spendingsEquivalents = {"spendings"};
    private final String[] maxNumberEquivalents = {"max"};
    private final String[] maxLengthEquivalents = {"longest"};
    private final String[] maxCostEquivalents = {"expensive", "mexpensive"};
    private final String[] tripEquivalents = {"trip", "trips"};
    private final String[] termEquivalents = {"term"};
    private final String[] visitedEquivalents = {"visited"};

    public OptionsParser(String[] args) {
        this.args = args;
        argsLength = args.length;
    }

    public ChosenOption getChosenOption(){
        return setChosenOption(new ChosenOption());
    }

    private ChosenOption setChosenOption(ChosenOption chosenOption) throws IllegalArgumentException {
        requiredNumberOfArguments(3,9);
        chosenOption = parseStatement(chosenOption);

        if(chosenOption.getStatement().equals(Statements.SELECT)){
            chosenOption = parseSelectStatement(chosenOption);
        } else if(chosenOption.getStatement().equals(Statements.UPDATE)) {
            chosenOption = parseUpdateStatement(chosenOption);
        }
        return chosenOption;
    }

    private ChosenOption parseUpdateStatement (ChosenOption chosenOption){
        return chosenOption;
    }

    private ChosenOption parseSelectStatement (ChosenOption chosenOption){
        if(Arrays.asList(representativeEquivalents).contains(args[1])){
            if(Arrays.asList(visitedEquivalents).contains(args[argsLength-4])){
                chosenOption = parseVisitedCountries(chosenOption);
            } else {
                chosenOption = parseMaxAggregate(chosenOption);
            }
        } else if (Arrays.asList(avgEquivalents).contains(args[1])){
            chosenOption = parseAvgAggregate(chosenOption);
        } else {
            chosenOption = parseForSingleRepresentative(chosenOption);
        }
        return chosenOption;
    }

    private ChosenOption parseVisitedCountries(ChosenOption chosenOption){
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TripsToCOUNTRY);
        String countryString = args[argsLength-3];
        CountryCode countryCode = CountryCode.getByCode(countryString.toUpperCase());
        if(countryCode == null) {
           List<CountryCode> countryCodes = CountryCode.findByName(countryString);
           if (countryCodes.size() != 1){
               throw new IllegalArgumentException(countryString + " is not a valid country name/code");
           }
           countryCode = countryCodes.get(0);
        }
        chosenOption.setCountryCode(countryCode);
        chosenOption = parseTerm(chosenOption);
        return chosenOption;
    }

    private ChosenOption parseMaxAggregate(ChosenOption chosenOption){
        requiredNumberOfArguments(6,9);
        if (Arrays.asList(maxNumberEquivalents).contains(args[argsLength-4])){
            chosenOption.setAggregate(Aggregates.MaxNUMBER);
        } else if (Arrays.asList(maxLengthEquivalents).contains(args[argsLength-4])){
            chosenOption.setAggregate(Aggregates.MaxLength);
        } else if (Arrays.asList(maxCostEquivalents).contains(args[argsLength-4])) {
            chosenOption.setAggregate(Aggregates.MaxCOST);
        } else {
            throw new IllegalArgumentException(args[argsLength-4] + " is not a valid argument");
        }

        if(Arrays.asList(tripEquivalents).contains(args[argsLength-3])){
            chosenOption.setRepresentativeDetails(RepresentativesDetails.TRIPS);
        } else {
            throw new IllegalArgumentException(args[argsLength-3] + " is not a valid argument");
        }
        chosenOption = parseTerm(chosenOption);
        return chosenOption;
    }

    private ChosenOption parseAvgAggregate(ChosenOption chosenOption){
        requiredNumberOfArguments(5,5);
        if(Arrays.asList(spendingsEquivalents).contains(args[2])){
            chosenOption.setYear(Integer.parseInt(args[4]));
            chosenOption.setAggregate(Aggregates.AVG);
        } else {
            throw new IllegalArgumentException(args[2] + " is not a valid third argument");
        }
        return chosenOption;
    }

    private ChosenOption parseTerm(ChosenOption chosenOption) {
        if (Arrays.asList(termEquivalents).contains(args[argsLength-2])){
            chosenOption.setTerm(Integer.parseInt(args[argsLength-1]));
        } else {
            throw new IllegalArgumentException(args[argsLength - 2] + " is not a valid argument");
        }
        return chosenOption;
    }

    private ChosenOption parseForSingleRepresentative(ChosenOption chosenOption) {
        chosenOption = parseRepresentativeFromName(chosenOption);
        requiredNumberOfArguments(5,6);
        chosenOption = parseRepresentativeDetails(chosenOption);
        return chosenOption;
    }

    private ChosenOption parseRepresentativeDetails(ChosenOption chosenOption) {
        if (Arrays.asList(officeEquivalents).contains(args[2])){
            chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.OFFICE);
            chosenOption.setYear(Integer.parseInt(args[5]));
        } else if (Arrays.asList(spendingsEquivalents).contains(args[2])){
            chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.ALL);
            chosenOption.setYear(Integer.parseInt(args[4]));
        } else {
            throw new IllegalArgumentException(args[2] + " is not a valid third argument");
        }
        return chosenOption;
    }

    private void requiredNumberOfArguments(int from, int to) throws IllegalArgumentException{
        if (argsLength < from){
            throw new IllegalArgumentException("Not enough arguments: " + argsLength);
        }
        if (argsLength > to){
            throw new IllegalArgumentException("To many arguments: " + argsLength);
        }
    }

    private ChosenOption parseStatement(ChosenOption chosenOption) throws IllegalArgumentException{
        if (Arrays.asList(selectEquivalents).contains(args[0])){
            chosenOption.setStatement(Statements.SELECT);
        } else if (Arrays.asList(updateEquivalents).contains(args[0])) {
            chosenOption.setStatement(Statements.UPDATE);
        } else {
            throw new IllegalArgumentException(args[0] + " is not a valid first argument");
        }
        return chosenOption;
    }

    private ChosenOption parseRepresentativeFromName(ChosenOption chosenOption) {
        Representative representative = null;
        for (int term : Sejmometr.availableTerms){
            Sejmometr sejmometr = new LocalSejmometrCreator(term).createSejmometr();
            representative = sejmometr.getRepresentative(args[1]);
            if(representative != null) {
                chosenOption.setRepresentativeName(representative.getName());
                chosenOption.setRepresentativeId(representative.getId());
                return chosenOption;
            }
        }
        throw new IllegalArgumentException(args[1] + " is not a valid second argument");
    }

}
