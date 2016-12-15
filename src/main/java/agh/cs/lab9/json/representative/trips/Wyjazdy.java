
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private String liczbaDni;
    @SerializedName("od")
    @Expose
    private String od;
    @SerializedName("do")
    @Expose
    private String _do;
    @SerializedName("koszt_transport")
    @Expose
    private String kosztTransport;
    @SerializedName("koszt_dieta")
    @Expose
    private String kosztDieta;
    @SerializedName("koszt_hotel")
    @Expose
    private String kosztHotel;
    @SerializedName("koszt_dojazd")
    @Expose
    private String kosztDojazd;
    @SerializedName("koszt_ubezpieczenie")
    @Expose
    private String kosztUbezpieczenie;
    @SerializedName("koszt_fundusz")
    @Expose
    private String kosztFundusz;
    @SerializedName("koszt_kurs")
    @Expose
    private String kosztKurs;
    @SerializedName("koszt_zaliczki")
    @Expose
    private String kosztZaliczki;
    @SerializedName("koszt_suma")
    @Expose
    private String kosztSuma;

    public String getCountryCode() {
        return countryCode;
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

    public String getLiczbaDni() {
        return liczbaDni;
    }

    public void setLiczbaDni(String liczbaDni) {
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

    public String getKosztTransport() {
        return kosztTransport;
    }

    public void setKosztTransport(String kosztTransport) {
        this.kosztTransport = kosztTransport;
    }

    public String getKosztDieta() {
        return kosztDieta;
    }

    public void setKosztDieta(String kosztDieta) {
        this.kosztDieta = kosztDieta;
    }

    public String getKosztHotel() {
        return kosztHotel;
    }

    public void setKosztHotel(String kosztHotel) {
        this.kosztHotel = kosztHotel;
    }

    public String getKosztDojazd() {
        return kosztDojazd;
    }

    public void setKosztDojazd(String kosztDojazd) {
        this.kosztDojazd = kosztDojazd;
    }

    public String getKosztUbezpieczenie() {
        return kosztUbezpieczenie;
    }

    public void setKosztUbezpieczenie(String kosztUbezpieczenie) {
        this.kosztUbezpieczenie = kosztUbezpieczenie;
    }

    public String getKosztFundusz() {
        return kosztFundusz;
    }

    public void setKosztFundusz(String kosztFundusz) {
        this.kosztFundusz = kosztFundusz;
    }

    public String getKosztKurs() {
        return kosztKurs;
    }

    public void setKosztKurs(String kosztKurs) {
        this.kosztKurs = kosztKurs;
    }

    public String getKosztZaliczki() {
        return kosztZaliczki;
    }

    public void setKosztZaliczki(String kosztZaliczki) {
        this.kosztZaliczki = kosztZaliczki;
    }

    public String getKosztSuma() {
        return kosztSuma;
    }

    public void setKosztSuma(String kosztSuma) {
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
