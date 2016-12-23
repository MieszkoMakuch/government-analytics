package agh.cs.lab9;

import agh.cs.lab9.json.LocalRepresentativeCreator;
import agh.cs.lab9.json.LocalSejmometrCreator;

/**
 * Created by mieszkomakuch on 23.12.2016.
 */
public class ChosenOptionInterpreter {
    ChosenOption chosenOption;

    public ChosenOptionInterpreter(ChosenOption chosenOption) {
        this.chosenOption = chosenOption;
    }

    public String interpret(){
        if(this.chosenOption.equals(sumOfSpendingsOfRepresentativeWithSpecifiedName())){
            Representative representative =
                    new LocalRepresentativeCreator(chosenOption.getRepresentativeId()).createRepresentative();
            return  representative.getName() + "'s (id=" + representative.getId() + ") spendings in " +
                    chosenOption.getYear() + ": " +
                    String.valueOf(representative.countSpendingsInYear(chosenOption.getYear())) + " zł";
        } else if (this.chosenOption.equals(sumOfOfficeSpendingsOfRepresentativeWithSpecifiedName())){
            Representative representative =
                    new LocalRepresentativeCreator(chosenOption.getRepresentativeId()).createRepresentative();
            return  representative.getName() + "'s (id=" + representative.getId() + ") office renovation spendings in " +
                    chosenOption.getYear() + ": " +
                    String.valueOf(representative.getOfficeRenovationSpendings(chosenOption.getYear())) + " zł";
        } else if (this.chosenOption.equals(avgSpendingsIn2013())){
            Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
            return  "Average representatives spendings in " + chosenOption.getYear() + ": "
                    + sejmometr.getAverageRepresentativesSpendings(chosenOption.getYear()) + " zł";
        } else if (this.chosenOption.equals(representativeWithMaxTrips())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithBiggestNoOfTripsAbroad();
            return "Representative with the biggest number of trips: " +
                    representative.getName() +" (id=" + representative.getId() +
                    ") (Number of trips: " + representative.getNumberOfTripsAbroad() + ")";
        } else if (this.chosenOption.equals(representativeWithBiggestNoOfDaysAbroad())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithTheBiggestNumberOfDaysAbroad();
            return "Representative with the biggest number of days abroad: " +
                    representative.getName() + " (id=" + representative.getId() +
                    ") (Number of days abroad: " + representative.getNumberOfDaysAbroad() + ")";
        } else if (this.chosenOption.equals(representativeWithTheMostExpensiveTrip())) {
            Sejmometr sejmometr = new LocalSejmometrCreator(chosenOption.getTerm()).createSejmometr();
            Representative representative = sejmometr.getRepresentativeWithTheMostExpensiveTrip();
            return "Representative with the most expensive trip: " +
                    representative.getName() + " (id=" + representative.getId() +
                    ") (Chost of the trip: " + representative.getCostOfTheMostExpensiveTrip() + " zł)";
        }
        return "";
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


}
