package agh.cs.lab9.json;

import agh.cs.lab9.Sejmometr;
import agh.cs.lab9.json.sejmometr.Dataobject;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class SejmometrCreator extends AbstractCreator {
    protected String url;
    protected int term;
    protected ArrayList<String> pagesUrls = new ArrayList<String>();
    boolean usingLocalFiles;
    SejmometrAPI sejmometrAPI;

    public SejmometrCreator(String url, int term) {
        boolean usingLocalFiles = false;
        this.url = url;
        this.term = term;

        if (!Sejmometr.isThisTermAvialable(term)) {
            throw new IllegalArgumentException("Missing information about " + this.term + " term.");
        }
        sejmometrAPI = createMainSejmometrApiClass();
    }

    protected String getUrl() {
        return url + term;
    }

    public Sejmometr createSejmometr() {
        return new Sejmometr(sejmometrAPI, this.term);
    }

    protected SejmometrAPI createMainSejmometrApiClass() {
        pagesUrls.add(getUrl());
        SejmometrAPI sejmometrAPI = createSingleSejmometrAPIClassFromUrl(this.pagesUrls.get(0));
        return parseNextPages(sejmometrAPI);
    }

    protected SejmometrAPI createSingleSejmometrAPIClassFromUrl(String url) {
        String jsonSejmometrAPI = null;
        try {
            jsonSejmometrAPI = getJSON(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(jsonSejmometrAPI, SejmometrAPI.class);
    }

    protected SejmometrAPI parseNextPages(SejmometrAPI firstPageAPI) {
        List<Dataobject> allDataObjects = firstPageAPI.getDataobject();
        SejmometrAPI nextSejmometrAPI = firstPageAPI;
        int currentPageNo = 1;
        while (nextSejmometrAPI.getLinks().getNext() != null) {
            String nextPageUrl = getNextPageUrl(nextSejmometrAPI, currentPageNo);
            pagesUrls.add(nextPageUrl);
            nextSejmometrAPI = createSingleSejmometrAPIClassFromUrl(nextPageUrl);
            allDataObjects.addAll(nextSejmometrAPI.getDataobject());
            currentPageNo++;
        }
        firstPageAPI.setDataobject(allDataObjects);
        return firstPageAPI;
    }

    protected String getNextPageUrl(SejmometrAPI sejmometrAPI, int currentPage) {
        return sejmometrAPI.getLinks().getNext();
    }

    public ArrayList<String> getPagesUrls() {
        return this.pagesUrls;
    }

    public ArrayList<Integer> getRepresentativesIds() {
        ArrayList<Integer> representativesIds = new ArrayList<Integer>();
        for (Dataobject dataobject : sejmometrAPI.getDataobject()) {
            representativesIds.add(dataobject.getId());
        }
        return representativesIds;
    }
}
