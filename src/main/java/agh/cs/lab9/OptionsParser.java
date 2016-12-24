package agh.cs.lab9;

import java.util.Arrays;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class OptionsParser extends AbstractParser {
    private final String[] selectEquivalents = {"select"};
    private final String[] updateEquivalents = {"update"};

    public OptionsParser(String[] args) {
        super(args);
    }

    public ChosenOption getChosenOption() {
        return setChosenOption(new ChosenOption());
    }

    private ChosenOption setChosenOption(ChosenOption chosenOption) throws IllegalArgumentException {
        requiredNumberOfArguments(3, 9);
        chosenOption = parseStatement(chosenOption);

        if (chosenOption.getStatement().equals(Statements.SELECT)) {
            chosenOption = new SelectParser(args, chosenOption).getChosenOption(1);
        } else if (chosenOption.getStatement().equals(Statements.UPDATE)) {
            chosenOption = new UpdateParser(args, chosenOption).getChosenOption(1);
        }
        return chosenOption;
    }

    private ChosenOption parseStatement(ChosenOption chosenOption) throws IllegalArgumentException {
        if (Arrays.asList(selectEquivalents).contains(args[0])) {
            chosenOption.setStatement(Statements.SELECT);
        } else if (Arrays.asList(updateEquivalents).contains(args[0])) {
            chosenOption.setStatement(Statements.UPDATE);
        } else {
            throw new IllegalArgumentException(args[0] + " is not a valid first argument");
        }
        return chosenOption;
    }

}
