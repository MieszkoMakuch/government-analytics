package agh.cs.lab9;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class NoSpendingsInfoInYearException extends IllegalArgumentException{
    //Parameterless Constructor
    public NoSpendingsInfoInYearException() {}

    //Constructor that accepts a message
    public NoSpendingsInfoInYearException(String message)
    {
        super(message);
    }
}
