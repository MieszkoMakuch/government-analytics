package agh.cs.lab9.json;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class LocalSejmometrCreatorTest {
    @Test
    public void getUrl() throws Exception {
        int term = 8;
        String expectedLocalUrl = "jsonLocalFiles/kadencja8/sejmometr-page-";
        assertEquals(expectedLocalUrl, new LocalSejmometrCreator(term).getUrl());
    }

}