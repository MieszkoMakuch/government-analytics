
package agh.cs.lab9.json.representative.trips;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "country_code",
    "delegacja",
    "kraj",
    "miasto",
    "id",
    "wniosek_nr",
    "liczba_dni",
    "od",
    "do",
    "koszt_transport",
    "koszt_dieta",
    "koszt_hotel",
    "koszt_dojazd",
    "koszt_ubezpieczenie",
    "koszt_fundusz",
    "koszt_kurs",
    "koszt_zaliczki",
    "koszt_suma"
})
public class Wyjazdy {

    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("delegacja")
    private String delegacja;
    @JsonProperty("kraj")
    private String kraj;
    @JsonProperty("miasto")
    private String miasto;
    @JsonProperty("id")
    private String id;
    @JsonProperty("wniosek_nr")
    private String wniosekNr;
    @JsonProperty("liczba_dni")
    private String liczbaDni;
    @JsonProperty("od")
    private String od;
    @JsonProperty("do")
    private String _do;
    @JsonProperty("koszt_transport")
    private String kosztTransport;
    @JsonProperty("koszt_dieta")
    private String kosztDieta;
    @JsonProperty("koszt_hotel")
    private String kosztHotel;
    @JsonProperty("koszt_dojazd")
    private String kosztDojazd;
    @JsonProperty("koszt_ubezpieczenie")
    private String kosztUbezpieczenie;
    @JsonProperty("koszt_fundusz")
    private String kosztFundusz;
    @JsonProperty("koszt_kurs")
    private String kosztKurs;
    @JsonProperty("koszt_zaliczki")
    private String kosztZaliczki;
    @JsonProperty("koszt_suma")
    private String kosztSuma;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("delegacja")
    public String getDelegacja() {
        return delegacja;
    }

    @JsonProperty("delegacja")
    public void setDelegacja(String delegacja) {
        this.delegacja = delegacja;
    }

    @JsonProperty("kraj")
    public String getKraj() {
        return kraj;
    }

    @JsonProperty("kraj")
    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @JsonProperty("miasto")
    public String getMiasto() {
        return miasto;
    }

    @JsonProperty("miasto")
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("wniosek_nr")
    public String getWniosekNr() {
        return wniosekNr;
    }

    @JsonProperty("wniosek_nr")
    public void setWniosekNr(String wniosekNr) {
        this.wniosekNr = wniosekNr;
    }

    @JsonProperty("liczba_dni")
    public String getLiczbaDni() {
        return liczbaDni;
    }

    @JsonProperty("liczba_dni")
    public void setLiczbaDni(String liczbaDni) {
        this.liczbaDni = liczbaDni;
    }

    @JsonProperty("od")
    public String getOd() {
        return od;
    }

    @JsonProperty("od")
    public void setOd(String od) {
        this.od = od;
    }

    @JsonProperty("do")
    public String getDo() {
        return _do;
    }

    @JsonProperty("do")
    public void setDo(String _do) {
        this._do = _do;
    }

    @JsonProperty("koszt_transport")
    public String getKosztTransport() {
        return kosztTransport;
    }

    @JsonProperty("koszt_transport")
    public void setKosztTransport(String kosztTransport) {
        this.kosztTransport = kosztTransport;
    }

    @JsonProperty("koszt_dieta")
    public String getKosztDieta() {
        return kosztDieta;
    }

    @JsonProperty("koszt_dieta")
    public void setKosztDieta(String kosztDieta) {
        this.kosztDieta = kosztDieta;
    }

    @JsonProperty("koszt_hotel")
    public String getKosztHotel() {
        return kosztHotel;
    }

    @JsonProperty("koszt_hotel")
    public void setKosztHotel(String kosztHotel) {
        this.kosztHotel = kosztHotel;
    }

    @JsonProperty("koszt_dojazd")
    public String getKosztDojazd() {
        return kosztDojazd;
    }

    @JsonProperty("koszt_dojazd")
    public void setKosztDojazd(String kosztDojazd) {
        this.kosztDojazd = kosztDojazd;
    }

    @JsonProperty("koszt_ubezpieczenie")
    public String getKosztUbezpieczenie() {
        return kosztUbezpieczenie;
    }

    @JsonProperty("koszt_ubezpieczenie")
    public void setKosztUbezpieczenie(String kosztUbezpieczenie) {
        this.kosztUbezpieczenie = kosztUbezpieczenie;
    }

    @JsonProperty("koszt_fundusz")
    public String getKosztFundusz() {
        return kosztFundusz;
    }

    @JsonProperty("koszt_fundusz")
    public void setKosztFundusz(String kosztFundusz) {
        this.kosztFundusz = kosztFundusz;
    }

    @JsonProperty("koszt_kurs")
    public String getKosztKurs() {
        return kosztKurs;
    }

    @JsonProperty("koszt_kurs")
    public void setKosztKurs(String kosztKurs) {
        this.kosztKurs = kosztKurs;
    }

    @JsonProperty("koszt_zaliczki")
    public String getKosztZaliczki() {
        return kosztZaliczki;
    }

    @JsonProperty("koszt_zaliczki")
    public void setKosztZaliczki(String kosztZaliczki) {
        this.kosztZaliczki = kosztZaliczki;
    }

    @JsonProperty("koszt_suma")
    public String getKosztSuma() {
        return kosztSuma;
    }

    @JsonProperty("koszt_suma")
    public void setKosztSuma(String kosztSuma) {
        this.kosztSuma = kosztSuma;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
