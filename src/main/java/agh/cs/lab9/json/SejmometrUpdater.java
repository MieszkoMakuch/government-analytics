package agh.cs.lab9.json;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mieszkomakuch on 21.12.2016.
 */
public class SejmometrUpdater {
    private final int term;
    private ArrayList<FileUpdater> pagesJson;
    public static final String url = "https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=";
    public static final String extension = ".json";
    public static final String filesName = "sejmometr-page-";
    public static final String localFilesPath = "jsonLocalFiles/kadencja";
    public static final String representativeLocalFilesPath = "jsonLocalFiles/poslowie/";
    private SejmometrCreator sejmometrCreator;

    public SejmometrUpdater(int term) {
        this.term = term;
        this.sejmometrCreator = new SejmometrCreator(this.url, term);
        this.pagesJson = getPagesJson(term);
    }

    private ArrayList<FileUpdater> getPagesJson(int term) {
        ArrayList<String> pagesUrls = sejmometrCreator.getPagesUrls();
        ArrayList<FileUpdater> pagesJson = new ArrayList<FileUpdater>();
        int i = 1;
        for (String pageUrl : pagesUrls) {
            pagesJson.add(new FileUpdater(pageUrl, this.filesName + i + this.extension, this.localFilesPath + term + "/"));
            i++;
        }
        return pagesJson;
    }

    public void update() throws IOException {
        System.out.println( "--------------------------------------------------\n" +
                            " Updating Sejmometr files for term: " + this.term + "\n" +
                            "--------------------------------------------------");
        for (FileUpdater pageJson : this.pagesJson) {
            pageJson.update();
        }
        for (int representativeId : sejmometrCreator.getRepresentativesIds()){
            System.out.println(" Updating representative files id: " + representativeId);
            new RepresentativeUpdater(representativeId, representativeLocalFilesPath).updateAllFiles();
        }
    }
}
