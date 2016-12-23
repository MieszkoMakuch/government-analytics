package agh.cs.lab9;

import org.junit.Test;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 23.12.2016.
 */
public class OptionsParserTest {

    public ChosenOption prepareChosenOptionWithReflection(String[] args, String methodName) throws Exception{
        OptionsParser optionsParser = new OptionsParser(args);
        Method method = optionsParser.getClass().getDeclaredMethod(methodName, ChosenOption.class);
        method.setAccessible(true);
        ChosenOption chosenOption = new ChosenOption();
        return  (ChosenOption)method.invoke(optionsParser, chosenOption);
    }

    @Test
    public void parseRepresentativeFromName() throws Exception {
        String[] args = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseRepresentativeFromName");
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentativeName());
        assertEquals(152, chosenOption.getRepresentativeId());
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
    public void requiredNumberOfArguments() throws Exception {
    }

    @Test
    public void parseRepresentativeDetails() throws Exception {
        //SPENDINGS.ALL
        String[] argsSA = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOptionSA = prepareChosenOptionWithReflection(argsSA, "parseRepresentativeDetails");
        assertEquals(RepresentativesDetails.SPENDINGS.ALL, chosenOptionSA.getRepresentativeDetailsSpendings());

        //SPENDINGS.OFFICE
        String[] argsSO = {"select", "Jarosław Kaczyński", "office", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOptionSO = prepareChosenOptionWithReflection(argsSO, "parseRepresentativeDetails");
        assertEquals(RepresentativesDetails.SPENDINGS.OFFICE, chosenOptionSO.getRepresentativeDetailsSpendings());
    }

    @Test
    public void parseForSingleRepresentative() throws Exception {
        //SELECT
        String[] args = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseForSingleRepresentative");
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentativeName());
        assertEquals(RepresentativesDetails.SPENDINGS.ALL, chosenOption.getRepresentativeDetailsSpendings());
    }

    @Test
    public void parseAvgAggregate() throws Exception {
        String[] args = {"select", "avg", "spendings", "in", "2013"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseAvgAggregate");
        assertEquals(Aggregates.AVG, chosenOption.getAggregate());
        assertEquals(2013, chosenOption.getYear());
    }

    @Test
    public void parseMaxAggregateMaxTrips() throws Exception {
        String[] args = {"select", "representative", "with", "max", "trips", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseMaxAggregate");
        assertEquals(Aggregates.MaxNUMBER, chosenOption.getAggregate());
        assertEquals(RepresentativesDetails.TRIPS, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
    }

    @Test
    public void parseMaxAggregateLongestTrip() throws Exception {
        String[] args = {"select", "representative", "with", "the", "longest", "trip", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseMaxAggregate");
        assertEquals(Aggregates.MaxLength, chosenOption.getAggregate());
        assertEquals(RepresentativesDetails.TRIPS, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());

    }

    @Test
    public void parseMaxAggregateExpensiveTrip() throws Exception {
        String[] args = {"select", "representative", "with", "the", "most", "expensive", "trip", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseMaxAggregate");
        assertEquals(Aggregates.MaxCOST, chosenOption.getAggregate());
        assertEquals(RepresentativesDetails.TRIPS, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
    }

    @Test
    public void parseSelectStatement() throws Exception {
    }

    @Test
    public void parseUpdateStatement() throws Exception {
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