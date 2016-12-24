package agh.cs.lab9;

import agh.cs.lab9.json.LocalRepresentativeCreator;
import com.neovisionaries.i18n.CountryCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class RepresentativeTest {

    @Test
    public void getCostOfTheMostExpensiveTrip() throws Exception {
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        assertEquals(24431.04, representative.getCostOfTheMostExpensiveTrip(), 0.001);
    }

    @Test
    public void getName() throws Exception {
        String expectedName = "Jan Dziedziczak";
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        assertEquals(expectedName, representative.getName());
    }

    @Test
    public void getNumberOfTripsAbroad() throws Exception {
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        assertEquals(47, representative.getNumberOfTripsAbroad());
    }

    @Test
    public void getNumberOfTripsInCountry() throws Exception {
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        CountryCode countryCode = CountryCode.getByCode("UA");
        assertEquals(8, representative.getNumberOfTripsInCountry(countryCode));
    }

    @Test
    public void getNumberOfDaysAbroad() throws Exception {
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        assertEquals(165, representative.getNumberOfDaysAbroad());

    }

    @Test
    public void numberOfTripsWithMissingDetails() throws Exception {
        Representative representative = new LocalRepresentativeCreator(81).createRepresentative();
        assertEquals(2, representative.numberOfTripsWithMissingDetails());

    }

    @Test
    public void getOfficeRenovationSpendings() throws Exception {
        Representative representative = new LocalRepresentativeCreator(174).createRepresentative();
        assertEquals("2170.09", representative.getOfficeRenovationSpendings(2013).toString());
    }

    @Test
    public void countSpendingsInYear() throws Exception {
        Representative representative = new LocalRepresentativeCreator(174).createRepresentative();
        assertEquals("134261.72", representative.countSpendingsInYear(2013).toString());
    }

}