package agh.cs.lab9;

import agh.cs.lab9.json.LocalRepresentativeCreator;
import agh.cs.lab9.json.sejmometr.Dataobject;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.neovisionaries.i18n.CountryCode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Sejmometr {
    public final static int availableTerms[] = {7, 8};
    private final int term;
    private SejmometrAPI sejmometrAPI;

    private Map<String, Representative> representatives = new HashMap<String, Representative>();

    public Sejmometr(SejmometrAPI sejmometrAPI, int term) {
        this.term = term;
        this.sejmometrAPI = sejmometrAPI;
        mapAllRepresentatives(sejmometrAPI);
    }

    private void mapAllRepresentatives(SejmometrAPI sejmometrAPI) {
        for (Dataobject dataobject : sejmometrAPI.getDataobject()) {
            int id = dataobject.getId();
            Representative representative = new LocalRepresentativeCreator(id).createRepresentative();
            representatives.put(representative.getName(), representative);
        }
    }

    public Representative getRepresentative(String name) {
        return representatives.get(name);
    }

    public BigDecimal getAverageRepresentativesSpendings(int year) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Representative representative : representatives.values()) {
            try {
                sum = sum.add(representative.countSpendingsInYear(year));
            } catch (NoSpendingsDetailsInYearException e) {
                System.out.println(e.getMessage());
            }
        }
        return sum.divide(new BigDecimal(representatives.size()), 2, RoundingMode.HALF_UP);
    }

    public Representative getRepresentativeWithBiggestNoOfTripsAbroad() {
        Representative result = null;
        int maxNoOfTrips = -1;
        for (Representative representative : representatives.values()) {
            if (representative.getNumberOfTripsAbroad() > maxNoOfTrips) {
                result = representative;
                maxNoOfTrips = representative.getNumberOfTripsAbroad();
            }
        }
        return result;
    }

    public Representative getRepresentativeWithBiggestNoOfTripsInCountry(CountryCode countryCode) {
        Representative result = null;
        int maxNoOfTrips = -1;
        for (Representative representative : representatives.values()) {
            if (representative.getNumberOfTripsInCountry(countryCode) > maxNoOfTrips) {
                result = representative;
                maxNoOfTrips = representative.getNumberOfTripsInCountry(countryCode);
            }
        }
        return result;
    }

    public Representative getRepresentativeWithTheMostExpensiveTrip() {
        Representative result = null;
        double theMostExpensiveTrip = -1.0;
        for (Representative representative : representatives.values()) {
            if (representative.getCostOfTheMostExpensiveTrip() > theMostExpensiveTrip) {
                result = representative;
                theMostExpensiveTrip = representative.getCostOfTheMostExpensiveTrip();
            }
        }
        return result;
    }

    public ArrayList<Representative> getRepresentativesWhoVisitedCountry(CountryCode countryCode) {
        ArrayList<Representative> result = new ArrayList<Representative>();
        for (Representative representative : representatives.values()) {
            if (representative.getNumberOfTripsInCountry(countryCode) > 0) {
                result.add(representative);
            }
        }
        return result;
    }

    public ArrayList<String> getRepresentativesNames() {
        ArrayList<String> representativesNames = new ArrayList<String>();
        for (Representative representative : representatives.values()) {
            representativesNames.add(representative.getName());
        }
        return representativesNames;
    }

    public Representative getRepresentativeWithTheBiggestNumberOfDaysAbroad() {
        Representative result = null;
        double biggestNoOfDaysAbroad = -1.0;
        for (Representative representative : representatives.values()) {
            if (representative.getNumberOfDaysAbroad() > biggestNoOfDaysAbroad) {
                result = representative;
                biggestNoOfDaysAbroad = representative.getNumberOfDaysAbroad();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Sejmometr{" +
                ", representatives=" + representatives +
                '}';
    }
}
