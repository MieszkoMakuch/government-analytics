package agh.cs.lab9;

import agh.cs.lab9.json.LocalSejmometrCreator;

import java.util.Arrays;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public abstract class AbstractParser {
    protected final int argsLength;
    protected final String[] termEquivalents = {"term"};
    protected final String[] representativeEquivalents = {"representative", "rep", "representatives"};
    protected String[] args;

    public AbstractParser(String[] args) {
        this.args = args;
        argsLength = args.length;
    }

    protected void requiredNumberOfArguments(int from, int to) throws IllegalArgumentException {
        if (args.length < from) {
            throw new IllegalArgumentException("Not enough arguments: " + args.length);
        }
        if (args.length > to) {
            throw new IllegalArgumentException("To many arguments: " + args.length);
        }
    }

    protected ChosenOption parseRepresentativeFromName(ChosenOption chosenOption, int start) {
        Representative representative = null;
        for (int term : Sejmometr.availableTerms) {
            Sejmometr sejmometr = new LocalSejmometrCreator(term).createSejmometr();
            representative = sejmometr.getRepresentative(args[start]);
            if (representative != null) {
                chosenOption.setRepresentative(representative);
                return chosenOption;
            }
        }
        throw new IllegalArgumentException(args[start] + " is not a valid name/argument");
    }


    protected ChosenOption parseTerm(ChosenOption chosenOption, int start) {
        if (Arrays.asList(termEquivalents).contains(args[start])) {
            chosenOption.setTerm(Integer.parseInt(args[start + 1]));
        } else {
            throw new IllegalArgumentException(args[start] + " is not a valid argument");
        }
        return chosenOption;
    }

}
