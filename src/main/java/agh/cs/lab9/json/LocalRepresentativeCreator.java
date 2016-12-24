package agh.cs.lab9.json;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class LocalRepresentativeCreator extends RepresentativeCreator {
    public LocalRepresentativeCreator(int id) {
        super(SejmometrUpdater.representativeLocalFilesPath, id);
    }

    @Override
    protected String getUrl() {
        return url + id + RepresentativeUpdater.extension;
    }

    @Override
    protected String getTripsUrl() {
        return url + id + RepresentativeUpdater.tripsInUrl + RepresentativeUpdater.extension;
    }

    @Override
    protected String getSpendingsUrl() {
        return url + id + RepresentativeUpdater.spendingsInUrl + RepresentativeUpdater.extension;
    }

    @Override
    protected String getJSON(String url) throws IOException {
        String content = new Scanner(new File(url)).useDelimiter("\\Z").next();
        return content;
    }
}
