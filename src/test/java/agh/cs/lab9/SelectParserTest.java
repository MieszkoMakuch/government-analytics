package agh.cs.lab9;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class SelectParserTest {

    public ChosenOption prepareChosenOptionWithReflection(String[] args, String methodName) throws Exception {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        SelectParser selectParser = new SelectParser(args, chosenOption);
        Method method = selectParser.getClass().getDeclaredMethod(methodName, ChosenOption.class);
        method.setAccessible(true);
        return (ChosenOption) method.invoke(selectParser, chosenOption);
    }

    @Test
    public void parseVisitedCountriesItaly() throws Exception {
        String[] args = {"select", "representatives", "who", "visited", "Italy", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseVisitedCountries");
        assertEquals(RepresentativesDetails.TripsToCOUNTRY, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
        assertEquals("Italy", chosenOption.getCountryCode().getName());
    }

    @Test
    public void parseVisitedCountriesUkraine() throws Exception {
        String[] args = {"select", "representatives", "who", "visited", "Ukraine", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseVisitedCountries");
        assertEquals(RepresentativesDetails.TripsToCOUNTRY, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
        assertEquals("Ukraine", chosenOption.getCountryCode().getName());
    }

    @Test
    public void parseVisitedCountriesUk() throws Exception {
        String[] args = {"select", "representatives", "who", "visited", "GB", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseVisitedCountries");
        assertEquals(RepresentativesDetails.TripsToCOUNTRY, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
        assertEquals("United Kingdom", chosenOption.getCountryCode().getName());
    }


    @Test
    public void parseVisitedCountriesIt() throws Exception {
        String[] args = {"select", "representatives", "who", "visited", "IT", "term", "7"};
        //Reflection
        ChosenOption chosenOption = prepareChosenOptionWithReflection(args, "parseVisitedCountries");
        assertEquals(RepresentativesDetails.TripsToCOUNTRY, chosenOption.getRepresentativeDetails());
        assertEquals(7, chosenOption.getTerm());
        assertEquals("Italy", chosenOption.getCountryCode().getName());
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
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentative().getName());
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
}