package agh.cs.lab9;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class NoSpendingsDetailsInYearException extends IllegalArgumentException {
    //Parameterless Constructor
    public NoSpendingsDetailsInYearException() {
    }

    //Constructor that accepts a message
    public NoSpendingsDetailsInYearException(String message) {
        super(message);
    }
}
