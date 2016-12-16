
package agh.cs.lab9.json.representative.spendings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "ludzie.id",
    "ludzie.nazwa",
    "ludzie.slug",
    "sejm_kluby.id",
    "sejm_kluby.skrot",
    "sejm_kluby.nazwa",
    "poslowie.wartosc_biuro_inne",
    "poslowie.wartosc_biuro_ekspertyzy",
    "poslowie.wartosc_biuro_materialy_biurowe",
    "poslowie.frekwencja",
    "poslowie.mandat_wygasl",
    "poslowie.wartosc_biuro_taksowki",
    "poslowie.sejm_okreg_id",
    "poslowie.liczba_przelotow",
    "poslowie.wartosc_biuro_zlecenia",
    "poslowie.liczba_projektow_uchwal",
    "poslowie.imiona",
    "poslowie.biuro_html",
    "poslowie.wartosc_biuro_wynagrodzenia_pracownikow",
    "poslowie.numer_legitymacji",
    "poslowie.data_wygasniecia_mandatu",
    "poslowie.imie_pierwsze",
    "poslowie.liczba_glosow",
    "poslowie.procent_glosow",
    "poslowie.pkw_komitet_id",
    "poslowie.wartosc_uposazenia_pln",
    "poslowie.zawod",
    "poslowie.data_urodzenia",
    "poslowie.okreg_gminy_str",
    "poslowie.imie_drugie",
    "poslowie.kadencja_ostatnia",
    "poslowie.wartosc_biuro_spotkania",
    "poslowie.liczba_glosowan_zbuntowanych",
    "poslowie.klub_id",
    "poslowie.liczba_komisji",
    "poslowie.wartosc_wyjazdow",
    "poslowie.zbuntowanie",
    "poslowie.nazwa_odwrocona",
    "poslowie.twitter_account_id",
    "poslowie.wartosc_biuro_przejazdy",
    "poslowie.liczba_glosowan_opuszczonych",
    "poslowie.plec",
    "poslowie.kadencja",
    "poslowie.id",
    "poslowie.wartosc_refundacja_kwater_pln",
    "poslowie.liczba_interpelacji",
    "poslowie.nazwa",
    "poslowie.dopelniacz",
    "poslowie.wartosc_biuro_telekomunikacja",
    "poslowie.liczba_uchwal_komisji_etyki",
    "poslowie.nazwisko",
    "poslowie.wartosc_biuro_biuro",
    "poslowie.miejsce_urodzenia",
    "poslowie.wartosc_biuro_podroze_pracownikow",
    "poslowie.krs_osoba_id",
    "poslowie.liczba_podkomisji",
    "poslowie.liczba_przejazdow",
    "poslowie.numer_na_liscie",
    "poslowie.rozliczenie_id",
    "poslowie.pkw_nr_listy",
    "poslowie.liczba_wyjazdow",
    "poslowie.liczba_wypowiedzi",
    "poslowie.liczba_projektow_ustaw",
    "poslowie.liczba_glosowan",
    "poslowie.liczba_wnioskow",
    "poslowie.miejsce_zamieszkania",
    "poslowie.mowca_id",
    "poslowie.okreg_wyborczy_numer",
    "poslowie.liczba_slow",
    "poslowie.wartosc_biuro_srodki_trwale"
})
public class Data {

    @JsonProperty("ludzie.id")
    private String ludzieId;
    @JsonProperty("ludzie.nazwa")
    private String ludzieNazwa;
    @JsonProperty("ludzie.slug")
    private String ludzieSlug;
    @JsonProperty("sejm_kluby.id")
    private String sejmKlubyId;
    @JsonProperty("sejm_kluby.skrot")
    private String sejmKlubySkrot;
    @JsonProperty("sejm_kluby.nazwa")
    private String sejmKlubyNazwa;
    @JsonProperty("poslowie.wartosc_biuro_inne")
    private Double poslowieWartoscBiuroInne;
    @JsonProperty("poslowie.wartosc_biuro_ekspertyzy")
    private Integer poslowieWartoscBiuroEkspertyzy;
    @JsonProperty("poslowie.wartosc_biuro_materialy_biurowe")
    private Double poslowieWartoscBiuroMaterialyBiurowe;
    @JsonProperty("poslowie.frekwencja")
    private Double poslowieFrekwencja;
    @JsonProperty("poslowie.mandat_wygasl")
    private String poslowieMandatWygasl;
    @JsonProperty("poslowie.wartosc_biuro_taksowki")
    private Integer poslowieWartoscBiuroTaksowki;
    @JsonProperty("poslowie.sejm_okreg_id")
    private String poslowieSejmOkregId;
    @JsonProperty("poslowie.liczba_przelotow")
    private Integer poslowieLiczbaPrzelotow;
    @JsonProperty("poslowie.wartosc_biuro_zlecenia")
    private Double poslowieWartoscBiuroZlecenia;
    @JsonProperty("poslowie.liczba_projektow_uchwal")
    private Integer poslowieLiczbaProjektowUchwal;
    @JsonProperty("poslowie.imiona")
    private String poslowieImiona;
    @JsonProperty("poslowie.biuro_html")
    private String poslowieBiuroHtml;
    @JsonProperty("poslowie.wartosc_biuro_wynagrodzenia_pracownikow")
    private Double poslowieWartoscBiuroWynagrodzeniaPracownikow;
    @JsonProperty("poslowie.numer_legitymacji")
    private Integer poslowieNumerLegitymacji;
    @JsonProperty("poslowie.data_wygasniecia_mandatu")
    private String poslowieDataWygasnieciaMandatu;
    @JsonProperty("poslowie.imie_pierwsze")
    private String poslowieImiePierwsze;
    @JsonProperty("poslowie.liczba_glosow")
    private Integer poslowieLiczbaGlosow;
    @JsonProperty("poslowie.procent_glosow")
    private Double poslowieProcentGlosow;
    @JsonProperty("poslowie.pkw_komitet_id")
    private String poslowiePkwKomitetId;
    @JsonProperty("poslowie.wartosc_uposazenia_pln")
    private Double poslowieWartoscUposazeniaPln;
    @JsonProperty("poslowie.zawod")
    private String poslowieZawod;
    @JsonProperty("poslowie.data_urodzenia")
    private String poslowieDataUrodzenia;
    @JsonProperty("poslowie.okreg_gminy_str")
    private String poslowieOkregGminyStr;
    @JsonProperty("poslowie.imie_drugie")
    private String poslowieImieDrugie;
    @JsonProperty("poslowie.kadencja_ostatnia")
    private String poslowieKadencjaOstatnia;
    @JsonProperty("poslowie.wartosc_biuro_spotkania")
    private Integer poslowieWartoscBiuroSpotkania;
    @JsonProperty("poslowie.liczba_glosowan_zbuntowanych")
    private Integer poslowieLiczbaGlosowanZbuntowanych;
    @JsonProperty("poslowie.klub_id")
    private String poslowieKlubId;
    @JsonProperty("poslowie.liczba_komisji")
    private Integer poslowieLiczbaKomisji;
    @JsonProperty("poslowie.wartosc_wyjazdow")
    private Integer poslowieWartoscWyjazdow;
    @JsonProperty("poslowie.zbuntowanie")
    private Double poslowieZbuntowanie;
    @JsonProperty("poslowie.nazwa_odwrocona")
    private String poslowieNazwaOdwrocona;
    @JsonProperty("poslowie.twitter_account_id")
    private String poslowieTwitterAccountId;
    @JsonProperty("poslowie.wartosc_biuro_przejazdy")
    private Double poslowieWartoscBiuroPrzejazdy;
    @JsonProperty("poslowie.liczba_glosowan_opuszczonych")
    private Integer poslowieLiczbaGlosowanOpuszczonych;
    @JsonProperty("poslowie.plec")
    private String poslowiePlec;
    @JsonProperty("poslowie.kadencja")
    private List<Integer> poslowieKadencja = null;
    @JsonProperty("poslowie.id")
    private String poslowieId;
    @JsonProperty("poslowie.wartosc_refundacja_kwater_pln")
    private Integer poslowieWartoscRefundacjaKwaterPln;
    @JsonProperty("poslowie.liczba_interpelacji")
    private Integer poslowieLiczbaInterpelacji;
    @JsonProperty("poslowie.nazwa")
    private String poslowieNazwa;
    @JsonProperty("poslowie.dopelniacz")
    private String poslowieDopelniacz;
    @JsonProperty("poslowie.wartosc_biuro_telekomunikacja")
    private Double poslowieWartoscBiuroTelekomunikacja;
    @JsonProperty("poslowie.liczba_uchwal_komisji_etyki")
    private Integer poslowieLiczbaUchwalKomisjiEtyki;
    @JsonProperty("poslowie.nazwisko")
    private String poslowieNazwisko;
    @JsonProperty("poslowie.wartosc_biuro_biuro")
    private Double poslowieWartoscBiuroBiuro;
    @JsonProperty("poslowie.miejsce_urodzenia")
    private String poslowieMiejsceUrodzenia;
    @JsonProperty("poslowie.wartosc_biuro_podroze_pracownikow")
    private Double poslowieWartoscBiuroPodrozePracownikow;
    @JsonProperty("poslowie.krs_osoba_id")
    private String poslowieKrsOsobaId;
    @JsonProperty("poslowie.liczba_podkomisji")
    private Integer poslowieLiczbaPodkomisji;
    @JsonProperty("poslowie.liczba_przejazdow")
    private Integer poslowieLiczbaPrzejazdow;
    @JsonProperty("poslowie.numer_na_liscie")
    private Integer poslowieNumerNaLiscie;
    @JsonProperty("poslowie.rozliczenie_id")
    private String poslowieRozliczenieId;
    @JsonProperty("poslowie.pkw_nr_listy")
    private String poslowiePkwNrListy;
    @JsonProperty("poslowie.liczba_wyjazdow")
    private Integer poslowieLiczbaWyjazdow;
    @JsonProperty("poslowie.liczba_wypowiedzi")
    private Integer poslowieLiczbaWypowiedzi;
    @JsonProperty("poslowie.liczba_projektow_ustaw")
    private Integer poslowieLiczbaProjektowUstaw;
    @JsonProperty("poslowie.liczba_glosowan")
    private Integer poslowieLiczbaGlosowan;
    @JsonProperty("poslowie.liczba_wnioskow")
    private Integer poslowieLiczbaWnioskow;
    @JsonProperty("poslowie.miejsce_zamieszkania")
    private String poslowieMiejsceZamieszkania;
    @JsonProperty("poslowie.mowca_id")
    private String poslowieMowcaId;
    @JsonProperty("poslowie.okreg_wyborczy_numer")
    private String poslowieOkregWyborczyNumer;
    @JsonProperty("poslowie.liczba_slow")
    private Integer poslowieLiczbaSlow;
    @JsonProperty("poslowie.wartosc_biuro_srodki_trwale")
    private Integer poslowieWartoscBiuroSrodkiTrwale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ludzie.id")
    public String getLudzieId() {
        return ludzieId;
    }

    @JsonProperty("ludzie.id")
    public void setLudzieId(String ludzieId) {
        this.ludzieId = ludzieId;
    }

    @JsonProperty("ludzie.nazwa")
    public String getLudzieNazwa() {
        return ludzieNazwa;
    }

    @JsonProperty("ludzie.nazwa")
    public void setLudzieNazwa(String ludzieNazwa) {
        this.ludzieNazwa = ludzieNazwa;
    }

    @JsonProperty("ludzie.slug")
    public String getLudzieSlug() {
        return ludzieSlug;
    }

    @JsonProperty("ludzie.slug")
    public void setLudzieSlug(String ludzieSlug) {
        this.ludzieSlug = ludzieSlug;
    }

    @JsonProperty("sejm_kluby.id")
    public String getSejmKlubyId() {
        return sejmKlubyId;
    }

    @JsonProperty("sejm_kluby.id")
    public void setSejmKlubyId(String sejmKlubyId) {
        this.sejmKlubyId = sejmKlubyId;
    }

    @JsonProperty("sejm_kluby.skrot")
    public String getSejmKlubySkrot() {
        return sejmKlubySkrot;
    }

    @JsonProperty("sejm_kluby.skrot")
    public void setSejmKlubySkrot(String sejmKlubySkrot) {
        this.sejmKlubySkrot = sejmKlubySkrot;
    }

    @JsonProperty("sejm_kluby.nazwa")
    public String getSejmKlubyNazwa() {
        return sejmKlubyNazwa;
    }

    @JsonProperty("sejm_kluby.nazwa")
    public void setSejmKlubyNazwa(String sejmKlubyNazwa) {
        this.sejmKlubyNazwa = sejmKlubyNazwa;
    }

    @JsonProperty("poslowie.wartosc_biuro_inne")
    public Double getPoslowieWartoscBiuroInne() {
        return poslowieWartoscBiuroInne;
    }

    @JsonProperty("poslowie.wartosc_biuro_inne")
    public void setPoslowieWartoscBiuroInne(Double poslowieWartoscBiuroInne) {
        this.poslowieWartoscBiuroInne = poslowieWartoscBiuroInne;
    }

    @JsonProperty("poslowie.wartosc_biuro_ekspertyzy")
    public Integer getPoslowieWartoscBiuroEkspertyzy() {
        return poslowieWartoscBiuroEkspertyzy;
    }

    @JsonProperty("poslowie.wartosc_biuro_ekspertyzy")
    public void setPoslowieWartoscBiuroEkspertyzy(Integer poslowieWartoscBiuroEkspertyzy) {
        this.poslowieWartoscBiuroEkspertyzy = poslowieWartoscBiuroEkspertyzy;
    }

    @JsonProperty("poslowie.wartosc_biuro_materialy_biurowe")
    public Double getPoslowieWartoscBiuroMaterialyBiurowe() {
        return poslowieWartoscBiuroMaterialyBiurowe;
    }

    @JsonProperty("poslowie.wartosc_biuro_materialy_biurowe")
    public void setPoslowieWartoscBiuroMaterialyBiurowe(Double poslowieWartoscBiuroMaterialyBiurowe) {
        this.poslowieWartoscBiuroMaterialyBiurowe = poslowieWartoscBiuroMaterialyBiurowe;
    }

    @JsonProperty("poslowie.frekwencja")
    public Double getPoslowieFrekwencja() {
        return poslowieFrekwencja;
    }

    @JsonProperty("poslowie.frekwencja")
    public void setPoslowieFrekwencja(Double poslowieFrekwencja) {
        this.poslowieFrekwencja = poslowieFrekwencja;
    }

    @JsonProperty("poslowie.mandat_wygasl")
    public String getPoslowieMandatWygasl() {
        return poslowieMandatWygasl;
    }

    @JsonProperty("poslowie.mandat_wygasl")
    public void setPoslowieMandatWygasl(String poslowieMandatWygasl) {
        this.poslowieMandatWygasl = poslowieMandatWygasl;
    }

    @JsonProperty("poslowie.wartosc_biuro_taksowki")
    public Integer getPoslowieWartoscBiuroTaksowki() {
        return poslowieWartoscBiuroTaksowki;
    }

    @JsonProperty("poslowie.wartosc_biuro_taksowki")
    public void setPoslowieWartoscBiuroTaksowki(Integer poslowieWartoscBiuroTaksowki) {
        this.poslowieWartoscBiuroTaksowki = poslowieWartoscBiuroTaksowki;
    }

    @JsonProperty("poslowie.sejm_okreg_id")
    public String getPoslowieSejmOkregId() {
        return poslowieSejmOkregId;
    }

    @JsonProperty("poslowie.sejm_okreg_id")
    public void setPoslowieSejmOkregId(String poslowieSejmOkregId) {
        this.poslowieSejmOkregId = poslowieSejmOkregId;
    }

    @JsonProperty("poslowie.liczba_przelotow")
    public Integer getPoslowieLiczbaPrzelotow() {
        return poslowieLiczbaPrzelotow;
    }

    @JsonProperty("poslowie.liczba_przelotow")
    public void setPoslowieLiczbaPrzelotow(Integer poslowieLiczbaPrzelotow) {
        this.poslowieLiczbaPrzelotow = poslowieLiczbaPrzelotow;
    }

    @JsonProperty("poslowie.wartosc_biuro_zlecenia")
    public Double getPoslowieWartoscBiuroZlecenia() {
        return poslowieWartoscBiuroZlecenia;
    }

    @JsonProperty("poslowie.wartosc_biuro_zlecenia")
    public void setPoslowieWartoscBiuroZlecenia(Double poslowieWartoscBiuroZlecenia) {
        this.poslowieWartoscBiuroZlecenia = poslowieWartoscBiuroZlecenia;
    }

    @JsonProperty("poslowie.liczba_projektow_uchwal")
    public Integer getPoslowieLiczbaProjektowUchwal() {
        return poslowieLiczbaProjektowUchwal;
    }

    @JsonProperty("poslowie.liczba_projektow_uchwal")
    public void setPoslowieLiczbaProjektowUchwal(Integer poslowieLiczbaProjektowUchwal) {
        this.poslowieLiczbaProjektowUchwal = poslowieLiczbaProjektowUchwal;
    }

    @JsonProperty("poslowie.imiona")
    public String getPoslowieImiona() {
        return poslowieImiona;
    }

    @JsonProperty("poslowie.imiona")
    public void setPoslowieImiona(String poslowieImiona) {
        this.poslowieImiona = poslowieImiona;
    }

    @JsonProperty("poslowie.biuro_html")
    public String getPoslowieBiuroHtml() {
        return poslowieBiuroHtml;
    }

    @JsonProperty("poslowie.biuro_html")
    public void setPoslowieBiuroHtml(String poslowieBiuroHtml) {
        this.poslowieBiuroHtml = poslowieBiuroHtml;
    }

    @JsonProperty("poslowie.wartosc_biuro_wynagrodzenia_pracownikow")
    public Double getPoslowieWartoscBiuroWynagrodzeniaPracownikow() {
        return poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    @JsonProperty("poslowie.wartosc_biuro_wynagrodzenia_pracownikow")
    public void setPoslowieWartoscBiuroWynagrodzeniaPracownikow(Double poslowieWartoscBiuroWynagrodzeniaPracownikow) {
        this.poslowieWartoscBiuroWynagrodzeniaPracownikow = poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    @JsonProperty("poslowie.numer_legitymacji")
    public Integer getPoslowieNumerLegitymacji() {
        return poslowieNumerLegitymacji;
    }

    @JsonProperty("poslowie.numer_legitymacji")
    public void setPoslowieNumerLegitymacji(Integer poslowieNumerLegitymacji) {
        this.poslowieNumerLegitymacji = poslowieNumerLegitymacji;
    }

    @JsonProperty("poslowie.data_wygasniecia_mandatu")
    public String getPoslowieDataWygasnieciaMandatu() {
        return poslowieDataWygasnieciaMandatu;
    }

    @JsonProperty("poslowie.data_wygasniecia_mandatu")
    public void setPoslowieDataWygasnieciaMandatu(String poslowieDataWygasnieciaMandatu) {
        this.poslowieDataWygasnieciaMandatu = poslowieDataWygasnieciaMandatu;
    }

    @JsonProperty("poslowie.imie_pierwsze")
    public String getPoslowieImiePierwsze() {
        return poslowieImiePierwsze;
    }

    @JsonProperty("poslowie.imie_pierwsze")
    public void setPoslowieImiePierwsze(String poslowieImiePierwsze) {
        this.poslowieImiePierwsze = poslowieImiePierwsze;
    }

    @JsonProperty("poslowie.liczba_glosow")
    public Integer getPoslowieLiczbaGlosow() {
        return poslowieLiczbaGlosow;
    }

    @JsonProperty("poslowie.liczba_glosow")
    public void setPoslowieLiczbaGlosow(Integer poslowieLiczbaGlosow) {
        this.poslowieLiczbaGlosow = poslowieLiczbaGlosow;
    }

    @JsonProperty("poslowie.procent_glosow")
    public Double getPoslowieProcentGlosow() {
        return poslowieProcentGlosow;
    }

    @JsonProperty("poslowie.procent_glosow")
    public void setPoslowieProcentGlosow(Double poslowieProcentGlosow) {
        this.poslowieProcentGlosow = poslowieProcentGlosow;
    }

    @JsonProperty("poslowie.pkw_komitet_id")
    public String getPoslowiePkwKomitetId() {
        return poslowiePkwKomitetId;
    }

    @JsonProperty("poslowie.pkw_komitet_id")
    public void setPoslowiePkwKomitetId(String poslowiePkwKomitetId) {
        this.poslowiePkwKomitetId = poslowiePkwKomitetId;
    }

    @JsonProperty("poslowie.wartosc_uposazenia_pln")
    public Double getPoslowieWartoscUposazeniaPln() {
        return poslowieWartoscUposazeniaPln;
    }

    @JsonProperty("poslowie.wartosc_uposazenia_pln")
    public void setPoslowieWartoscUposazeniaPln(Double poslowieWartoscUposazeniaPln) {
        this.poslowieWartoscUposazeniaPln = poslowieWartoscUposazeniaPln;
    }

    @JsonProperty("poslowie.zawod")
    public String getPoslowieZawod() {
        return poslowieZawod;
    }

    @JsonProperty("poslowie.zawod")
    public void setPoslowieZawod(String poslowieZawod) {
        this.poslowieZawod = poslowieZawod;
    }

    @JsonProperty("poslowie.data_urodzenia")
    public String getPoslowieDataUrodzenia() {
        return poslowieDataUrodzenia;
    }

    @JsonProperty("poslowie.data_urodzenia")
    public void setPoslowieDataUrodzenia(String poslowieDataUrodzenia) {
        this.poslowieDataUrodzenia = poslowieDataUrodzenia;
    }

    @JsonProperty("poslowie.okreg_gminy_str")
    public String getPoslowieOkregGminyStr() {
        return poslowieOkregGminyStr;
    }

    @JsonProperty("poslowie.okreg_gminy_str")
    public void setPoslowieOkregGminyStr(String poslowieOkregGminyStr) {
        this.poslowieOkregGminyStr = poslowieOkregGminyStr;
    }

    @JsonProperty("poslowie.imie_drugie")
    public String getPoslowieImieDrugie() {
        return poslowieImieDrugie;
    }

    @JsonProperty("poslowie.imie_drugie")
    public void setPoslowieImieDrugie(String poslowieImieDrugie) {
        this.poslowieImieDrugie = poslowieImieDrugie;
    }

    @JsonProperty("poslowie.kadencja_ostatnia")
    public String getPoslowieKadencjaOstatnia() {
        return poslowieKadencjaOstatnia;
    }

    @JsonProperty("poslowie.kadencja_ostatnia")
    public void setPoslowieKadencjaOstatnia(String poslowieKadencjaOstatnia) {
        this.poslowieKadencjaOstatnia = poslowieKadencjaOstatnia;
    }

    @JsonProperty("poslowie.wartosc_biuro_spotkania")
    public Integer getPoslowieWartoscBiuroSpotkania() {
        return poslowieWartoscBiuroSpotkania;
    }

    @JsonProperty("poslowie.wartosc_biuro_spotkania")
    public void setPoslowieWartoscBiuroSpotkania(Integer poslowieWartoscBiuroSpotkania) {
        this.poslowieWartoscBiuroSpotkania = poslowieWartoscBiuroSpotkania;
    }

    @JsonProperty("poslowie.liczba_glosowan_zbuntowanych")
    public Integer getPoslowieLiczbaGlosowanZbuntowanych() {
        return poslowieLiczbaGlosowanZbuntowanych;
    }

    @JsonProperty("poslowie.liczba_glosowan_zbuntowanych")
    public void setPoslowieLiczbaGlosowanZbuntowanych(Integer poslowieLiczbaGlosowanZbuntowanych) {
        this.poslowieLiczbaGlosowanZbuntowanych = poslowieLiczbaGlosowanZbuntowanych;
    }

    @JsonProperty("poslowie.klub_id")
    public String getPoslowieKlubId() {
        return poslowieKlubId;
    }

    @JsonProperty("poslowie.klub_id")
    public void setPoslowieKlubId(String poslowieKlubId) {
        this.poslowieKlubId = poslowieKlubId;
    }

    @JsonProperty("poslowie.liczba_komisji")
    public Integer getPoslowieLiczbaKomisji() {
        return poslowieLiczbaKomisji;
    }

    @JsonProperty("poslowie.liczba_komisji")
    public void setPoslowieLiczbaKomisji(Integer poslowieLiczbaKomisji) {
        this.poslowieLiczbaKomisji = poslowieLiczbaKomisji;
    }

    @JsonProperty("poslowie.wartosc_wyjazdow")
    public Integer getPoslowieWartoscWyjazdow() {
        return poslowieWartoscWyjazdow;
    }

    @JsonProperty("poslowie.wartosc_wyjazdow")
    public void setPoslowieWartoscWyjazdow(Integer poslowieWartoscWyjazdow) {
        this.poslowieWartoscWyjazdow = poslowieWartoscWyjazdow;
    }

    @JsonProperty("poslowie.zbuntowanie")
    public Double getPoslowieZbuntowanie() {
        return poslowieZbuntowanie;
    }

    @JsonProperty("poslowie.zbuntowanie")
    public void setPoslowieZbuntowanie(Double poslowieZbuntowanie) {
        this.poslowieZbuntowanie = poslowieZbuntowanie;
    }

    @JsonProperty("poslowie.nazwa_odwrocona")
    public String getPoslowieNazwaOdwrocona() {
        return poslowieNazwaOdwrocona;
    }

    @JsonProperty("poslowie.nazwa_odwrocona")
    public void setPoslowieNazwaOdwrocona(String poslowieNazwaOdwrocona) {
        this.poslowieNazwaOdwrocona = poslowieNazwaOdwrocona;
    }

    @JsonProperty("poslowie.twitter_account_id")
    public String getPoslowieTwitterAccountId() {
        return poslowieTwitterAccountId;
    }

    @JsonProperty("poslowie.twitter_account_id")
    public void setPoslowieTwitterAccountId(String poslowieTwitterAccountId) {
        this.poslowieTwitterAccountId = poslowieTwitterAccountId;
    }

    @JsonProperty("poslowie.wartosc_biuro_przejazdy")
    public Double getPoslowieWartoscBiuroPrzejazdy() {
        return poslowieWartoscBiuroPrzejazdy;
    }

    @JsonProperty("poslowie.wartosc_biuro_przejazdy")
    public void setPoslowieWartoscBiuroPrzejazdy(Double poslowieWartoscBiuroPrzejazdy) {
        this.poslowieWartoscBiuroPrzejazdy = poslowieWartoscBiuroPrzejazdy;
    }

    @JsonProperty("poslowie.liczba_glosowan_opuszczonych")
    public Integer getPoslowieLiczbaGlosowanOpuszczonych() {
        return poslowieLiczbaGlosowanOpuszczonych;
    }

    @JsonProperty("poslowie.liczba_glosowan_opuszczonych")
    public void setPoslowieLiczbaGlosowanOpuszczonych(Integer poslowieLiczbaGlosowanOpuszczonych) {
        this.poslowieLiczbaGlosowanOpuszczonych = poslowieLiczbaGlosowanOpuszczonych;
    }

    @JsonProperty("poslowie.plec")
    public String getPoslowiePlec() {
        return poslowiePlec;
    }

    @JsonProperty("poslowie.plec")
    public void setPoslowiePlec(String poslowiePlec) {
        this.poslowiePlec = poslowiePlec;
    }

    @JsonProperty("poslowie.kadencja")
    public List<Integer> getPoslowieKadencja() {
        return poslowieKadencja;
    }

    @JsonProperty("poslowie.kadencja")
    public void setPoslowieKadencja(List<Integer> poslowieKadencja) {
        this.poslowieKadencja = poslowieKadencja;
    }

    @JsonProperty("poslowie.id")
    public String getPoslowieId() {
        return poslowieId;
    }

    @JsonProperty("poslowie.id")
    public void setPoslowieId(String poslowieId) {
        this.poslowieId = poslowieId;
    }

    @JsonProperty("poslowie.wartosc_refundacja_kwater_pln")
    public Integer getPoslowieWartoscRefundacjaKwaterPln() {
        return poslowieWartoscRefundacjaKwaterPln;
    }

    @JsonProperty("poslowie.wartosc_refundacja_kwater_pln")
    public void setPoslowieWartoscRefundacjaKwaterPln(Integer poslowieWartoscRefundacjaKwaterPln) {
        this.poslowieWartoscRefundacjaKwaterPln = poslowieWartoscRefundacjaKwaterPln;
    }

    @JsonProperty("poslowie.liczba_interpelacji")
    public Integer getPoslowieLiczbaInterpelacji() {
        return poslowieLiczbaInterpelacji;
    }

    @JsonProperty("poslowie.liczba_interpelacji")
    public void setPoslowieLiczbaInterpelacji(Integer poslowieLiczbaInterpelacji) {
        this.poslowieLiczbaInterpelacji = poslowieLiczbaInterpelacji;
    }

    @JsonProperty("poslowie.nazwa")
    public String getPoslowieNazwa() {
        return poslowieNazwa;
    }

    @JsonProperty("poslowie.nazwa")
    public void setPoslowieNazwa(String poslowieNazwa) {
        this.poslowieNazwa = poslowieNazwa;
    }

    @JsonProperty("poslowie.dopelniacz")
    public String getPoslowieDopelniacz() {
        return poslowieDopelniacz;
    }

    @JsonProperty("poslowie.dopelniacz")
    public void setPoslowieDopelniacz(String poslowieDopelniacz) {
        this.poslowieDopelniacz = poslowieDopelniacz;
    }

    @JsonProperty("poslowie.wartosc_biuro_telekomunikacja")
    public Double getPoslowieWartoscBiuroTelekomunikacja() {
        return poslowieWartoscBiuroTelekomunikacja;
    }

    @JsonProperty("poslowie.wartosc_biuro_telekomunikacja")
    public void setPoslowieWartoscBiuroTelekomunikacja(Double poslowieWartoscBiuroTelekomunikacja) {
        this.poslowieWartoscBiuroTelekomunikacja = poslowieWartoscBiuroTelekomunikacja;
    }

    @JsonProperty("poslowie.liczba_uchwal_komisji_etyki")
    public Integer getPoslowieLiczbaUchwalKomisjiEtyki() {
        return poslowieLiczbaUchwalKomisjiEtyki;
    }

    @JsonProperty("poslowie.liczba_uchwal_komisji_etyki")
    public void setPoslowieLiczbaUchwalKomisjiEtyki(Integer poslowieLiczbaUchwalKomisjiEtyki) {
        this.poslowieLiczbaUchwalKomisjiEtyki = poslowieLiczbaUchwalKomisjiEtyki;
    }

    @JsonProperty("poslowie.nazwisko")
    public String getPoslowieNazwisko() {
        return poslowieNazwisko;
    }

    @JsonProperty("poslowie.nazwisko")
    public void setPoslowieNazwisko(String poslowieNazwisko) {
        this.poslowieNazwisko = poslowieNazwisko;
    }

    @JsonProperty("poslowie.wartosc_biuro_biuro")
    public Double getPoslowieWartoscBiuroBiuro() {
        return poslowieWartoscBiuroBiuro;
    }

    @JsonProperty("poslowie.wartosc_biuro_biuro")
    public void setPoslowieWartoscBiuroBiuro(Double poslowieWartoscBiuroBiuro) {
        this.poslowieWartoscBiuroBiuro = poslowieWartoscBiuroBiuro;
    }

    @JsonProperty("poslowie.miejsce_urodzenia")
    public String getPoslowieMiejsceUrodzenia() {
        return poslowieMiejsceUrodzenia;
    }

    @JsonProperty("poslowie.miejsce_urodzenia")
    public void setPoslowieMiejsceUrodzenia(String poslowieMiejsceUrodzenia) {
        this.poslowieMiejsceUrodzenia = poslowieMiejsceUrodzenia;
    }

    @JsonProperty("poslowie.wartosc_biuro_podroze_pracownikow")
    public Double getPoslowieWartoscBiuroPodrozePracownikow() {
        return poslowieWartoscBiuroPodrozePracownikow;
    }

    @JsonProperty("poslowie.wartosc_biuro_podroze_pracownikow")
    public void setPoslowieWartoscBiuroPodrozePracownikow(Double poslowieWartoscBiuroPodrozePracownikow) {
        this.poslowieWartoscBiuroPodrozePracownikow = poslowieWartoscBiuroPodrozePracownikow;
    }

    @JsonProperty("poslowie.krs_osoba_id")
    public String getPoslowieKrsOsobaId() {
        return poslowieKrsOsobaId;
    }

    @JsonProperty("poslowie.krs_osoba_id")
    public void setPoslowieKrsOsobaId(String poslowieKrsOsobaId) {
        this.poslowieKrsOsobaId = poslowieKrsOsobaId;
    }

    @JsonProperty("poslowie.liczba_podkomisji")
    public Integer getPoslowieLiczbaPodkomisji() {
        return poslowieLiczbaPodkomisji;
    }

    @JsonProperty("poslowie.liczba_podkomisji")
    public void setPoslowieLiczbaPodkomisji(Integer poslowieLiczbaPodkomisji) {
        this.poslowieLiczbaPodkomisji = poslowieLiczbaPodkomisji;
    }

    @JsonProperty("poslowie.liczba_przejazdow")
    public Integer getPoslowieLiczbaPrzejazdow() {
        return poslowieLiczbaPrzejazdow;
    }

    @JsonProperty("poslowie.liczba_przejazdow")
    public void setPoslowieLiczbaPrzejazdow(Integer poslowieLiczbaPrzejazdow) {
        this.poslowieLiczbaPrzejazdow = poslowieLiczbaPrzejazdow;
    }

    @JsonProperty("poslowie.numer_na_liscie")
    public Integer getPoslowieNumerNaLiscie() {
        return poslowieNumerNaLiscie;
    }

    @JsonProperty("poslowie.numer_na_liscie")
    public void setPoslowieNumerNaLiscie(Integer poslowieNumerNaLiscie) {
        this.poslowieNumerNaLiscie = poslowieNumerNaLiscie;
    }

    @JsonProperty("poslowie.rozliczenie_id")
    public String getPoslowieRozliczenieId() {
        return poslowieRozliczenieId;
    }

    @JsonProperty("poslowie.rozliczenie_id")
    public void setPoslowieRozliczenieId(String poslowieRozliczenieId) {
        this.poslowieRozliczenieId = poslowieRozliczenieId;
    }

    @JsonProperty("poslowie.pkw_nr_listy")
    public String getPoslowiePkwNrListy() {
        return poslowiePkwNrListy;
    }

    @JsonProperty("poslowie.pkw_nr_listy")
    public void setPoslowiePkwNrListy(String poslowiePkwNrListy) {
        this.poslowiePkwNrListy = poslowiePkwNrListy;
    }

    @JsonProperty("poslowie.liczba_wyjazdow")
    public Integer getPoslowieLiczbaWyjazdow() {
        return poslowieLiczbaWyjazdow;
    }

    @JsonProperty("poslowie.liczba_wyjazdow")
    public void setPoslowieLiczbaWyjazdow(Integer poslowieLiczbaWyjazdow) {
        this.poslowieLiczbaWyjazdow = poslowieLiczbaWyjazdow;
    }

    @JsonProperty("poslowie.liczba_wypowiedzi")
    public Integer getPoslowieLiczbaWypowiedzi() {
        return poslowieLiczbaWypowiedzi;
    }

    @JsonProperty("poslowie.liczba_wypowiedzi")
    public void setPoslowieLiczbaWypowiedzi(Integer poslowieLiczbaWypowiedzi) {
        this.poslowieLiczbaWypowiedzi = poslowieLiczbaWypowiedzi;
    }

    @JsonProperty("poslowie.liczba_projektow_ustaw")
    public Integer getPoslowieLiczbaProjektowUstaw() {
        return poslowieLiczbaProjektowUstaw;
    }

    @JsonProperty("poslowie.liczba_projektow_ustaw")
    public void setPoslowieLiczbaProjektowUstaw(Integer poslowieLiczbaProjektowUstaw) {
        this.poslowieLiczbaProjektowUstaw = poslowieLiczbaProjektowUstaw;
    }

    @JsonProperty("poslowie.liczba_glosowan")
    public Integer getPoslowieLiczbaGlosowan() {
        return poslowieLiczbaGlosowan;
    }

    @JsonProperty("poslowie.liczba_glosowan")
    public void setPoslowieLiczbaGlosowan(Integer poslowieLiczbaGlosowan) {
        this.poslowieLiczbaGlosowan = poslowieLiczbaGlosowan;
    }

    @JsonProperty("poslowie.liczba_wnioskow")
    public Integer getPoslowieLiczbaWnioskow() {
        return poslowieLiczbaWnioskow;
    }

    @JsonProperty("poslowie.liczba_wnioskow")
    public void setPoslowieLiczbaWnioskow(Integer poslowieLiczbaWnioskow) {
        this.poslowieLiczbaWnioskow = poslowieLiczbaWnioskow;
    }

    @JsonProperty("poslowie.miejsce_zamieszkania")
    public String getPoslowieMiejsceZamieszkania() {
        return poslowieMiejsceZamieszkania;
    }

    @JsonProperty("poslowie.miejsce_zamieszkania")
    public void setPoslowieMiejsceZamieszkania(String poslowieMiejsceZamieszkania) {
        this.poslowieMiejsceZamieszkania = poslowieMiejsceZamieszkania;
    }

    @JsonProperty("poslowie.mowca_id")
    public String getPoslowieMowcaId() {
        return poslowieMowcaId;
    }

    @JsonProperty("poslowie.mowca_id")
    public void setPoslowieMowcaId(String poslowieMowcaId) {
        this.poslowieMowcaId = poslowieMowcaId;
    }

    @JsonProperty("poslowie.okreg_wyborczy_numer")
    public String getPoslowieOkregWyborczyNumer() {
        return poslowieOkregWyborczyNumer;
    }

    @JsonProperty("poslowie.okreg_wyborczy_numer")
    public void setPoslowieOkregWyborczyNumer(String poslowieOkregWyborczyNumer) {
        this.poslowieOkregWyborczyNumer = poslowieOkregWyborczyNumer;
    }

    @JsonProperty("poslowie.liczba_slow")
    public Integer getPoslowieLiczbaSlow() {
        return poslowieLiczbaSlow;
    }

    @JsonProperty("poslowie.liczba_slow")
    public void setPoslowieLiczbaSlow(Integer poslowieLiczbaSlow) {
        this.poslowieLiczbaSlow = poslowieLiczbaSlow;
    }

    @JsonProperty("poslowie.wartosc_biuro_srodki_trwale")
    public Integer getPoslowieWartoscBiuroSrodkiTrwale() {
        return poslowieWartoscBiuroSrodkiTrwale;
    }

    @JsonProperty("poslowie.wartosc_biuro_srodki_trwale")
    public void setPoslowieWartoscBiuroSrodkiTrwale(Integer poslowieWartoscBiuroSrodkiTrwale) {
        this.poslowieWartoscBiuroSrodkiTrwale = poslowieWartoscBiuroSrodkiTrwale;
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
