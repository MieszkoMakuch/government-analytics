package agh.cs.lab9.json;

import agh.cs.lab9.Sejmometr;
import agh.cs.lab9.json.sejmometr.Dataobject;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.List;

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

        SejmometrAPI sejmometrAPI = createSejmometrAPIClassFromUrl(this.getUrl());

        sejmometrAPI = parseNextPages(sejmometrAPI);
        return new Sejmometr(sejmometrAPI);
    }

    private SejmometrAPI createSejmometrAPIClassFromUrl (String url) {
        String jsonSejmometrAPI = null;
        try {
            jsonSejmometrAPI = getJSON(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(jsonSejmometrAPI, SejmometrAPI.class);
    }

    private SejmometrAPI parseNextPages(SejmometrAPI firstPageAPI) {

        List<Dataobject> allDataObjects = firstPageAPI.getDataobject();
        SejmometrAPI nextSejmometrAPI = firstPageAPI;

        while (nextSejmometrAPI.getLinks().getNext() != null) {
            String nextPageUrl = nextSejmometrAPI.getLinks().getNext();
            nextSejmometrAPI = createSejmometrAPIClassFromUrl(nextPageUrl);
            allDataObjects.addAll(nextSejmometrAPI.getDataobject());
        }
        firstPageAPI.setDataobject(allDataObjects);
        return firstPageAPI;
    }

}
