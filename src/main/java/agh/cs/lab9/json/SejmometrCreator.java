package agh.cs.lab9.json;

import agh.cs.lab9.Sejmometr;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.Gson;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class SejmometrCreator extends AbstractCreator {
    String siteUrl = "https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=";
    int term;

    public SejmometrCreator(int term) {
        this.term = term;
    }

    protected String getUrl() {
        return siteUrl + term;
    }

    public Sejmometr createSejmometr() {
        String jsonSejmometrAPI = null;
        try {
            jsonSejmometrAPI = getJSON(this.getUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        SejmometrAPI sejmometrAPI = gson.fromJson(jsonSejmometrAPI, SejmometrAPI.class);
        return new Sejmometr(sejmometrAPI);
    }
}
