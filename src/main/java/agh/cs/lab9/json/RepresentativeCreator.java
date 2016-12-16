package agh.cs.lab9.json;

import agh.cs.lab9.Representative;
import agh.cs.lab9.RepresentativeWithTrips;
import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.trips.RepresentativeTripsAPI;
import com.google.gson.Gson;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class RepresentativeCreator extends AbstractCreator {
    private String siteUrl = "https://api-v3.mojepanstwo.pl/dane/poslowie/";
    int id;
    private String extension = ".json";
    private String layersInUrl = "?layers[]=krs&layers[]=";
    private String tripsInUrl = "wyjazdy";
    private String spendingsInUrl = "wydatki";

    public RepresentativeCreator(int id) {
        this.id = id;
    }

    protected String getUrl() {
        return siteUrl + id + extension;
    }

    protected String getTripsUrl() {
        return siteUrl + id + extension + layersInUrl + tripsInUrl;
    }

    protected String getSpendingsUrl(){
        return siteUrl + id + extension + layersInUrl + spendingsInUrl;
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

        if(representativeAPI.getData().getPoslowieLiczbaWyjazdow() == 0){
            return new Representative(
                    representativeAPI,
                    representativeSpendingsAPI);
        } else {
            String jsonRepresentativeTripsAPI = null;
            try {
                jsonRepresentativeTripsAPI = getJSON(this.getTripsUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }

            RepresentativeTripsAPI representativeTripsAPI = gson.fromJson(jsonRepresentativeTripsAPI, RepresentativeTripsAPI.class);

            return new RepresentativeWithTrips(
                    representativeAPI,
                    representativeTripsAPI,
                    representativeSpendingsAPI);
        }
    }
}


