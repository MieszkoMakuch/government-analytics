package agh.cs.lab9;


import agh.cs.lab9.parser.ChosenOptionInterpreter;
import agh.cs.lab9.parser.OptionsParser;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        try {
            OptionsParser optionsParser = new OptionsParser(args);
            ChosenOptionInterpreter chosenOptionInterpreter = new ChosenOptionInterpreter(optionsParser.getChosenOption());
            System.out.println(chosenOptionInterpreter.getInterpretResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
