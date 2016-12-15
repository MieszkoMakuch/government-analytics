package agh.cs.lab9.json;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class RepresentativeCreatorTest {
    @Test
    public void getSpendingsUrl() throws Exception {
        RepresentativeCreator representativeDataGetter = new RepresentativeCreator(174);
        assertEquals("https://api-v3.mojepanstwo.pl/dane/poslowie/174.json?layers[]=krs&layers[]=wydatki",
                representativeDataGetter.getSpendingsUrl());
    }

    @Test
    public void getTripsUrl() throws Exception {
        RepresentativeCreator representativeDataGetter = new RepresentativeCreator(261);
        assertEquals("https://api-v3.mojepanstwo.pl/dane/poslowie/261.json?layers[]=krs&layers[]=wyjazdy",
                representativeDataGetter.getTripsUrl());
    }

    @Test
    public void getRepresentativeUrl() throws Exception {
        RepresentativeCreator representativeDataGetter = new RepresentativeCreator(174);
        assertEquals("https://api-v3.mojepanstwo.pl/dane/poslowie/174.json",
                representativeDataGetter.getUrl());
    }

}