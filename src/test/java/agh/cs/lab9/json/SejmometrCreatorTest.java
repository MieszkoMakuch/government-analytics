package agh.cs.lab9.json;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class SejmometrCreatorTest {
    @Test
    public void getSejmometrUrl() throws Exception {
        SejmometrCreator sejmometrDataGetter =
                new SejmometrCreator("https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=",7);
        assertEquals("https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=7",
                sejmometrDataGetter.getUrl());
    }

    @Test
    public void getAPI() throws Exception {

    }

}