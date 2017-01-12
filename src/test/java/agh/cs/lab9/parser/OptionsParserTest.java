package agh.cs.lab9.parser;

import agh.cs.lab9.parser.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by mieszkomakuch on 23.12.2016.
 */
public class OptionsParserTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseTerm() throws Exception {
        String[] args = {"select", "representatives", "who", "visited", "Italy", "term", "7"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new OptionsParser(args).parseTerm(chosenOption, args.length - 2);
        assertEquals(7, chosenOption.getTerm());
    }

    @Test
    public void requiredNumberOfArgumentsNotEnouth() throws Exception {
        String[] args = {"1", "2", "3"};
        OptionsParser optionsParser = new OptionsParser(args);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Not enough arguments: 3");
        optionsParser.requiredNumberOfArguments(4, 5);
    }

    @Test
    public void requiredNumberOfArgumentsToMany() throws Exception {
        String[] args = {"1", "2", "3"};
        OptionsParser optionsParser = new OptionsParser(args);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("To many arguments: 3");
        optionsParser.requiredNumberOfArguments(1, 2);
    }

    @Test
    public void parseRepresentativeFromName() throws Exception {
        String[] args = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new OptionsParser(args).parseRepresentativeFromName(chosenOption, 1);
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentative().getName());
        assertEquals(152, chosenOption.getRepresentative().getId());
    }

    public ChosenOption prepareChosenOptionWithReflection(String[] args, String methodName) throws Exception {
        OptionsParser optionsParser = new OptionsParser(args);
        Method method = optionsParser.getClass().getDeclaredMethod(methodName, ChosenOption.class);
        method.setAccessible(true);
        ChosenOption chosenOption = new ChosenOption();
        return (ChosenOption) method.invoke(optionsParser, chosenOption);
    }

    @Test
    public void parseStatement() throws Exception {

        //SELECT
        String[] argsS = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOptionS = prepareChosenOptionWithReflection(argsS, "parseStatement");
        assertEquals(Statements.SELECT, chosenOptionS.getStatement());

        //UPDATE
        String[] argsU = {"update", "sejmometr", "term", "7"};
        //Reflection
        ChosenOption chosenOptionU = prepareChosenOptionWithReflection(argsU, "parseStatement");
        assertEquals(Statements.UPDATE, chosenOptionU.getStatement());
    }

    @Test
    public void setChosenOption() throws Exception {
        String[] args = {"select", "representative", "with", "the", "most", "expensive", "trip", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "setChosenOption");
        assertEquals(Aggregates.MaxCOST, chosenOption.getAggregate());
        assertEquals(RepresentativesDetails.TRIPS, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
    }

}