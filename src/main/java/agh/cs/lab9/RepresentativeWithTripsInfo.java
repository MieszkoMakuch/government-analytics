package agh.cs.lab9;

import agh.cs.lab9.json.representative.RepresentativeAPI;
import agh.cs.lab9.json.representative.spendings.RepresentativeSpendingsAPI;
import agh.cs.lab9.json.representative.trips.RepresentativeTripsAPI;
import agh.cs.lab9.json.representative.trips.Wyjazdy;
import com.neovisionaries.i18n.CountryCode;

/**
 * Created by mieszkomakuch on 16.12.2016.
 */
public class RepresentativeWithTripsInfo extends Representative{

    protected final RepresentativeTripsAPI representativeTripsAPI;

    public RepresentativeWithTripsInfo(RepresentativeAPI representativeAPI,
                                       RepresentativeTripsAPI representativeTripsAPI,
                                       RepresentativeSpendingsAPI representativeSpendingsAPI) {
        super(representativeAPI, representativeSpendingsAPI);
        this.representativeTripsAPI = representativeTripsAPI;
    }

    @Override
    public int getNumberOfTripsAbroad() {
        return  this.numberOfTrips;
    }

    @Override
    public int getNumberOfTripsInCountry(CountryCode countryCode) {
        super.getNumberOfTripsInCountry(countryCode);
        int numberOfTravelsAbroad = 0;
        for (Wyjazdy wyjazd : representativeTripsAPI.getLayers().getWyjazdy()) {
            if(wyjazd.getCountryCode().equals(countryCode)) {
                numberOfTravelsAbroad++;
            }
        }
        return numberOfTravelsAbroad;
    }

    @Override
    public int getNumberOfDaysAbroad() {
        super.getNumberOfDaysAbroad();
        int numberOfDaysAbroad = 0;
        for (Wyjazdy wyjazd : representativeTripsAPI.getLayers().getWyjazdy()) {
            numberOfDaysAbroad += wyjazd.getLiczbaDni();
        }
        return numberOfDaysAbroad;
    }

    @Override
    protected int numberOfTripsWithMissingDetails() {
        return  representativeTripsAPI.getData().getPoslowieLiczbaWyjazdow() -
                representativeTripsAPI.getLayers().getWyjazdy().size();
    }

    @Override
    public Double getCostOfTheMostExpensiveTrip() {
        super.getCostOfTheMostExpensiveTrip();
        double maxCost = 0;
        for (Wyjazdy wyjazd : representativeTripsAPI.getLayers().getWyjazdy()) {
            if(wyjazd.getKosztSuma() > maxCost) {
                maxCost = wyjazd.getKosztSuma();
            }
        }
        return maxCost;
    }
}
