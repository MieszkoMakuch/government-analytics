package agh.cs.lab9;

import com.neovisionaries.i18n.CountryCode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class SelectParser extends AbstractParser {
    private final String[] avgEquivalents = {"avg", "average"};
    private final String[] officeEquivalents = {"office"};
    private final String[] spendingsEquivalents = {"spendings"};
    private final String[] maxNumberEquivalents = {"max"};
    private final String[] maxLengthEquivalents = {"longest"};
    private final String[] maxCostEquivalents = {"expensive", "mexpensive"};
    private final String[] tripEquivalents = {"trip", "trips"};
    private final String[] visitedEquivalents = {"visited"};
    private ChosenOption chosenOption;

    public SelectParser(String[] args, ChosenOption chosenOption) {
        super(args);
        this.chosenOption = chosenOption;
    }

    public ChosenOption getChosenOption(int start) {
        if (Arrays.asList(representativeEquivalents).contains(args[start])) {
            if (Arrays.asList(visitedEquivalents).contains(args[argsLength - 4])) {
                chosenOption = parseVisitedCountries(chosenOption);
            } else {
                chosenOption = parseMaxAggregate(chosenOption);
            }
        } else if (Arrays.asList(avgEquivalents).contains(args[start])) {
            chosenOption = parseAvgAggregate(chosenOption);
        } else {
            chosenOption = parseForSingleRepresentative(chosenOption);
        }
        return chosenOption;
    }

    private ChosenOption parseVisitedCountries(ChosenOption chosenOption) {
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TripsToCOUNTRY);
        String countryString = args[argsLength - 3];
        CountryCode countryCode = CountryCode.getByCode(countryString.toUpperCase());
        if (countryCode == null) {
            List<CountryCode> countryCodes = CountryCode.findByName(countryString);
            if (countryCodes.size() != 1) {
                throw new IllegalArgumentException(countryString + " is not a valid country name/code");
            }
            countryCode = countryCodes.get(0);
        }
        chosenOption.setCountryCode(countryCode);
        chosenOption = parseTerm(chosenOption, argsLength - 2);
        return chosenOption;
    }

    private ChosenOption parseMaxAggregate(ChosenOption chosenOption) {
        requiredNumberOfArguments(6, 9);
        if (Arrays.asList(maxNumberEquivalents).contains(args[argsLength - 4])) {
            chosenOption.setAggregate(Aggregates.MaxNUMBER);
        } else if (Arrays.asList(maxLengthEquivalents).contains(args[argsLength - 4])) {
            chosenOption.setAggregate(Aggregates.MaxLength);
        } else if (Arrays.asList(maxCostEquivalents).contains(args[argsLength - 4])) {
            chosenOption.setAggregate(Aggregates.MaxCOST);
        } else {
            throw new IllegalArgumentException(args[argsLength - 4] + " is not a valid argument");
        }

        if (Arrays.asList(tripEquivalents).contains(args[argsLength - 3])) {
            chosenOption.setRepresentativeDetails(RepresentativesDetails.TRIPS);
        } else {
            throw new IllegalArgumentException(args[argsLength - 3] + " is not a valid argument");
        }
        chosenOption = parseTerm(chosenOption, argsLength - 2);
        return chosenOption;
    }

    private ChosenOption parseAvgAggregate(ChosenOption chosenOption) {
        requiredNumberOfArguments(5, 5);
        if (Arrays.asList(spendingsEquivalents).contains(args[2])) {
            chosenOption.setYear(Integer.parseInt(args[4]));
            chosenOption.setAggregate(Aggregates.AVG);
        } else {
            throw new IllegalArgumentException(args[2] + " is not a valid third argument");
        }
        return chosenOption;
    }

    private ChosenOption parseForSingleRepresentative(ChosenOption chosenOption) {
        chosenOption = parseRepresentativeFromName(chosenOption, 1);
        requiredNumberOfArguments(5, 6);
        chosenOption = parseRepresentativeDetails(chosenOption);
        return chosenOption;
    }

    private ChosenOption parseRepresentativeDetails(ChosenOption chosenOption) {
        if (Arrays.asList(officeEquivalents).contains(args[2])) {
            chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.OFFICE);
            chosenOption.setYear(Integer.parseInt(args[5]));
        } else if (Arrays.asList(spendingsEquivalents).contains(args[2])) {
            chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.ALL);
            chosenOption.setYear(Integer.parseInt(args[4]));
        } else {
            throw new IllegalArgumentException(args[2] + " is not a valid third argument");
        }
        return chosenOption;
    }

}
