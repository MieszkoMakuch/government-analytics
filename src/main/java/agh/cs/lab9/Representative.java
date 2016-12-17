package agh.cs.lab9;

import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.noTrips.RepresentativeNoTripsAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.spendings.Roczniki;
import agh.cs.lab9.json.representative.trips.RepresentativeTripsAPI;

import java.util.List;

/**
 * Created by mieszkomakuch on 10.12.2016.
 */
public class Representative {

    private final int id;
    private final String name;
    protected final RepresentativeAPI representativeAPI;
    protected final RepresentativeSpendingsAPI representativeSpendingsAPI;

    public Representative(RepresentativeAPI representativeAPI,
                          RepresentativeSpendingsAPI representativeSpendingsAPI) {

        this.id = representativeAPI.getId();
        this.name = representativeAPI.getData().getLudzieNazwa();
        this.representativeAPI = representativeAPI;
        this.representativeSpendingsAPI = representativeSpendingsAPI;

    }

    public boolean hasTrips(){
        return representativeAPI.getData().getPoslowieLiczbaWyjazdow() > 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double countSpendingsInYear(int year) {
        Roczniki rocznik = getYearSpendingsFromInt(year);
        double result = 0;
        for (Double spend : rocznik.getPola()) {
            result += spend;
        }
        return result;
    }

    protected Roczniki getYearSpendingsFromInt (int year) throws IllegalArgumentException{
        List<Roczniki> yearsSpendingList = representativeSpendingsAPI.getLayers().getWydatki().getRoczniki();
        for (Roczniki rocznik : yearsSpendingList) {
            if (rocznik.getRok() == year) return rocznik;
        }
        throw new IllegalArgumentException("Information about spendings in year " + year + " is available");
    }

    @Override
    public String toString() {
        return "Representative{" +
                "representativeAPI=" + representativeAPI +
                ", representativeSpendingsAPI=" + representativeSpendingsAPI +
                '}';
    }
}
