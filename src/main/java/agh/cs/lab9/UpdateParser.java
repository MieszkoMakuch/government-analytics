package agh.cs.lab9;

import java.util.Arrays;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class UpdateParser extends AbstractParser {
    private final String[] sejmometrEquivalents = {"sejmometr"};
    private ChosenOption chosenOption;


    public UpdateParser(String[] args, ChosenOption chosenOption) {
        super(args);
        this.chosenOption = chosenOption;
    }

    public ChosenOption getChosenOption(int start) {
        requiredNumberOfArguments(3, 4);
        if (Arrays.asList(sejmometrEquivalents).contains(args[start])) {
            chosenOption.setUpdateSet(UpdateSets.SEJMOMETR);
            chosenOption = parseSejmometrUpdate(chosenOption, 2);
        } else if (Arrays.asList(representativeEquivalents).contains(args[start])) {
            chosenOption.setUpdateSet(UpdateSets.REPRESENTATIVE);
            chosenOption = parseRepresentativeUpdate(chosenOption, 2);
        } else {
            throw new IllegalArgumentException(args[start] + " is not a valid set of files to update");
        }
        return chosenOption;
    }

    protected ChosenOption parseSejmometrUpdate(ChosenOption chosenOption, int start) {
        chosenOption = parseTerm(chosenOption, start);
        return chosenOption;
    }

    protected ChosenOption parseRepresentativeUpdate(ChosenOption chosenOption, int start) {
        chosenOption = parseRepresentativeFromName(chosenOption, start);
        return chosenOption;
    }
}
