
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.neovisionaries.i18n.CountryCode;

public class Wyjazdy {

    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("delegacja")
    @Expose
    private String delegacja;
    @SerializedName("kraj")
    @Expose
    private String kraj;
    @SerializedName("miasto")
    @Expose
    private String miasto;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("wniosek_nr")
    @Expose
    private String wniosekNr;
    @SerializedName("liczba_dni")
    @Expose
    private int liczbaDni;
    @SerializedName("od")
    @Expose
    private String od;
    @SerializedName("do")
    @Expose
    private String _do;
    @SerializedName("koszt_transport")
    @Expose
    private Double kosztTransport;
    @SerializedName("koszt_dieta")
    @Expose
    private Double kosztDieta;
    @SerializedName("koszt_hotel")
    @Expose
    private Double kosztHotel;
    @SerializedName("koszt_dojazd")
    @Expose
    private Double kosztDojazd;
    @SerializedName("koszt_ubezpieczenie")
    @Expose
    private Double kosztUbezpieczenie;
    @SerializedName("koszt_fundusz")
    @Expose
    private Double kosztFundusz;
    @SerializedName("koszt_kurs")
    @Expose
    private Double kosztKurs;
    @SerializedName("koszt_zaliczki")
    @Expose
    private Double kosztZaliczki;
    @SerializedName("koszt_suma")
    @Expose
    private Double kosztSuma;

    public CountryCode getCountryCode() {
        return CountryCode.getByCode(countryCode);
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDelegacja() {
        return delegacja;
    }

    public void setDelegacja(String delegacja) {
        this.delegacja = delegacja;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWniosekNr() {
        return wniosekNr;
    }

    public void setWniosekNr(String wniosekNr) {
        this.wniosekNr = wniosekNr;
    }

    public int getLiczbaDni() {
        return liczbaDni;
    }

    public void setLiczbaDni(int liczbaDni) {
        this.liczbaDni = liczbaDni;
    }

    public String getOd() {
        return od;
    }

    public void setOd(String od) {
        this.od = od;
    }

    public String getDo() {
        return _do;
    }

    public void setDo(String _do) {
        this._do = _do;
    }

    public Double getKosztTransport() {
        return kosztTransport;
    }

    public void setKosztTransport(Double kosztTransport) {
        this.kosztTransport = kosztTransport;
    }

    public Double getKosztDieta() {
        return kosztDieta;
    }

    public void setKosztDieta(Double kosztDieta) {
        this.kosztDieta = kosztDieta;
    }

    public Double getKosztHotel() {
        return kosztHotel;
    }

    public void setKosztHotel(Double kosztHotel) {
        this.kosztHotel = kosztHotel;
    }

    public Double getKosztDojazd() {
        return kosztDojazd;
    }

    public void setKosztDojazd(Double kosztDojazd) {
        this.kosztDojazd = kosztDojazd;
    }

    public Double getKosztUbezpieczenie() {
        return kosztUbezpieczenie;
    }

    public void setKosztUbezpieczenie(Double kosztUbezpieczenie) {
        this.kosztUbezpieczenie = kosztUbezpieczenie;
    }

    public Double getKosztFundusz() {
        return kosztFundusz;
    }

    public void setKosztFundusz(Double kosztFundusz) {
        this.kosztFundusz = kosztFundusz;
    }

    public Double getKosztKurs() {
        return kosztKurs;
    }

    public void setKosztKurs(Double kosztKurs) {
        this.kosztKurs = kosztKurs;
    }

    public Double getKosztZaliczki() {
        return kosztZaliczki;
    }

    public void setKosztZaliczki(Double kosztZaliczki) {
        this.kosztZaliczki = kosztZaliczki;
    }

    public Double getKosztSuma() {
        return kosztSuma;
    }

    public void setKosztSuma(Double kosztSuma) {
        this.kosztSuma = kosztSuma;
    }

    @Override
    public String toString() {
        return "Wyjazdy{" +
                "countryCode='" + countryCode + '\'' +
                ", delegacja='" + delegacja + '\'' +
                ", kraj='" + kraj + '\'' +
                ", miasto='" + miasto + '\'' +
                ", id='" + id + '\'' +
                ", wniosekNr='" + wniosekNr + '\'' +
                ", liczbaDni='" + liczbaDni + '\'' +
                ", od='" + od + '\'' +
                ", _do='" + _do + '\'' +
                ", kosztTransport='" + kosztTransport + '\'' +
                ", kosztDieta='" + kosztDieta + '\'' +
                ", kosztHotel='" + kosztHotel + '\'' +
                ", kosztDojazd='" + kosztDojazd + '\'' +
                ", kosztUbezpieczenie='" + kosztUbezpieczenie + '\'' +
                ", kosztFundusz='" + kosztFundusz + '\'' +
                ", kosztKurs='" + kosztKurs + '\'' +
                ", kosztZaliczki='" + kosztZaliczki + '\'' +
                ", kosztSuma='" + kosztSuma + '\'' +
                '}';
    }
}
