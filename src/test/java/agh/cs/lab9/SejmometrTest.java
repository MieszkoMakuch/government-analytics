package agh.cs.lab9;

import agh.cs.lab9.json.LocalSejmometrCreator;
import agh.cs.lab9.json.SejmometrCreator;
import com.neovisionaries.i18n.CountryCode;
import org.junit.Test;

import java.io.PrintWriter;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 17.12.2016.
 */
public class SejmometrTest {
    @Test
    public void getRepresentativesWhoVisitedCountry() throws Exception {
        Sejmometr sejmometr = new LocalSejmometrCreator(8).createSejmometr();
        CountryCode countryCode = CountryCode.getByCode("IT");
        ArrayList<Representative> actualList = sejmometr.getRepresentativesWhoVisitedCountry(countryCode);
        assertEquals(25, actualList.size());
    }

    @Test
    public void getRepresentativeWithTheMostExpensiveTrip() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        Representative representative = sejmometr1.getRepresentativeWithTheMostExpensiveTrip();
        assertEquals(414, representative.getId());
        assertEquals(27305.58, representative.getCostOfTheMostExpensiveTrip(), 0.001);
    }

    @Test
    public void getRepresentativeWithBiggestNoOfInCountry() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        CountryCode countryCode = CountryCode.getByCode("UA");
        assertEquals(81, sejmometr1.getRepresentativeWithBiggestNoOfTripsInCountry(countryCode).getId());
    }

    @Test
    public void getRepresentativeWithBiggestNoOfTripsAbroad() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        assertEquals(81, sejmometr1.getRepresentativeWithBiggestNoOfTripsAbroad().getId());
    }

    @Test
    public void getAverageRepresentativesSpendings() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        assertEquals(69291.20, sejmometr1.getAverageRepresentativesSpendings(2012), 0.01);

        Sejmometr sejmometr2 = new LocalSejmometrCreator(8).createSejmometr();
        assertEquals(75591.77, sejmometr2.getAverageRepresentativesSpendings(2013), 0.01);
    }

    @Test
    public void toStringTest() throws Exception {
        Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
        System.out.println(sejmometr.toString());

        PrintWriter zapis = new PrintWriter("sejmometrAllPages.txt");
        zapis.println(sejmometr.toString());
        zapis.close();
    }

}