package agh.cs.lab9;

/**
 * Created by mieszkomakuch on 22.12.2016.
 */
public class ChosenOption {
    private Statements statement = null;
    private RepresentativesDetails representativeDetails = null;
    private RepresentativesDetails.SPENDINGS representativeDetailsSpendings = null;
    private Aggregates aggregate = null;

    private String representativeName = null;
    private int representativeId = -1;
    private int year = -1;
    private int term = -1;

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

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public int getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(int representativeId) {
        this.representativeId = representativeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChosenOption that = (ChosenOption) o;

        if (statement != that.statement) return false;
        if (representativeDetails != that.representativeDetails) return false;
        if (representativeDetailsSpendings != that.representativeDetailsSpendings) return false;
        return aggregate == that.aggregate;
    }

    @Override
    public int hashCode() {
        int result = statement != null ? statement.hashCode() : 0;
        result = 31 * result + (representativeDetails != null ? representativeDetails.hashCode() : 0);
        result = 31 * result + (representativeDetailsSpendings != null ? representativeDetailsSpendings.hashCode() : 0);
        result = 31 * result + (aggregate != null ? aggregate.hashCode() : 0);
        return result;
    }
}
