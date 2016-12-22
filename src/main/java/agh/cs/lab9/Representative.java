package agh.cs.lab9;

import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.spendings.Roczniki;
import com.neovisionaries.i18n.CountryCode;

import java.util.List;

/**
 * Created by mieszkomakuch on 10.12.2016.
 */
public class Representative {

    protected final int id;
    protected final String name;
    protected int numberOfTrips;
    protected final RepresentativeAPI representativeAPI;
    protected final RepresentativeSpendingsAPI representativeSpendingsAPI;

    public Representative(RepresentativeAPI representativeAPI, RepresentativeSpendingsAPI representativeSpendingsAPI) {
        this.id = representativeAPI.getId();
        this.name = representativeAPI.getData().getPoslowieNazwa();
        this.numberOfTrips = representativeAPI.getData().getPoslowieLiczbaWyjazdow();
        this.representativeAPI = representativeAPI;
        this.representativeSpendingsAPI = representativeSpendingsAPI;
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

    private Roczniki getYearSpendingsFromInt (int year) throws IllegalArgumentException{
        List<Roczniki> yearsSpendingList = representativeSpendingsAPI.getLayers().getWydatki().getRoczniki();
        for (Roczniki rocznik : yearsSpendingList) {
            if (rocznik.getRok() == year) return rocznik;
        }
        throw new NoSpendingsDetailsInYearException("Information about spendings in year " + year + " is not available " +
                "(name: " + name + "id=" + id + ")");
    }

    public double getOfficeRenovationSpendings (int year) {
        return getYearSpendingsFromInt(year).getPola().get(12);
    }

    public int getNumberOfTripsAbroad() {
        return numberOfTrips;
    }

    public int getNumberOfTripsInCountry(CountryCode countryCode) {
        if(this.numberOfTripsWithMissingDetails() > 0){
            System.out.println(missingTripInformationMessage() +
                    " assuming that none of those tips took place in " + countryCode.getName() + ".");
        }
        return 0;
    }

    public int getNumberOfDaysAbroad() {
        if(this.numberOfTripsWithMissingDetails() > 0){
            System.out.println(missingTripInformationMessage() + " assuming that those trip(s) had 0 days.");
        }
        return 0;
    }

    public Double getCostOfTheMostExpensiveTrip() {
        if(this.numberOfTripsWithMissingDetails() > 0){
            System.out.println(missingTripInformationMessage() + " assuming that those trip(s) cost 0 zł.");
        }
        return 0.0;
    }

    protected int numberOfTripsWithMissingDetails(){
        return this.numberOfTrips;
    }

    protected String missingTripInformationMessage(){
        return "Missing information about " + numberOfTripsWithMissingDetails() + " trip(s) (name: " + name
                + ", id: " + id + ")";
    }


    @Override
    public String toString() {
        return "Representative{" +
                "representativeAPI=" + representativeAPI +
                ", representativeSpendingsAPI=" + representativeSpendingsAPI +
                '}';
    }
}
