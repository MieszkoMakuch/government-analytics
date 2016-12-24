package agh.cs.lab9.json.representative.spendings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Wydatki {

    @SerializedName("liczba_pol")
    @Expose
    private Integer liczbaPol;
    @SerializedName("liczba_rocznikow")
    @Expose
    private Integer liczbaRocznikow;
    @SerializedName("punkty")
    @Expose
    private List<Punkty> punkty = null;
    @SerializedName("roczniki")
    @Expose
    private List<Roczniki> roczniki = null;

    public Integer getLiczbaPol() {
        return liczbaPol;
    }

    public void setLiczbaPol(Integer liczbaPol) {
        this.liczbaPol = liczbaPol;
    }

    public Integer getLiczbaRocznikow() {
        return liczbaRocznikow;
    }

    public void setLiczbaRocznikow(Integer liczbaRocznikow) {
        this.liczbaRocznikow = liczbaRocznikow;
    }

    public List<Punkty> getPunkty() {
        return punkty;
    }

    public void setPunkty(List<Punkty> punkty) {
        this.punkty = punkty;
    }

    public List<Roczniki> getRoczniki() {
        return roczniki;
    }

    public void setRoczniki(List<Roczniki> roczniki) {
        this.roczniki = roczniki;
    }

    @Override
    public String toString() {
        return "Wydatki{" +
                "liczbaPol=" + liczbaPol +
                ", liczbaRocznikow=" + liczbaRocznikow +
                ", punkty=" + punkty +
                ", roczniki=" + roczniki +
                '}';
    }
}
