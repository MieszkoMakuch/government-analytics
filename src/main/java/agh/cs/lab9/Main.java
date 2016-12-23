package agh.cs.lab9;
import java.io.IOException;


/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        try {
            OptionsParser optionsParser = new OptionsParser(args);
            ChosenOptionInterpreter chosenOptionInterpreter = new ChosenOptionInterpreter(optionsParser.getChosenOption());
            System.out.println(chosenOptionInterpreter.interpret());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
