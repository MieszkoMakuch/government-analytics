package agh.cs.lab9.json;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class LocalRepresentativeCreatorTest {
    @Test
    public void getUrl() throws Exception {
        int id = 1405;
        String expectedLocalUrl = "jsonLocalFiles/poslowie/" + id + ".json";
        assertEquals(expectedLocalUrl, new LocalRepresentativeCreator(id).getUrl());
    }

    @Test
    public void getTripsUrl() throws Exception {
        int id = 1405;
        String expectedLocalUrl = "jsonLocalFiles/poslowie/" + id + "wyjazdy.json";
        assertEquals(expectedLocalUrl, new LocalRepresentativeCreator(id).getTripsUrl());

    }

    @Test
    public void getSpendingsUrl() throws Exception {
        int id = 1405;
        String expectedLocalUrl = "jsonLocalFiles/poslowie/" + id + "wydatki.json";
        assertEquals(expectedLocalUrl, new LocalRepresentativeCreator(id).getSpendingsUrl());

    }

}