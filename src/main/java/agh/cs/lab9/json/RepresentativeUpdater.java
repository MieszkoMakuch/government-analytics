package agh.cs.lab9.json;

import java.io.IOException;

/**
 * Created by mieszkomakuch on 21.12.2016.
 */
public class RepresentativeUpdater {

    private final int id;
    private final String localFilesPath;
    public static final String url = "https://api-v3.mojepanstwo.pl/dane/poslowie/";
    public static final String extension = ".json";
    public static final String layersInUrl = "?layers[]=krs&layers[]=";
    public static final String tripsInUrl = "wyjazdy";
    public static final String spendingsInUrl = "wydatki";
    private FileUpdater mainJson;
    private FileUpdater spendingsJson;
    private FileUpdater tripsJson;

    public RepresentativeUpdater(int id, String localFilesPath) {
        this.id = id;
        this.localFilesPath = localFilesPath;
        String mainUrl = url + this.id + extension;
        this.mainJson = new FileUpdater(
                mainUrl,
                this.id + extension,
                localFilesPath);
        this.spendingsJson = new FileUpdater(
                mainUrl + layersInUrl + spendingsInUrl,
                this.id + spendingsInUrl + extension,
                localFilesPath);
        this.tripsJson = new FileUpdater(
                mainUrl + layersInUrl + tripsInUrl,
                this.id + tripsInUrl + extension,
                localFilesPath);
    }

    public void updateAllFiles() throws IOException {
        mainJson.update();
        spendingsJson.update();
        tripsJson.update();
    }
}
