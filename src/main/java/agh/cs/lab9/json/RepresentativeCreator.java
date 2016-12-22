package agh.cs.lab9.json;

import agh.cs.lab9.Representative;
import agh.cs.lab9.RepresentativeWithTripsInfo;
import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.trips.RepresentativeTripsAPI;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class RepresentativeCreator extends AbstractCreator {
    protected int id;
    protected final String url;

    public RepresentativeCreator(String url, int id) {
        this.url = url;
        this.id = id;
    }

    protected String getUrl() {
        return url  + id + RepresentativeUpdater.extension;
    }

    protected String getTripsUrl() {
        return getUrl() + RepresentativeUpdater.layersInUrl + RepresentativeUpdater.tripsInUrl;
    }

    protected String getSpendingsUrl(){
        return getUrl() + RepresentativeUpdater.layersInUrl + RepresentativeUpdater.spendingsInUrl;
    }

    public Representative createRepresentative() {
        String jsonRepresentativeAPI = null;
        String jsonRepresentativeSpendingsAPI = null;
        try {
            jsonRepresentativeAPI = getJSON(this.getUrl());
            jsonRepresentativeSpendingsAPI = getJSON(this.getSpendingsUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        RepresentativeAPI representativeAPI = gson.fromJson(jsonRepresentativeAPI, RepresentativeAPI.class);
        RepresentativeSpendingsAPI representativeSpendingsAPI = gson.fromJson(jsonRepresentativeSpendingsAPI, RepresentativeSpendingsAPI.class);

        if(representativeAPI.getData().getPoslowieLiczbaWyjazdow() > 0) {
            String jsonRepresentativeTripsAPI = null;
            try {
                jsonRepresentativeTripsAPI = getJSON(this.getTripsUrl());

                RepresentativeTripsAPI representativeTripsAPI = gson.fromJson(jsonRepresentativeTripsAPI, RepresentativeTripsAPI.class);
                return new RepresentativeWithTripsInfo(
                        representativeAPI,
                        representativeTripsAPI,
                        representativeSpendingsAPI);
            } catch (JsonSyntaxException e) {
                System.out.println("Brak informacji o wyjazdach posła o id: " + representativeAPI.getId());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return new Representative(
                representativeAPI,
                representativeSpendingsAPI);
    }
}


