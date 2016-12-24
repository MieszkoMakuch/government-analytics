package agh.cs.lab9;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class ChosenOptionInterpreter extends AbstractInterpreter {

    public ChosenOptionInterpreter(ChosenOption chosenOption) {
        super(chosenOption);
    }

    public String getInterpretResult() {
        return "\n---------------------------------------RESULT--------------------------------------------\n\n" +
                interpret() +
                "\n\n-----------------------------------------------------------------------------------------\n";
    }

    public String interpret() {
        if (this.chosenOption.getStatement().equals(Statements.SELECT)) {
            return new SelectInterpreter(chosenOption).interpret();
        } else if (this.chosenOption.getStatement().equals(Statements.UPDATE)) {
            return new UpdateInterpreter(chosenOption).interpret();
        }
        return "";
    }
}
