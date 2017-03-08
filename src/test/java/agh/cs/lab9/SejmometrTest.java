package agh.cs.lab9;

import agh.cs.lab9.json.LocalSejmometrCreator;
import com.neovisionaries.i18n.CountryCode;
import org.junit.Test;

import java.io.PrintWriter;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by mieszkomakuch on 17.12.2016.
 */
public class SejmometrTest {
    @Test
    public void getRepresentativeWithTheBiggestNumberOfDaysAbroad() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        assertEquals(81, sejmometr1.getRepresentativeWithTheBiggestNumberOfDaysAbroad().getId());

        Sejmometr sejmometr2 = new LocalSejmometrCreator(7).createSejmometr();
        assertEquals(134, sejmometr2.getRepresentativeWithTheBiggestNumberOfDaysAbroad().getId());
    }

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

        Sejmometr sejmometr2 = new LocalSejmometrCreator(7).createSejmometr();
        Representative representative2 = sejmometr2.getRepresentativeWithTheMostExpensiveTrip();
        assertEquals(376, representative2.getId());
        assertEquals(27529.35, representative2.getCostOfTheMostExpensiveTrip(), 0.001);
    }

    @Test
    public void getRepresentativeWithBiggestNoOfTripsInCountry() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        CountryCode countryCode = CountryCode.getByCode("UA");
        assertEquals(81, sejmometr1.getRepresentativeWithBiggestNoOfTripsInCountry(countryCode).getId());
    }

    @Test
    public void getRepresentativeWithBiggestNoOfTripsAbroad() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(8).createSejmometr();
        assertEquals(81, sejmometr1.getRepresentativeWithBiggestNoOfTripsAbroad().getId());

        Sejmometr sejmometr2 = new LocalSejmometrCreator(7).createSejmometr();
        assertEquals(134, sejmometr2.getRepresentativeWithBiggestNoOfTripsAbroad().getId());
    }

    @Test
    public void getAverageRepresentativesSpendings() throws Exception {
        Sejmometr sejmometr1 = new LocalSejmometrCreator(7).createSejmometr();
        assertEquals("131157.53", sejmometr1.getAverageRepresentativesSpendings(2012).toString());

        Sejmometr sejmometr2 = new LocalSejmometrCreator(7).createSejmometr();
        assertEquals("141090.07", sejmometr2.getAverageRepresentativesSpendings(2013).toString());
    }

}