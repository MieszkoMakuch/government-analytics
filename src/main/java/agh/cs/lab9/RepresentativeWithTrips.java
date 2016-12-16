package agh.cs.lab9;

import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.trips.RepresentativeTripsAPI;

/**
 * Created by mieszkomakuch on 16.12.2016.
 */
public class RepresentativeWithTrips extends Representative{

    protected final RepresentativeTripsAPI representativeTripsAPI;

    public RepresentativeWithTrips(RepresentativeAPI representativeAPI,
                          RepresentativeTripsAPI representativeTripsAPI,
                          RepresentativeSpendingsAPI representativeSpendingsAPI) {
        super(representativeAPI, representativeSpendingsAPI);
        this.representativeTripsAPI = representativeTripsAPI;
    }
}
