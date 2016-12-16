
package agh.cs.lab9.json.representative;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("ludzie.id")
    @Expose
    private String ludzieId;
    @SerializedName("ludzie.nazwa")
    @Expose
    private String ludzieNazwa;
    @SerializedName("ludzie.slug")
    @Expose
    private String ludzieSlug;
    @SerializedName("sejm_kluby.id")
    @Expose
    private String sejmKlubyId;
    @SerializedName("sejm_kluby.skrot")
    @Expose
    private String sejmKlubySkrot;
    @SerializedName("sejm_kluby.nazwa")
    @Expose
    private String sejmKlubyNazwa;
    @SerializedName("poslowie.wartosc_biuro_inne")
    @Expose
    private Double poslowieWartoscBiuroInne;
    @SerializedName("poslowie.wartosc_biuro_ekspertyzy")
    @Expose
    private Double poslowieWartoscBiuroEkspertyzy;
    @SerializedName("poslowie.wartosc_biuro_materialy_biurowe")
    @Expose
    private Double poslowieWartoscBiuroMaterialyBiurowe;
    @SerializedName("poslowie.frekwencja")
    @Expose
    private Double poslowieFrekwencja;
    @SerializedName("poslowie.mandat_wygasl")
    @Expose
    private String poslowieMandatWygasl;
    @SerializedName("poslowie.wartosc_biuro_taksowki")
    @Expose
    private Double poslowieWartoscBiuroTaksowki;
    @SerializedName("poslowie.sejm_okreg_id")
    @Expose
    private String poslowieSejmOkregId;
    @SerializedName("poslowie.liczba_przelotow")
    @Expose
    private Integer poslowieLiczbaPrzelotow;
    @SerializedName("poslowie.wartosc_biuro_zlecenia")
    @Expose
    private Double poslowieWartoscBiuroZlecenia;
    @SerializedName("poslowie.liczba_projektow_uchwal")
    @Expose
    private Integer poslowieLiczbaProjektowUchwal;
    @SerializedName("poslowie.imiona")
    @Expose
    private String poslowieImiona;
    @SerializedName("poslowie.biuro_html")
    @Expose
    private String poslowieBiuroHtml;
    @SerializedName("poslowie.wartosc_biuro_wynagrodzenia_pracownikow")
    @Expose
    private Double poslowieWartoscBiuroWynagrodzeniaPracownikow;
    @SerializedName("poslowie.numer_legitymacji")
    @Expose
    private Integer poslowieNumerLegitymacji;
    @SerializedName("poslowie.data_wygasniecia_mandatu")
    @Expose
    private String poslowieDataWygasnieciaMandatu;
    @SerializedName("poslowie.imie_pierwsze")
    @Expose
    private String poslowieImiePierwsze;
    @SerializedName("poslowie.liczba_glosow")
    @Expose
    private Integer poslowieLiczbaGlosow;
    @SerializedName("poslowie.procent_glosow")
    @Expose
    private Double poslowieProcentGlosow;
    @SerializedName("poslowie.pkw_komitet_id")
    @Expose
    private String poslowiePkwKomitetId;
    @SerializedName("poslowie.wartosc_uposazenia_pln")
    @Expose
    private Double poslowieWartoscUposazeniaPln;
    @SerializedName("poslowie.zawod")
    @Expose
    private String poslowieZawod;
    @SerializedName("poslowie.data_urodzenia")
    @Expose
    private String poslowieDataUrodzenia;
    @SerializedName("poslowie.okreg_gminy_str")
    @Expose
    private String poslowieOkregGminyStr;
    @SerializedName("poslowie.imie_drugie")
    @Expose
    private String poslowieImieDrugie;
    @SerializedName("poslowie.kadencja_ostatnia")
    @Expose
    private String poslowieKadencjaOstatnia;
    @SerializedName("poslowie.wartosc_biuro_spotkania")
    @Expose
    private Double poslowieWartoscBiuroSpotkania;
    @SerializedName("poslowie.liczba_glosowan_zbuntowanych")
    @Expose
    private Integer poslowieLiczbaGlosowanZbuntowanych;
    @SerializedName("poslowie.klub_id")
    @Expose
    private String poslowieKlubId;
    @SerializedName("poslowie.liczba_komisji")
    @Expose
    private Integer poslowieLiczbaKomisji;
    @SerializedName("poslowie.wartosc_wyjazdow")
    @Expose
    private Double poslowieWartoscWyjazdow;
    @SerializedName("poslowie.zbuntowanie")
    @Expose
    private Double poslowieZbuntowanie;
    @SerializedName("poslowie.nazwa_odwrocona")
    @Expose
    private String poslowieNazwaOdwrocona;
    @SerializedName("poslowie.twitter_account_id")
    @Expose
    private String poslowieTwitterAccountId;
    @SerializedName("poslowie.wartosc_biuro_przejazdy")
    @Expose
    private Double poslowieWartoscBiuroPrzejazdy;
    @SerializedName("poslowie.liczba_glosowan_opuszczonych")
    @Expose
    private Integer poslowieLiczbaGlosowanOpuszczonych;
    @SerializedName("poslowie.plec")
    @Expose
    private String poslowiePlec;
    @SerializedName("poslowie.kadencja")
    @Expose
    private List<Integer> poslowieKadencja = null;
    @SerializedName("poslowie.id")
    @Expose
    private String poslowieId;
    @SerializedName("poslowie.wartosc_refundacja_kwater_pln")
    @Expose
    private Integer poslowieWartoscRefundacjaKwaterPln;
    @SerializedName("poslowie.liczba_interpelacji")
    @Expose
    private Integer poslowieLiczbaInterpelacji;
    @SerializedName("poslowie.nazwa")
    @Expose
    private String poslowieNazwa;
    @SerializedName("poslowie.dopelniacz")
    @Expose
    private String poslowieDopelniacz;
    @SerializedName("poslowie.wartosc_biuro_telekomunikacja")
    @Expose
    private Double poslowieWartoscBiuroTelekomunikacja;
    @SerializedName("poslowie.liczba_uchwal_komisji_etyki")
    @Expose
    private Integer poslowieLiczbaUchwalKomisjiEtyki;
    @SerializedName("poslowie.nazwisko")
    @Expose
    private String poslowieNazwisko;
    @SerializedName("poslowie.wartosc_biuro_biuro")
    @Expose
    private Double poslowieWartoscBiuroBiuro;
    @SerializedName("poslowie.miejsce_urodzenia")
    @Expose
    private String poslowieMiejsceUrodzenia;
    @SerializedName("poslowie.wartosc_biuro_podroze_pracownikow")
    @Expose
    private Double poslowieWartoscBiuroPodrozePracownikow;
    @SerializedName("poslowie.krs_osoba_id")
    @Expose
    private String poslowieKrsOsobaId;
    @SerializedName("poslowie.liczba_podkomisji")
    @Expose
    private Integer poslowieLiczbaPodkomisji;
    @SerializedName("poslowie.liczba_przejazdow")
    @Expose
    private Integer poslowieLiczbaPrzejazdow;
    @SerializedName("poslowie.numer_na_liscie")
    @Expose
    private Integer poslowieNumerNaLiscie;
    @SerializedName("poslowie.rozliczenie_id")
    @Expose
    private String poslowieRozliczenieId;
    @SerializedName("poslowie.pkw_nr_listy")
    @Expose
    private String poslowiePkwNrListy;
    @SerializedName("poslowie.liczba_wyjazdow")
    @Expose
    private Integer poslowieLiczbaWyjazdow;
    @SerializedName("poslowie.liczba_wypowiedzi")
    @Expose
    private Integer poslowieLiczbaWypowiedzi;
    @SerializedName("poslowie.liczba_projektow_ustaw")
    @Expose
    private Integer poslowieLiczbaProjektowUstaw;
    @SerializedName("poslowie.liczba_glosowan")
    @Expose
    private Integer poslowieLiczbaGlosowan;
    @SerializedName("poslowie.liczba_wnioskow")
    @Expose
    private Integer poslowieLiczbaWnioskow;
    @SerializedName("poslowie.miejsce_zamieszkania")
    @Expose
    private String poslowieMiejsceZamieszkania;
    @SerializedName("poslowie.mowca_id")
    @Expose
    private String poslowieMowcaId;
    @SerializedName("poslowie.okreg_wyborczy_numer")
    @Expose
    private String poslowieOkregWyborczyNumer;
    @SerializedName("poslowie.liczba_slow")
    @Expose
    private Integer poslowieLiczbaSlow;
    @SerializedName("poslowie.wartosc_biuro_srodki_trwale")
    @Expose
    private Double poslowieWartoscBiuroSrodkiTrwale;

    /**
     * 
     * @return
     *     The ludzieId
     */
    public String getLudzieId() {
        return ludzieId;
    }

    /**
     * 
     * @param ludzieId
     *     The ludzie.id
     */
    public void setLudzieId(String ludzieId) {
        this.ludzieId = ludzieId;
    }

    /**
     * 
     * @return
     *     The ludzieNazwa
     */
    public String getLudzieNazwa() {
        return ludzieNazwa;
    }

    /**
     * 
     * @param ludzieNazwa
     *     The ludzie.nazwa
     */
    public void setLudzieNazwa(String ludzieNazwa) {
        this.ludzieNazwa = ludzieNazwa;
    }

    /**
     * 
     * @return
     *     The ludzieSlug
     */
    public String getLudzieSlug() {
        return ludzieSlug;
    }

    /**
     * 
     * @param ludzieSlug
     *     The ludzie.slug
     */
    public void setLudzieSlug(String ludzieSlug) {
        this.ludzieSlug = ludzieSlug;
    }

    /**
     * 
     * @return
     *     The sejmKlubyId
     */
    public String getSejmKlubyId() {
        return sejmKlubyId;
    }

    /**
     * 
     * @param sejmKlubyId
     *     The sejm_kluby.id
     */
    public void setSejmKlubyId(String sejmKlubyId) {
        this.sejmKlubyId = sejmKlubyId;
    }

    /**
     * 
     * @return
     *     The sejmKlubySkrot
     */
    public String getSejmKlubySkrot() {
        return sejmKlubySkrot;
    }

    /**
     * 
     * @param sejmKlubySkrot
     *     The sejm_kluby.skrot
     */
    public void setSejmKlubySkrot(String sejmKlubySkrot) {
        this.sejmKlubySkrot = sejmKlubySkrot;
    }

    /**
     * 
     * @return
     *     The sejmKlubyNazwa
     */
    public String getSejmKlubyNazwa() {
        return sejmKlubyNazwa;
    }

    /**
     * 
     * @param sejmKlubyNazwa
     *     The sejm_kluby.nazwa
     */
    public void setSejmKlubyNazwa(String sejmKlubyNazwa) {
        this.sejmKlubyNazwa = sejmKlubyNazwa;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroInne
     */
    public Double getPoslowieWartoscBiuroInne() {
        return poslowieWartoscBiuroInne;
    }

    /**
     * 
     * @param poslowieWartoscBiuroInne
     *     The poslowie.wartosc_biuro_inne
     */
    public void setPoslowieWartoscBiuroInne(Double poslowieWartoscBiuroInne) {
        this.poslowieWartoscBiuroInne = poslowieWartoscBiuroInne;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroEkspertyzy
     */
    public Double getPoslowieWartoscBiuroEkspertyzy() {
        return poslowieWartoscBiuroEkspertyzy;
    }

    /**
     * 
     * @param poslowieWartoscBiuroEkspertyzy
     *     The poslowie.wartosc_biuro_ekspertyzy
     */
    public void setPoslowieWartoscBiuroEkspertyzy(Double poslowieWartoscBiuroEkspertyzy) {
        this.poslowieWartoscBiuroEkspertyzy = poslowieWartoscBiuroEkspertyzy;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroMaterialyBiurowe
     */
    public Double getPoslowieWartoscBiuroMaterialyBiurowe() {
        return poslowieWartoscBiuroMaterialyBiurowe;
    }

    /**
     * 
     * @param poslowieWartoscBiuroMaterialyBiurowe
     *     The poslowie.wartosc_biuro_materialy_biurowe
     */
    public void setPoslowieWartoscBiuroMaterialyBiurowe(Double poslowieWartoscBiuroMaterialyBiurowe) {
        this.poslowieWartoscBiuroMaterialyBiurowe = poslowieWartoscBiuroMaterialyBiurowe;
    }

    /**
     * 
     * @return
     *     The poslowieFrekwencja
     */
    public Double getPoslowieFrekwencja() {
        return poslowieFrekwencja;
    }

    /**
     * 
     * @param poslowieFrekwencja
     *     The poslowie.frekwencja
     */
    public void setPoslowieFrekwencja(Double poslowieFrekwencja) {
        this.poslowieFrekwencja = poslowieFrekwencja;
    }

    /**
     * 
     * @return
     *     The poslowieMandatWygasl
     */
    public String getPoslowieMandatWygasl() {
        return poslowieMandatWygasl;
    }

    /**
     * 
     * @param poslowieMandatWygasl
     *     The poslowie.mandat_wygasl
     */
    public void setPoslowieMandatWygasl(String poslowieMandatWygasl) {
        this.poslowieMandatWygasl = poslowieMandatWygasl;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroTaksowki
     */
    public Double getPoslowieWartoscBiuroTaksowki() {
        return poslowieWartoscBiuroTaksowki;
    }

    /**
     * 
     * @param poslowieWartoscBiuroTaksowki
     *     The poslowie.wartosc_biuro_taksowki
     */
    public void setPoslowieWartoscBiuroTaksowki(Double poslowieWartoscBiuroTaksowki) {
        this.poslowieWartoscBiuroTaksowki = poslowieWartoscBiuroTaksowki;
    }

    /**
     * 
     * @return
     *     The poslowieSejmOkregId
     */
    public String getPoslowieSejmOkregId() {
        return poslowieSejmOkregId;
    }

    /**
     * 
     * @param poslowieSejmOkregId
     *     The poslowie.sejm_okreg_id
     */
    public void setPoslowieSejmOkregId(String poslowieSejmOkregId) {
        this.poslowieSejmOkregId = poslowieSejmOkregId;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaPrzelotow
     */
    public Integer getPoslowieLiczbaPrzelotow() {
        return poslowieLiczbaPrzelotow;
    }

    /**
     * 
     * @param poslowieLiczbaPrzelotow
     *     The poslowie.liczba_przelotow
     */
    public void setPoslowieLiczbaPrzelotow(Integer poslowieLiczbaPrzelotow) {
        this.poslowieLiczbaPrzelotow = poslowieLiczbaPrzelotow;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroZlecenia
     */
    public Double getPoslowieWartoscBiuroZlecenia() {
        return poslowieWartoscBiuroZlecenia;
    }

    /**
     * 
     * @param poslowieWartoscBiuroZlecenia
     *     The poslowie.wartosc_biuro_zlecenia
     */
    public void setPoslowieWartoscBiuroZlecenia(Double poslowieWartoscBiuroZlecenia) {
        this.poslowieWartoscBiuroZlecenia = poslowieWartoscBiuroZlecenia;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaProjektowUchwal
     */
    public Integer getPoslowieLiczbaProjektowUchwal() {
        return poslowieLiczbaProjektowUchwal;
    }

    /**
     * 
     * @param poslowieLiczbaProjektowUchwal
     *     The poslowie.liczba_projektow_uchwal
     */
    public void setPoslowieLiczbaProjektowUchwal(Integer poslowieLiczbaProjektowUchwal) {
        this.poslowieLiczbaProjektowUchwal = poslowieLiczbaProjektowUchwal;
    }

    /**
     * 
     * @return
     *     The poslowieImiona
     */
    public String getPoslowieImiona() {
        return poslowieImiona;
    }

    /**
     * 
     * @param poslowieImiona
     *     The poslowie.imiona
     */
    public void setPoslowieImiona(String poslowieImiona) {
        this.poslowieImiona = poslowieImiona;
    }

    /**
     * 
     * @return
     *     The poslowieBiuroHtml
     */
    public String getPoslowieBiuroHtml() {
        return poslowieBiuroHtml;
    }

    /**
     * 
     * @param poslowieBiuroHtml
     *     The poslowie.biuro_html
     */
    public void setPoslowieBiuroHtml(String poslowieBiuroHtml) {
        this.poslowieBiuroHtml = poslowieBiuroHtml;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroWynagrodzeniaPracownikow
     */
    public Double getPoslowieWartoscBiuroWynagrodzeniaPracownikow() {
        return poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    /**
     * 
     * @param poslowieWartoscBiuroWynagrodzeniaPracownikow
     *     The poslowie.wartosc_biuro_wynagrodzenia_pracownikow
     */
    public void setPoslowieWartoscBiuroWynagrodzeniaPracownikow(Double poslowieWartoscBiuroWynagrodzeniaPracownikow) {
        this.poslowieWartoscBiuroWynagrodzeniaPracownikow = poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    /**
     * 
     * @return
     *     The poslowieNumerLegitymacji
     */
    public Integer getPoslowieNumerLegitymacji() {
        return poslowieNumerLegitymacji;
    }

    /**
     * 
     * @param poslowieNumerLegitymacji
     *     The poslowie.numer_legitymacji
     */
    public void setPoslowieNumerLegitymacji(Integer poslowieNumerLegitymacji) {
        this.poslowieNumerLegitymacji = poslowieNumerLegitymacji;
    }

    /**
     * 
     * @return
     *     The poslowieDataWygasnieciaMandatu
     */
    public String getPoslowieDataWygasnieciaMandatu() {
        return poslowieDataWygasnieciaMandatu;
    }

    /**
     * 
     * @param poslowieDataWygasnieciaMandatu
     *     The poslowie.data_wygasniecia_mandatu
     */
    public void setPoslowieDataWygasnieciaMandatu(String poslowieDataWygasnieciaMandatu) {
        this.poslowieDataWygasnieciaMandatu = poslowieDataWygasnieciaMandatu;
    }

    /**
     * 
     * @return
     *     The poslowieImiePierwsze
     */
    public String getPoslowieImiePierwsze() {
        return poslowieImiePierwsze;
    }

    /**
     * 
     * @param poslowieImiePierwsze
     *     The poslowie.imie_pierwsze
     */
    public void setPoslowieImiePierwsze(String poslowieImiePierwsze) {
        this.poslowieImiePierwsze = poslowieImiePierwsze;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaGlosow
     */
    public Integer getPoslowieLiczbaGlosow() {
        return poslowieLiczbaGlosow;
    }

    /**
     * 
     * @param poslowieLiczbaGlosow
     *     The poslowie.liczba_glosow
     */
    public void setPoslowieLiczbaGlosow(Integer poslowieLiczbaGlosow) {
        this.poslowieLiczbaGlosow = poslowieLiczbaGlosow;
    }

    /**
     * 
     * @return
     *     The poslowieProcentGlosow
     */
    public Double getPoslowieProcentGlosow() {
        return poslowieProcentGlosow;
    }

    /**
     * 
     * @param poslowieProcentGlosow
     *     The poslowie.procent_glosow
     */
    public void setPoslowieProcentGlosow(Double poslowieProcentGlosow) {
        this.poslowieProcentGlosow = poslowieProcentGlosow;
    }

    /**
     * 
     * @return
     *     The poslowiePkwKomitetId
     */
    public String getPoslowiePkwKomitetId() {
        return poslowiePkwKomitetId;
    }

    /**
     * 
     * @param poslowiePkwKomitetId
     *     The poslowie.pkw_komitet_id
     */
    public void setPoslowiePkwKomitetId(String poslowiePkwKomitetId) {
        this.poslowiePkwKomitetId = poslowiePkwKomitetId;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscUposazeniaPln
     */
    public Double getPoslowieWartoscUposazeniaPln() {
        return poslowieWartoscUposazeniaPln;
    }

    /**
     * 
     * @param poslowieWartoscUposazeniaPln
     *     The poslowie.wartosc_uposazenia_pln
     */
    public void setPoslowieWartoscUposazeniaPln(Double poslowieWartoscUposazeniaPln) {
        this.poslowieWartoscUposazeniaPln = poslowieWartoscUposazeniaPln;
    }

    /**
     * 
     * @return
     *     The poslowieZawod
     */
    public String getPoslowieZawod() {
        return poslowieZawod;
    }

    /**
     * 
     * @param poslowieZawod
     *     The poslowie.zawod
     */
    public void setPoslowieZawod(String poslowieZawod) {
        this.poslowieZawod = poslowieZawod;
    }

    /**
     * 
     * @return
     *     The poslowieDataUrodzenia
     */
    public String getPoslowieDataUrodzenia() {
        return poslowieDataUrodzenia;
    }

    /**
     * 
     * @param poslowieDataUrodzenia
     *     The poslowie.data_urodzenia
     */
    public void setPoslowieDataUrodzenia(String poslowieDataUrodzenia) {
        this.poslowieDataUrodzenia = poslowieDataUrodzenia;
    }

    /**
     * 
     * @return
     *     The poslowieOkregGminyStr
     */
    public String getPoslowieOkregGminyStr() {
        return poslowieOkregGminyStr;
    }

    /**
     * 
     * @param poslowieOkregGminyStr
     *     The poslowie.okreg_gminy_str
     */
    public void setPoslowieOkregGminyStr(String poslowieOkregGminyStr) {
        this.poslowieOkregGminyStr = poslowieOkregGminyStr;
    }

    /**
     * 
     * @return
     *     The poslowieImieDrugie
     */
    public String getPoslowieImieDrugie() {
        return poslowieImieDrugie;
    }

    /**
     * 
     * @param poslowieImieDrugie
     *     The poslowie.imie_drugie
     */
    public void setPoslowieImieDrugie(String poslowieImieDrugie) {
        this.poslowieImieDrugie = poslowieImieDrugie;
    }

    /**
     * 
     * @return
     *     The poslowieKadencjaOstatnia
     */
    public String getPoslowieKadencjaOstatnia() {
        return poslowieKadencjaOstatnia;
    }

    /**
     * 
     * @param poslowieKadencjaOstatnia
     *     The poslowie.kadencja_ostatnia
     */
    public void setPoslowieKadencjaOstatnia(String poslowieKadencjaOstatnia) {
        this.poslowieKadencjaOstatnia = poslowieKadencjaOstatnia;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroSpotkania
     */
    public Double getPoslowieWartoscBiuroSpotkania() {
        return poslowieWartoscBiuroSpotkania;
    }

    /**
     * 
     * @param poslowieWartoscBiuroSpotkania
     *     The poslowie.wartosc_biuro_spotkania
     */
    public void setPoslowieWartoscBiuroSpotkania(Double poslowieWartoscBiuroSpotkania) {
        this.poslowieWartoscBiuroSpotkania = poslowieWartoscBiuroSpotkania;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaGlosowanZbuntowanych
     */
    public Integer getPoslowieLiczbaGlosowanZbuntowanych() {
        return poslowieLiczbaGlosowanZbuntowanych;
    }

    /**
     * 
     * @param poslowieLiczbaGlosowanZbuntowanych
     *     The poslowie.liczba_glosowan_zbuntowanych
     */
    public void setPoslowieLiczbaGlosowanZbuntowanych(Integer poslowieLiczbaGlosowanZbuntowanych) {
        this.poslowieLiczbaGlosowanZbuntowanych = poslowieLiczbaGlosowanZbuntowanych;
    }

    /**
     * 
     * @return
     *     The poslowieKlubId
     */
    public String getPoslowieKlubId() {
        return poslowieKlubId;
    }

    /**
     * 
     * @param poslowieKlubId
     *     The poslowie.klub_id
     */
    public void setPoslowieKlubId(String poslowieKlubId) {
        this.poslowieKlubId = poslowieKlubId;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaKomisji
     */
    public Integer getPoslowieLiczbaKomisji() {
        return poslowieLiczbaKomisji;
    }

    /**
     * 
     * @param poslowieLiczbaKomisji
     *     The poslowie.liczba_komisji
     */
    public void setPoslowieLiczbaKomisji(Integer poslowieLiczbaKomisji) {
        this.poslowieLiczbaKomisji = poslowieLiczbaKomisji;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscWyjazdow
     */
    public Double getPoslowieWartoscWyjazdow() {
        return poslowieWartoscWyjazdow;
    }

    /**
     * 
     * @param poslowieWartoscWyjazdow
     *     The poslowie.wartosc_wyjazdow
     */
    public void setPoslowieWartoscWyjazdow(Double poslowieWartoscWyjazdow) {
        this.poslowieWartoscWyjazdow = poslowieWartoscWyjazdow;
    }

    /**
     * 
     * @return
     *     The poslowieZbuntowanie
     */
    public Double getPoslowieZbuntowanie() {
        return poslowieZbuntowanie;
    }

    /**
     * 
     * @param poslowieZbuntowanie
     *     The poslowie.zbuntowanie
     */
    public void setPoslowieZbuntowanie(Double poslowieZbuntowanie) {
        this.poslowieZbuntowanie = poslowieZbuntowanie;
    }

    /**
     * 
     * @return
     *     The poslowieNazwaOdwrocona
     */
    public String getPoslowieNazwaOdwrocona() {
        return poslowieNazwaOdwrocona;
    }

    /**
     * 
     * @param poslowieNazwaOdwrocona
     *     The poslowie.nazwa_odwrocona
     */
    public void setPoslowieNazwaOdwrocona(String poslowieNazwaOdwrocona) {
        this.poslowieNazwaOdwrocona = poslowieNazwaOdwrocona;
    }

    /**
     * 
     * @return
     *     The poslowieTwitterAccountId
     */
    public String getPoslowieTwitterAccountId() {
        return poslowieTwitterAccountId;
    }

    /**
     * 
     * @param poslowieTwitterAccountId
     *     The poslowie.twitter_account_id
     */
    public void setPoslowieTwitterAccountId(String poslowieTwitterAccountId) {
        this.poslowieTwitterAccountId = poslowieTwitterAccountId;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroPrzejazdy
     */
    public Double getPoslowieWartoscBiuroPrzejazdy() {
        return poslowieWartoscBiuroPrzejazdy;
    }

    /**
     * 
     * @param poslowieWartoscBiuroPrzejazdy
     *     The poslowie.wartosc_biuro_przejazdy
     */
    public void setPoslowieWartoscBiuroPrzejazdy(Double poslowieWartoscBiuroPrzejazdy) {
        this.poslowieWartoscBiuroPrzejazdy = poslowieWartoscBiuroPrzejazdy;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaGlosowanOpuszczonych
     */
    public Integer getPoslowieLiczbaGlosowanOpuszczonych() {
        return poslowieLiczbaGlosowanOpuszczonych;
    }

    /**
     * 
     * @param poslowieLiczbaGlosowanOpuszczonych
     *     The poslowie.liczba_glosowan_opuszczonych
     */
    public void setPoslowieLiczbaGlosowanOpuszczonych(Integer poslowieLiczbaGlosowanOpuszczonych) {
        this.poslowieLiczbaGlosowanOpuszczonych = poslowieLiczbaGlosowanOpuszczonych;
    }

    /**
     * 
     * @return
     *     The poslowiePlec
     */
    public String getPoslowiePlec() {
        return poslowiePlec;
    }

    /**
     * 
     * @param poslowiePlec
     *     The poslowie.plec
     */
    public void setPoslowiePlec(String poslowiePlec) {
        this.poslowiePlec = poslowiePlec;
    }

    /**
     * 
     * @return
     *     The poslowieKadencja
     */
    public List<Integer> getPoslowieKadencja() {
        return poslowieKadencja;
    }

    /**
     * 
     * @param poslowieKadencja
     *     The poslowie.kadencja
     */
    public void setPoslowieKadencja(List<Integer> poslowieKadencja) {
        this.poslowieKadencja = poslowieKadencja;
    }

    /**
     * 
     * @return
     *     The poslowieId
     */
    public String getPoslowieId() {
        return poslowieId;
    }

    /**
     * 
     * @param poslowieId
     *     The poslowie.id
     */
    public void setPoslowieId(String poslowieId) {
        this.poslowieId = poslowieId;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscRefundacjaKwaterPln
     */
    public Integer getPoslowieWartoscRefundacjaKwaterPln() {
        return poslowieWartoscRefundacjaKwaterPln;
    }

    /**
     * 
     * @param poslowieWartoscRefundacjaKwaterPln
     *     The poslowie.wartosc_refundacja_kwater_pln
     */
    public void setPoslowieWartoscRefundacjaKwaterPln(Integer poslowieWartoscRefundacjaKwaterPln) {
        this.poslowieWartoscRefundacjaKwaterPln = poslowieWartoscRefundacjaKwaterPln;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaInterpelacji
     */
    public Integer getPoslowieLiczbaInterpelacji() {
        return poslowieLiczbaInterpelacji;
    }

    /**
     * 
     * @param poslowieLiczbaInterpelacji
     *     The poslowie.liczba_interpelacji
     */
    public void setPoslowieLiczbaInterpelacji(Integer poslowieLiczbaInterpelacji) {
        this.poslowieLiczbaInterpelacji = poslowieLiczbaInterpelacji;
    }

    /**
     * 
     * @return
     *     The poslowieNazwa
     */
    public String getPoslowieNazwa() {
        return poslowieNazwa;
    }

    /**
     * 
     * @param poslowieNazwa
     *     The poslowie.nazwa
     */
    public void setPoslowieNazwa(String poslowieNazwa) {
        this.poslowieNazwa = poslowieNazwa;
    }

    /**
     * 
     * @return
     *     The poslowieDopelniacz
     */
    public String getPoslowieDopelniacz() {
        return poslowieDopelniacz;
    }

    /**
     * 
     * @param poslowieDopelniacz
     *     The poslowie.dopelniacz
     */
    public void setPoslowieDopelniacz(String poslowieDopelniacz) {
        this.poslowieDopelniacz = poslowieDopelniacz;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroTelekomunikacja
     */
    public Double getPoslowieWartoscBiuroTelekomunikacja() {
        return poslowieWartoscBiuroTelekomunikacja;
    }

    /**
     * 
     * @param poslowieWartoscBiuroTelekomunikacja
     *     The poslowie.wartosc_biuro_telekomunikacja
     */
    public void setPoslowieWartoscBiuroTelekomunikacja(Double poslowieWartoscBiuroTelekomunikacja) {
        this.poslowieWartoscBiuroTelekomunikacja = poslowieWartoscBiuroTelekomunikacja;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaUchwalKomisjiEtyki
     */
    public Integer getPoslowieLiczbaUchwalKomisjiEtyki() {
        return poslowieLiczbaUchwalKomisjiEtyki;
    }

    /**
     * 
     * @param poslowieLiczbaUchwalKomisjiEtyki
     *     The poslowie.liczba_uchwal_komisji_etyki
     */
    public void setPoslowieLiczbaUchwalKomisjiEtyki(Integer poslowieLiczbaUchwalKomisjiEtyki) {
        this.poslowieLiczbaUchwalKomisjiEtyki = poslowieLiczbaUchwalKomisjiEtyki;
    }

    /**
     * 
     * @return
     *     The poslowieNazwisko
     */
    public String getPoslowieNazwisko() {
        return poslowieNazwisko;
    }

    /**
     * 
     * @param poslowieNazwisko
     *     The poslowie.nazwisko
     */
    public void setPoslowieNazwisko(String poslowieNazwisko) {
        this.poslowieNazwisko = poslowieNazwisko;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroBiuro
     */
    public Double getPoslowieWartoscBiuroBiuro() {
        return poslowieWartoscBiuroBiuro;
    }

    /**
     * 
     * @param poslowieWartoscBiuroBiuro
     *     The poslowie.wartosc_biuro_biuro
     */
    public void setPoslowieWartoscBiuroBiuro(Double poslowieWartoscBiuroBiuro) {
        this.poslowieWartoscBiuroBiuro = poslowieWartoscBiuroBiuro;
    }

    /**
     * 
     * @return
     *     The poslowieMiejsceUrodzenia
     */
    public String getPoslowieMiejsceUrodzenia() {
        return poslowieMiejsceUrodzenia;
    }

    /**
     * 
     * @param poslowieMiejsceUrodzenia
     *     The poslowie.miejsce_urodzenia
     */
    public void setPoslowieMiejsceUrodzenia(String poslowieMiejsceUrodzenia) {
        this.poslowieMiejsceUrodzenia = poslowieMiejsceUrodzenia;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroPodrozePracownikow
     */
    public Double getPoslowieWartoscBiuroPodrozePracownikow() {
        return poslowieWartoscBiuroPodrozePracownikow;
    }

    /**
     * 
     * @param poslowieWartoscBiuroPodrozePracownikow
     *     The poslowie.wartosc_biuro_podroze_pracownikow
     */
    public void setPoslowieWartoscBiuroPodrozePracownikow(Double poslowieWartoscBiuroPodrozePracownikow) {
        this.poslowieWartoscBiuroPodrozePracownikow = poslowieWartoscBiuroPodrozePracownikow;
    }

    /**
     * 
     * @return
     *     The poslowieKrsOsobaId
     */
    public String getPoslowieKrsOsobaId() {
        return poslowieKrsOsobaId;
    }

    /**
     * 
     * @param poslowieKrsOsobaId
     *     The poslowie.krs_osoba_id
     */
    public void setPoslowieKrsOsobaId(String poslowieKrsOsobaId) {
        this.poslowieKrsOsobaId = poslowieKrsOsobaId;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaPodkomisji
     */
    public Integer getPoslowieLiczbaPodkomisji() {
        return poslowieLiczbaPodkomisji;
    }

    /**
     * 
     * @param poslowieLiczbaPodkomisji
     *     The poslowie.liczba_podkomisji
     */
    public void setPoslowieLiczbaPodkomisji(Integer poslowieLiczbaPodkomisji) {
        this.poslowieLiczbaPodkomisji = poslowieLiczbaPodkomisji;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaPrzejazdow
     */
    public Integer getPoslowieLiczbaPrzejazdow() {
        return poslowieLiczbaPrzejazdow;
    }

    /**
     * 
     * @param poslowieLiczbaPrzejazdow
     *     The poslowie.liczba_przejazdow
     */
    public void setPoslowieLiczbaPrzejazdow(Integer poslowieLiczbaPrzejazdow) {
        this.poslowieLiczbaPrzejazdow = poslowieLiczbaPrzejazdow;
    }

    /**
     * 
     * @return
     *     The poslowieNumerNaLiscie
     */
    public Integer getPoslowieNumerNaLiscie() {
        return poslowieNumerNaLiscie;
    }

    /**
     * 
     * @param poslowieNumerNaLiscie
     *     The poslowie.numer_na_liscie
     */
    public void setPoslowieNumerNaLiscie(Integer poslowieNumerNaLiscie) {
        this.poslowieNumerNaLiscie = poslowieNumerNaLiscie;
    }

    /**
     * 
     * @return
     *     The poslowieRozliczenieId
     */
    public String getPoslowieRozliczenieId() {
        return poslowieRozliczenieId;
    }

    /**
     * 
     * @param poslowieRozliczenieId
     *     The poslowie.rozliczenie_id
     */
    public void setPoslowieRozliczenieId(String poslowieRozliczenieId) {
        this.poslowieRozliczenieId = poslowieRozliczenieId;
    }

    /**
     * 
     * @return
     *     The poslowiePkwNrListy
     */
    public String getPoslowiePkwNrListy() {
        return poslowiePkwNrListy;
    }

    /**
     * 
     * @param poslowiePkwNrListy
     *     The poslowie.pkw_nr_listy
     */
    public void setPoslowiePkwNrListy(String poslowiePkwNrListy) {
        this.poslowiePkwNrListy = poslowiePkwNrListy;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaWyjazdow
     */
    public Integer getPoslowieLiczbaWyjazdow() {
        return poslowieLiczbaWyjazdow;
    }

    /**
     * 
     * @param poslowieLiczbaWyjazdow
     *     The poslowie.liczba_wyjazdow
     */
    public void setPoslowieLiczbaWyjazdow(Integer poslowieLiczbaWyjazdow) {
        this.poslowieLiczbaWyjazdow = poslowieLiczbaWyjazdow;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaWypowiedzi
     */
    public Integer getPoslowieLiczbaWypowiedzi() {
        return poslowieLiczbaWypowiedzi;
    }

    /**
     * 
     * @param poslowieLiczbaWypowiedzi
     *     The poslowie.liczba_wypowiedzi
     */
    public void setPoslowieLiczbaWypowiedzi(Integer poslowieLiczbaWypowiedzi) {
        this.poslowieLiczbaWypowiedzi = poslowieLiczbaWypowiedzi;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaProjektowUstaw
     */
    public Integer getPoslowieLiczbaProjektowUstaw() {
        return poslowieLiczbaProjektowUstaw;
    }

    /**
     * 
     * @param poslowieLiczbaProjektowUstaw
     *     The poslowie.liczba_projektow_ustaw
     */
    public void setPoslowieLiczbaProjektowUstaw(Integer poslowieLiczbaProjektowUstaw) {
        this.poslowieLiczbaProjektowUstaw = poslowieLiczbaProjektowUstaw;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaGlosowan
     */
    public Integer getPoslowieLiczbaGlosowan() {
        return poslowieLiczbaGlosowan;
    }

    /**
     * 
     * @param poslowieLiczbaGlosowan
     *     The poslowie.liczba_glosowan
     */
    public void setPoslowieLiczbaGlosowan(Integer poslowieLiczbaGlosowan) {
        this.poslowieLiczbaGlosowan = poslowieLiczbaGlosowan;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaWnioskow
     */
    public Integer getPoslowieLiczbaWnioskow() {
        return poslowieLiczbaWnioskow;
    }

    /**
     * 
     * @param poslowieLiczbaWnioskow
     *     The poslowie.liczba_wnioskow
     */
    public void setPoslowieLiczbaWnioskow(Integer poslowieLiczbaWnioskow) {
        this.poslowieLiczbaWnioskow = poslowieLiczbaWnioskow;
    }

    /**
     * 
     * @return
     *     The poslowieMiejsceZamieszkania
     */
    public String getPoslowieMiejsceZamieszkania() {
        return poslowieMiejsceZamieszkania;
    }

    /**
     * 
     * @param poslowieMiejsceZamieszkania
     *     The poslowie.miejsce_zamieszkania
     */
    public void setPoslowieMiejsceZamieszkania(String poslowieMiejsceZamieszkania) {
        this.poslowieMiejsceZamieszkania = poslowieMiejsceZamieszkania;
    }

    /**
     * 
     * @return
     *     The poslowieMowcaId
     */
    public String getPoslowieMowcaId() {
        return poslowieMowcaId;
    }

    /**
     * 
     * @param poslowieMowcaId
     *     The poslowie.mowca_id
     */
    public void setPoslowieMowcaId(String poslowieMowcaId) {
        this.poslowieMowcaId = poslowieMowcaId;
    }

    /**
     * 
     * @return
     *     The poslowieOkregWyborczyNumer
     */
    public String getPoslowieOkregWyborczyNumer() {
        return poslowieOkregWyborczyNumer;
    }

    /**
     * 
     * @param poslowieOkregWyborczyNumer
     *     The poslowie.okreg_wyborczy_numer
     */
    public void setPoslowieOkregWyborczyNumer(String poslowieOkregWyborczyNumer) {
        this.poslowieOkregWyborczyNumer = poslowieOkregWyborczyNumer;
    }

    /**
     * 
     * @return
     *     The poslowieLiczbaSlow
     */
    public Integer getPoslowieLiczbaSlow() {
        return poslowieLiczbaSlow;
    }

    /**
     * 
     * @param poslowieLiczbaSlow
     *     The poslowie.liczba_slow
     */
    public void setPoslowieLiczbaSlow(Integer poslowieLiczbaSlow) {
        this.poslowieLiczbaSlow = poslowieLiczbaSlow;
    }

    /**
     * 
     * @return
     *     The poslowieWartoscBiuroSrodkiTrwale
     */
    public Double getPoslowieWartoscBiuroSrodkiTrwale() {
        return poslowieWartoscBiuroSrodkiTrwale;
    }

    /**
     * 
     * @param poslowieWartoscBiuroSrodkiTrwale
     *     The poslowie.wartosc_biuro_srodki_trwale
     */
    public void setPoslowieWartoscBiuroSrodkiTrwale(Double poslowieWartoscBiuroSrodkiTrwale) {
        this.poslowieWartoscBiuroSrodkiTrwale = poslowieWartoscBiuroSrodkiTrwale;
    }

    @Override
    public String toString() {
        return "Data{" +
                "ludzieId='" + ludzieId + '\'' +
                ", ludzieNazwa='" + ludzieNazwa + '\'' +
                ", ludzieSlug='" + ludzieSlug + '\'' +
                ", sejmKlubyId='" + sejmKlubyId + '\'' +
                ", sejmKlubySkrot='" + sejmKlubySkrot + '\'' +
                ", sejmKlubyNazwa='" + sejmKlubyNazwa + '\'' +
                ", poslowieWartoscBiuroInne=" + poslowieWartoscBiuroInne +
                ", poslowieWartoscBiuroEkspertyzy=" + poslowieWartoscBiuroEkspertyzy +
                ", poslowieWartoscBiuroMaterialyBiurowe=" + poslowieWartoscBiuroMaterialyBiurowe +
                ", poslowieFrekwencja=" + poslowieFrekwencja +
                ", poslowieMandatWygasl='" + poslowieMandatWygasl + '\'' +
                ", poslowieWartoscBiuroTaksowki=" + poslowieWartoscBiuroTaksowki +
                ", poslowieSejmOkregId='" + poslowieSejmOkregId + '\'' +
                ", poslowieLiczbaPrzelotow=" + poslowieLiczbaPrzelotow +
                ", poslowieWartoscBiuroZlecenia=" + poslowieWartoscBiuroZlecenia +
                ", poslowieLiczbaProjektowUchwal=" + poslowieLiczbaProjektowUchwal +
                ", poslowieImiona='" + poslowieImiona + '\'' +
                ", poslowieBiuroHtml='" + poslowieBiuroHtml + '\'' +
                ", poslowieWartoscBiuroWynagrodzeniaPracownikow=" + poslowieWartoscBiuroWynagrodzeniaPracownikow +
                ", poslowieNumerLegitymacji=" + poslowieNumerLegitymacji +
                ", poslowieDataWygasnieciaMandatu='" + poslowieDataWygasnieciaMandatu + '\'' +
                ", poslowieImiePierwsze='" + poslowieImiePierwsze + '\'' +
                ", poslowieLiczbaGlosow=" + poslowieLiczbaGlosow +
                ", poslowieProcentGlosow=" + poslowieProcentGlosow +
                ", poslowiePkwKomitetId='" + poslowiePkwKomitetId + '\'' +
                ", poslowieWartoscUposazeniaPln=" + poslowieWartoscUposazeniaPln +
                ", poslowieZawod='" + poslowieZawod + '\'' +
                ", poslowieDataUrodzenia='" + poslowieDataUrodzenia + '\'' +
                ", poslowieOkregGminyStr='" + poslowieOkregGminyStr + '\'' +
                ", poslowieImieDrugie='" + poslowieImieDrugie + '\'' +
                ", poslowieKadencjaOstatnia='" + poslowieKadencjaOstatnia + '\'' +
                ", poslowieWartoscBiuroSpotkania=" + poslowieWartoscBiuroSpotkania +
                ", poslowieLiczbaGlosowanZbuntowanych=" + poslowieLiczbaGlosowanZbuntowanych +
                ", poslowieKlubId='" + poslowieKlubId + '\'' +
                ", poslowieLiczbaKomisji=" + poslowieLiczbaKomisji +
                ", poslowieWartoscWyjazdow=" + poslowieWartoscWyjazdow +
                ", poslowieZbuntowanie=" + poslowieZbuntowanie +
                ", poslowieNazwaOdwrocona='" + poslowieNazwaOdwrocona + '\'' +
                ", poslowieTwitterAccountId='" + poslowieTwitterAccountId + '\'' +
                ", poslowieWartoscBiuroPrzejazdy=" + poslowieWartoscBiuroPrzejazdy +
                ", poslowieLiczbaGlosowanOpuszczonych=" + poslowieLiczbaGlosowanOpuszczonych +
                ", poslowiePlec='" + poslowiePlec + '\'' +
                ", poslowieKadencja=" + poslowieKadencja +
                ", poslowieId='" + poslowieId + '\'' +
                ", poslowieWartoscRefundacjaKwaterPln=" + poslowieWartoscRefundacjaKwaterPln +
                ", poslowieLiczbaInterpelacji=" + poslowieLiczbaInterpelacji +
                ", poslowieNazwa='" + poslowieNazwa + '\'' +
                ", poslowieDopelniacz='" + poslowieDopelniacz + '\'' +
                ", poslowieWartoscBiuroTelekomunikacja=" + poslowieWartoscBiuroTelekomunikacja +
                ", poslowieLiczbaUchwalKomisjiEtyki=" + poslowieLiczbaUchwalKomisjiEtyki +
                ", poslowieNazwisko='" + poslowieNazwisko + '\'' +
                ", poslowieWartoscBiuroBiuro=" + poslowieWartoscBiuroBiuro +
                ", poslowieMiejsceUrodzenia='" + poslowieMiejsceUrodzenia + '\'' +
                ", poslowieWartoscBiuroPodrozePracownikow=" + poslowieWartoscBiuroPodrozePracownikow +
                ", poslowieKrsOsobaId='" + poslowieKrsOsobaId + '\'' +
                ", poslowieLiczbaPodkomisji=" + poslowieLiczbaPodkomisji +
                ", poslowieLiczbaPrzejazdow=" + poslowieLiczbaPrzejazdow +
                ", poslowieNumerNaLiscie=" + poslowieNumerNaLiscie +
                ", poslowieRozliczenieId='" + poslowieRozliczenieId + '\'' +
                ", poslowiePkwNrListy='" + poslowiePkwNrListy + '\'' +
                ", poslowieLiczbaWyjazdow=" + poslowieLiczbaWyjazdow +
                ", poslowieLiczbaWypowiedzi=" + poslowieLiczbaWypowiedzi +
                ", poslowieLiczbaProjektowUstaw=" + poslowieLiczbaProjektowUstaw +
                ", poslowieLiczbaGlosowan=" + poslowieLiczbaGlosowan +
                ", poslowieLiczbaWnioskow=" + poslowieLiczbaWnioskow +
                ", poslowieMiejsceZamieszkania='" + poslowieMiejsceZamieszkania + '\'' +
                ", poslowieMowcaId='" + poslowieMowcaId + '\'' +
                ", poslowieOkregWyborczyNumer='" + poslowieOkregWyborczyNumer + '\'' +
                ", poslowieLiczbaSlow=" + poslowieLiczbaSlow +
                ", poslowieWartoscBiuroSrodkiTrwale=" + poslowieWartoscBiuroSrodkiTrwale +
                '}';
    }
}
