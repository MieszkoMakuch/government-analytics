package agh.cs.lab9.parser;

import agh.cs.lab9.Representative;
import agh.cs.lab9.Sejmometr;
import agh.cs.lab9.json.LocalRepresentativeCreator;
import agh.cs.lab9.json.LocalSejmometrCreator;

import java.util.ArrayList;

/**
 * Created by mieszkomakuch on 23.12.2016.
 */
public class SelectInterpreter extends AbstractInterpreter {

    public SelectInterpreter(ChosenOption chosenOption) {
        super(chosenOption);
    }

    public String interpret() {
        if (this.chosenOption.equals(sumOfSpendingsOfRepresentativeWithSpecifiedName())) {
            Representative representative =
                    new LocalRepresentativeCreator(chosenOption.getRepresentative().getId()).createRepresentative();
            return representative.toStringS() + " spendings in " + chosenOption.getYear() + ": " +
                    String.valueOf(representative.countSpendingsInYear(chosenOption.getYear())) + " zł";
        } else if (this.chosenOption.equals(sumOfOfficeSpendingsOfRepresentativeWithSpecifiedName())) {
            Representative representative =
                    new LocalRepresentativeCreator(chosenOption.getRepresentative().getId()).createRepresentative();
            return representative.toStringS() + " office renovation spendings in " + chosenOption.getYear() + ": " +
                    String.valueOf(representative.getOfficeRenovationSpendings(chosenOption.getYear())) + " zł";
        } else if (this.chosenOption.equals(avgSpendingsIn2013())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
            return "Average representatives spendings in " + chosenOption.getYear() + ": "
                    + sejmometr.getAverageRepresentativesSpendings(chosenOption.getYear()) + " zł";
        } else if (this.chosenOption.equals(representativeWithMaxTrips())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithBiggestNoOfTripsAbroad();
            return "Representative with the biggest number of trips: " +
                    representative.toString() + " (Number of trips: " + representative.getNumberOfTripsAbroad() + ")";
        } else if (this.chosenOption.equals(representativeWithBiggestNoOfDaysAbroad())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithTheBiggestNumberOfDaysAbroad();
            return "Representative with the biggest number of days abroad: " +
                    representative.toString() +
                    " (Number of days abroad: " + representative.getNumberOfDaysAbroad() + ")";
        } else if (this.chosenOption.equals(representativeWithTheMostExpensiveTrip())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithTheMostExpensiveTrip();
            return "Representative with the most expensive trip: " + representative.toString() +
                    " (Chost of the trip: " + representative.getCostOfTheMostExpensiveTrip() + " zł)";
        } else if (this.chosenOption.equals(representativesVisitedCountry())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            ArrayList<Representative> representatives =
                    sejmometr.getRepresentativesWhoVisitedCountry(chosenOption.getCountryCode());
            return "Representatives who visited " + chosenOption.getCountryCode().getName() + " in "
                    + chosenOption.getTerm() + " term: " + representatives;
        } else {
            throw new IllegalArgumentException("Unknown chosenOption: " + chosenOption.toString());
        }
    }

    //example: "select „Jarosław Kaczyński” spendings in 2013"
    private ChosenOption sumOfSpendingsOfRepresentativeWithSpecifiedName() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.ALL);
        return chosenOption;
    }

    //example: "select „Jarosław Kaczyński” office spendings in 2013"
    private ChosenOption sumOfOfficeSpendingsOfRepresentativeWithSpecifiedName() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS.OFFICE);
        return chosenOption;
    }

    //example: "select avg spendings in 2013"
    private ChosenOption avgSpendingsIn2013() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setAggregate(Aggregates.AVG);
        return chosenOption;
    }

    //example: "select representative with max trips"
    private ChosenOption representativeWithMaxTrips() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TRIPS);
        chosenOption.setAggregate(Aggregates.MaxNUMBER);
        return chosenOption;
    }

    //example: "select representative with the longest trips term 7"
    private ChosenOption representativeWithBiggestNoOfDaysAbroad() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TRIPS);
        chosenOption.setAggregate(Aggregates.MaxLength);
        return chosenOption;
    }

    //example: "select representative with the most expensive trip term 7"
    private ChosenOption representativeWithTheMostExpensiveTrip() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TRIPS);
        chosenOption.setAggregate(Aggregates.MaxCOST);
        return chosenOption;
    }

    //example: "select representatives who visited Italy term 7"
    private ChosenOption representativesVisitedCountry() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.SELECT);
        chosenOption.setRepresentativeDetails(RepresentativesDetails.TripsToCOUNTRY);
        return chosenOption;
    }

}
