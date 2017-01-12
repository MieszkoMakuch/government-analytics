package agh.cs.lab9.parser;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public abstract class AbstractInterpreter {
    ChosenOption chosenOption;

    public AbstractInterpreter(ChosenOption chosenOption) {
        this.chosenOption = chosenOption;
    }

    public abstract String interpret();
}
