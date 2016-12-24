package agh.cs.lab9;

import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.spendings.Roczniki;
import com.neovisionaries.i18n.CountryCode;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mieszkomakuch on 10.12.2016.
 */
public class Representative {

    protected final int id;
    protected final String name;
    protected final RepresentativeAPI representativeAPI;
    protected final RepresentativeSpendingsAPI representativeSpendingsAPI;
    protected int numberOfTrips;

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

    public BigDecimal countSpendingsInYear(int year) {
        Roczniki rocznik = getYearSpendingsFromInt(year);
        BigDecimal result = new BigDecimal(0.00);
        for (BigDecimal spend : rocznik.getPola()) {
            result = result.add(spend);
        }
        return result;
    }

    private Roczniki getYearSpendingsFromInt(int year) throws IllegalArgumentException {
        List<Roczniki> yearsSpendingList = representativeSpendingsAPI.getLayers().getWydatki().getRoczniki();
        for (Roczniki rocznik : yearsSpendingList) {
            if (rocznik.getRok() == year) return rocznik;
        }
        throw new NoSpendingsDetailsInYearException("Information about spendings in year " + year + " is not available " +
                "(name: " + name + ", id=" + id + ")");
    }

    public BigDecimal getOfficeRenovationSpendings(int year) {
        return getYearSpendingsFromInt(year).getPola().get(12);
    }

    public int getNumberOfTripsAbroad() {
        return numberOfTrips;
    }

    public int getNumberOfTripsInCountry(CountryCode countryCode) {
        if (this.numberOfTripsWithMissingDetails() > 0) {
            System.out.println(missingTripInformationMessage() +
                    " Assuming that none of those tips took place in " + countryCode.getName() + ".");
        }
        return 0;
    }

    public int getNumberOfDaysAbroad() {
        if (this.numberOfTripsWithMissingDetails() > 0) {
            System.out.println(missingTripInformationMessage() + " Assuming that those trip(s) had 0 days.");
        }
        return 0;
    }

    public Double getCostOfTheMostExpensiveTrip() {
        if (this.numberOfTripsWithMissingDetails() > 0) {
            System.out.println(missingTripInformationMessage() + " Assuming that those trip(s) cost 0 zł.");
        }
        return 0.0;
    }

    protected int numberOfTripsWithMissingDetails() {
        return this.numberOfTrips;
    }

    protected String missingTripInformationMessage() {
        return "Missing information about " + numberOfTripsWithMissingDetails() + " " + this.toStringS() + " trip(s).";
    }


    @Override
    public String toString() {
        return name + " (id=" + id + ")";
    }

    public String toStringS() {
        return name + "'s (id=" + id + ")";
    }
}
