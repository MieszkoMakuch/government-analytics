package agh.cs.lab9.parser;

import agh.cs.lab9.Representative;
import com.neovisionaries.i18n.CountryCode;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class ChosenOption {
    private Statements statement = null;
    private RepresentativesDetails representativeDetails = null;
    private RepresentativesDetails.SPENDINGS representativeDetailsSpendings = null;
    private Aggregates aggregate = null;

    private Representative representative = null;
    private int year = -1;
    private int term = -1;
    private CountryCode countryCode = null;

    private UpdateSets updateSet = null;

    public ChosenOption() {
    }

    public Statements getStatement() {
        return statement;
    }

    public void setStatement(Statements statement) {
        this.statement = statement;
    }

    public RepresentativesDetails getRepresentativeDetails() {
        return representativeDetails;
    }

    public void setRepresentativeDetails(RepresentativesDetails representativeDetails) {
        this.representativeDetails = representativeDetails;
    }

    public RepresentativesDetails.SPENDINGS getRepresentativeDetailsSpendings() {
        return representativeDetailsSpendings;
    }

    public void setRepresentativeDetailsSpendings(RepresentativesDetails.SPENDINGS representativeDetailsSpendings) {
        this.representativeDetailsSpendings = representativeDetailsSpendings;
    }

    public Aggregates getAggregate() {
        return aggregate;
    }

    public void setAggregate(Aggregates aggregate) {
        this.aggregate = aggregate;
    }

    public Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public UpdateSets getUpdateSet() {
        return updateSet;
    }

    public void setUpdateSet(UpdateSets updateSet) {
        this.updateSet = updateSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChosenOption that = (ChosenOption) o;

        if (statement != that.statement) return false;
        if (representativeDetails != that.representativeDetails) return false;
        if (representativeDetailsSpendings != that.representativeDetailsSpendings) return false;
        if (aggregate != that.aggregate) return false;
        return updateSet == that.updateSet;
    }

    @Override
    public int hashCode() {
        int result = statement != null ? statement.hashCode() : 0;
        result = 31 * result + (representativeDetails != null ? representativeDetails.hashCode() : 0);
        result = 31 * result + (representativeDetailsSpendings != null ? representativeDetailsSpendings.hashCode() : 0);
        result = 31 * result + (aggregate != null ? aggregate.hashCode() : 0);
        result = 31 * result + (updateSet != null ? updateSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChosenOption{" +
                "statement=" + statement +
                ", representativeDetails=" + representativeDetails +
                ", representativeDetailsSpendings=" + representativeDetailsSpendings +
                ", aggregate=" + aggregate +
                ", representative=" + representative +
                ", year=" + year +
                ", term=" + term +
                ", countryCode=" + countryCode +
                ", updateSet=" + updateSet +
                '}';
    }
}
