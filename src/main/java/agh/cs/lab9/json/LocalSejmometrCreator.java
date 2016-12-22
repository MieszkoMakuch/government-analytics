package agh.cs.lab9.json;

import agh.cs.lab9.json.sejmometr.SejmometrAPI;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class LocalSejmometrCreator extends SejmometrCreator {

    public LocalSejmometrCreator(int term) {
        super(SejmometrUpdater.localFilesPath, term);
    }

    @Override
    protected String getUrl() {
        return url + term + "/" + SejmometrUpdater.filesName;
    }

    @Override
    protected SejmometrAPI createMainSejmometrApiClass() {
        pagesUrls.add(getUrl() + "1" + SejmometrUpdater.extension);
        SejmometrAPI sejmometrAPI = createSingleSejmometrAPIClassFromUrl(this.pagesUrls.get(0));
        return parseNextPages(sejmometrAPI);
    }

    @Override
    protected String getNextPageUrl(SejmometrAPI sejmometrAPI, int currentPage) {
        currentPage++;
        return getUrl() + currentPage + SejmometrUpdater.extension;
    }

    @Override
    protected String getJSON(String url) throws IOException {
        String content = new Scanner(new File(url)).useDelimiter("\\Z").next();
        return content;
    }
}
