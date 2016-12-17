package agh.cs.lab9;

import agh.cs.lab9.json.sejmometr.SejmometrAPI;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Sejmometr {
    SejmometrAPI sejmometrAPI;

    private Map<String, Representative> representatives = new HashMap<String, Representative>();

    public Sejmometr(SejmometrAPI sejmometrAPI) {
        this.sejmometrAPI = sejmometrAPI;
    }

    @Override
    public String toString() {
        return "Sejmometr{" +
                "sejmometrAPI=" + sejmometrAPI +
                ", representatives=" + representatives +
                '}';
    }
}
