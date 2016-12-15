
package agh.cs.lab9.json.representative.spendings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private Integer poslowieWartoscBiuroEkspertyzy;
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
    private Integer poslowieWartoscBiuroTaksowki;
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
    private Integer poslowieWartoscBiuroSpotkania;
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

    public String getLudzieId() {
        return ludzieId;
    }

    public void setLudzieId(String ludzieId) {
        this.ludzieId = ludzieId;
    }

    public String getLudzieNazwa() {
        return ludzieNazwa;
    }

    public void setLudzieNazwa(String ludzieNazwa) {
        this.ludzieNazwa = ludzieNazwa;
    }

    public String getLudzieSlug() {
        return ludzieSlug;
    }

    public void setLudzieSlug(String ludzieSlug) {
        this.ludzieSlug = ludzieSlug;
    }

    public String getSejmKlubyId() {
        return sejmKlubyId;
    }

    public void setSejmKlubyId(String sejmKlubyId) {
        this.sejmKlubyId = sejmKlubyId;
    }

    public String getSejmKlubySkrot() {
        return sejmKlubySkrot;
    }

    public void setSejmKlubySkrot(String sejmKlubySkrot) {
        this.sejmKlubySkrot = sejmKlubySkrot;
    }

    public String getSejmKlubyNazwa() {
        return sejmKlubyNazwa;
    }

    public void setSejmKlubyNazwa(String sejmKlubyNazwa) {
        this.sejmKlubyNazwa = sejmKlubyNazwa;
    }

    public Double getPoslowieWartoscBiuroInne() {
        return poslowieWartoscBiuroInne;
    }

    public void setPoslowieWartoscBiuroInne(Double poslowieWartoscBiuroInne) {
        this.poslowieWartoscBiuroInne = poslowieWartoscBiuroInne;
    }

    public Integer getPoslowieWartoscBiuroEkspertyzy() {
        return poslowieWartoscBiuroEkspertyzy;
    }

    public void setPoslowieWartoscBiuroEkspertyzy(Integer poslowieWartoscBiuroEkspertyzy) {
        this.poslowieWartoscBiuroEkspertyzy = poslowieWartoscBiuroEkspertyzy;
    }

    public Double getPoslowieWartoscBiuroMaterialyBiurowe() {
        return poslowieWartoscBiuroMaterialyBiurowe;
    }

    public void setPoslowieWartoscBiuroMaterialyBiurowe(Double poslowieWartoscBiuroMaterialyBiurowe) {
        this.poslowieWartoscBiuroMaterialyBiurowe = poslowieWartoscBiuroMaterialyBiurowe;
    }

    public Double getPoslowieFrekwencja() {
        return poslowieFrekwencja;
    }

    public void setPoslowieFrekwencja(Double poslowieFrekwencja) {
        this.poslowieFrekwencja = poslowieFrekwencja;
    }

    public String getPoslowieMandatWygasl() {
        return poslowieMandatWygasl;
    }

    public void setPoslowieMandatWygasl(String poslowieMandatWygasl) {
        this.poslowieMandatWygasl = poslowieMandatWygasl;
    }

    public Integer getPoslowieWartoscBiuroTaksowki() {
        return poslowieWartoscBiuroTaksowki;
    }

    public void setPoslowieWartoscBiuroTaksowki(Integer poslowieWartoscBiuroTaksowki) {
        this.poslowieWartoscBiuroTaksowki = poslowieWartoscBiuroTaksowki;
    }

    public String getPoslowieSejmOkregId() {
        return poslowieSejmOkregId;
    }

    public void setPoslowieSejmOkregId(String poslowieSejmOkregId) {
        this.poslowieSejmOkregId = poslowieSejmOkregId;
    }

    public Integer getPoslowieLiczbaPrzelotow() {
        return poslowieLiczbaPrzelotow;
    }

    public void setPoslowieLiczbaPrzelotow(Integer poslowieLiczbaPrzelotow) {
        this.poslowieLiczbaPrzelotow = poslowieLiczbaPrzelotow;
    }

    public Double getPoslowieWartoscBiuroZlecenia() {
        return poslowieWartoscBiuroZlecenia;
    }

    public void setPoslowieWartoscBiuroZlecenia(Double poslowieWartoscBiuroZlecenia) {
        this.poslowieWartoscBiuroZlecenia = poslowieWartoscBiuroZlecenia;
    }

    public Integer getPoslowieLiczbaProjektowUchwal() {
        return poslowieLiczbaProjektowUchwal;
    }

    public void setPoslowieLiczbaProjektowUchwal(Integer poslowieLiczbaProjektowUchwal) {
        this.poslowieLiczbaProjektowUchwal = poslowieLiczbaProjektowUchwal;
    }

    public String getPoslowieImiona() {
        return poslowieImiona;
    }

    public void setPoslowieImiona(String poslowieImiona) {
        this.poslowieImiona = poslowieImiona;
    }

    public String getPoslowieBiuroHtml() {
        return poslowieBiuroHtml;
    }

    public void setPoslowieBiuroHtml(String poslowieBiuroHtml) {
        this.poslowieBiuroHtml = poslowieBiuroHtml;
    }

    public Double getPoslowieWartoscBiuroWynagrodzeniaPracownikow() {
        return poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    public void setPoslowieWartoscBiuroWynagrodzeniaPracownikow(Double poslowieWartoscBiuroWynagrodzeniaPracownikow) {
        this.poslowieWartoscBiuroWynagrodzeniaPracownikow = poslowieWartoscBiuroWynagrodzeniaPracownikow;
    }

    public Integer getPoslowieNumerLegitymacji() {
        return poslowieNumerLegitymacji;
    }

    public void setPoslowieNumerLegitymacji(Integer poslowieNumerLegitymacji) {
        this.poslowieNumerLegitymacji = poslowieNumerLegitymacji;
    }

    public String getPoslowieDataWygasnieciaMandatu() {
        return poslowieDataWygasnieciaMandatu;
    }

    public void setPoslowieDataWygasnieciaMandatu(String poslowieDataWygasnieciaMandatu) {
        this.poslowieDataWygasnieciaMandatu = poslowieDataWygasnieciaMandatu;
    }

    public String getPoslowieImiePierwsze() {
        return poslowieImiePierwsze;
    }

    public void setPoslowieImiePierwsze(String poslowieImiePierwsze) {
        this.poslowieImiePierwsze = poslowieImiePierwsze;
    }

    public Integer getPoslowieLiczbaGlosow() {
        return poslowieLiczbaGlosow;
    }

    public void setPoslowieLiczbaGlosow(Integer poslowieLiczbaGlosow) {
        this.poslowieLiczbaGlosow = poslowieLiczbaGlosow;
    }

    public Double getPoslowieProcentGlosow() {
        return poslowieProcentGlosow;
    }

    public void setPoslowieProcentGlosow(Double poslowieProcentGlosow) {
        this.poslowieProcentGlosow = poslowieProcentGlosow;
    }

    public String getPoslowiePkwKomitetId() {
        return poslowiePkwKomitetId;
    }

    public void setPoslowiePkwKomitetId(String poslowiePkwKomitetId) {
        this.poslowiePkwKomitetId = poslowiePkwKomitetId;
    }

    public Double getPoslowieWartoscUposazeniaPln() {
        return poslowieWartoscUposazeniaPln;
    }

    public void setPoslowieWartoscUposazeniaPln(Double poslowieWartoscUposazeniaPln) {
        this.poslowieWartoscUposazeniaPln = poslowieWartoscUposazeniaPln;
    }

    public String getPoslowieZawod() {
        return poslowieZawod;
    }

    public void setPoslowieZawod(String poslowieZawod) {
        this.poslowieZawod = poslowieZawod;
    }

    public String getPoslowieDataUrodzenia() {
        return poslowieDataUrodzenia;
    }

    public void setPoslowieDataUrodzenia(String poslowieDataUrodzenia) {
        this.poslowieDataUrodzenia = poslowieDataUrodzenia;
    }

    public String getPoslowieOkregGminyStr() {
        return poslowieOkregGminyStr;
    }

    public void setPoslowieOkregGminyStr(String poslowieOkregGminyStr) {
        this.poslowieOkregGminyStr = poslowieOkregGminyStr;
    }

    public String getPoslowieImieDrugie() {
        return poslowieImieDrugie;
    }

    public void setPoslowieImieDrugie(String poslowieImieDrugie) {
        this.poslowieImieDrugie = poslowieImieDrugie;
    }

    public String getPoslowieKadencjaOstatnia() {
        return poslowieKadencjaOstatnia;
    }

    public void setPoslowieKadencjaOstatnia(String poslowieKadencjaOstatnia) {
        this.poslowieKadencjaOstatnia = poslowieKadencjaOstatnia;
    }

    public Integer getPoslowieWartoscBiuroSpotkania() {
        return poslowieWartoscBiuroSpotkania;
    }

    public void setPoslowieWartoscBiuroSpotkania(Integer poslowieWartoscBiuroSpotkania) {
        this.poslowieWartoscBiuroSpotkania = poslowieWartoscBiuroSpotkania;
    }

    public Integer getPoslowieLiczbaGlosowanZbuntowanych() {
        return poslowieLiczbaGlosowanZbuntowanych;
    }

    public void setPoslowieLiczbaGlosowanZbuntowanych(Integer poslowieLiczbaGlosowanZbuntowanych) {
        this.poslowieLiczbaGlosowanZbuntowanych = poslowieLiczbaGlosowanZbuntowanych;
    }

    public String getPoslowieKlubId() {
        return poslowieKlubId;
    }

    public void setPoslowieKlubId(String poslowieKlubId) {
        this.poslowieKlubId = poslowieKlubId;
    }

    public Integer getPoslowieLiczbaKomisji() {
        return poslowieLiczbaKomisji;
    }

    public void setPoslowieLiczbaKomisji(Integer poslowieLiczbaKomisji) {
        this.poslowieLiczbaKomisji = poslowieLiczbaKomisji;
    }

    public Double getPoslowieWartoscWyjazdow() {
        return poslowieWartoscWyjazdow;
    }

    public void setPoslowieWartoscWyjazdow(Double poslowieWartoscWyjazdow) {
        this.poslowieWartoscWyjazdow = poslowieWartoscWyjazdow;
    }

    public Double getPoslowieZbuntowanie() {
        return poslowieZbuntowanie;
    }

    public void setPoslowieZbuntowanie(Double poslowieZbuntowanie) {
        this.poslowieZbuntowanie = poslowieZbuntowanie;
    }

    public String getPoslowieNazwaOdwrocona() {
        return poslowieNazwaOdwrocona;
    }

    public void setPoslowieNazwaOdwrocona(String poslowieNazwaOdwrocona) {
        this.poslowieNazwaOdwrocona = poslowieNazwaOdwrocona;
    }

    public String getPoslowieTwitterAccountId() {
        return poslowieTwitterAccountId;
    }

    public void setPoslowieTwitterAccountId(String poslowieTwitterAccountId) {
        this.poslowieTwitterAccountId = poslowieTwitterAccountId;
    }

    public Double getPoslowieWartoscBiuroPrzejazdy() {
        return poslowieWartoscBiuroPrzejazdy;
    }

    public void setPoslowieWartoscBiuroPrzejazdy(Double poslowieWartoscBiuroPrzejazdy) {
        this.poslowieWartoscBiuroPrzejazdy = poslowieWartoscBiuroPrzejazdy;
    }

    public Integer getPoslowieLiczbaGlosowanOpuszczonych() {
        return poslowieLiczbaGlosowanOpuszczonych;
    }

    public void setPoslowieLiczbaGlosowanOpuszczonych(Integer poslowieLiczbaGlosowanOpuszczonych) {
        this.poslowieLiczbaGlosowanOpuszczonych = poslowieLiczbaGlosowanOpuszczonych;
    }

    public String getPoslowiePlec() {
        return poslowiePlec;
    }

    public void setPoslowiePlec(String poslowiePlec) {
        this.poslowiePlec = poslowiePlec;
    }

    public List<Integer> getPoslowieKadencja() {
        return poslowieKadencja;
    }

    public void setPoslowieKadencja(List<Integer> poslowieKadencja) {
        this.poslowieKadencja = poslowieKadencja;
    }

    public String getPoslowieId() {
        return poslowieId;
    }

    public void setPoslowieId(String poslowieId) {
        this.poslowieId = poslowieId;
    }

    public Integer getPoslowieWartoscRefundacjaKwaterPln() {
        return poslowieWartoscRefundacjaKwaterPln;
    }

    public void setPoslowieWartoscRefundacjaKwaterPln(Integer poslowieWartoscRefundacjaKwaterPln) {
        this.poslowieWartoscRefundacjaKwaterPln = poslowieWartoscRefundacjaKwaterPln;
    }

    public Integer getPoslowieLiczbaInterpelacji() {
        return poslowieLiczbaInterpelacji;
    }

    public void setPoslowieLiczbaInterpelacji(Integer poslowieLiczbaInterpelacji) {
        this.poslowieLiczbaInterpelacji = poslowieLiczbaInterpelacji;
    }

    public String getPoslowieNazwa() {
        return poslowieNazwa;
    }

    public void setPoslowieNazwa(String poslowieNazwa) {
        this.poslowieNazwa = poslowieNazwa;
    }

    public String getPoslowieDopelniacz() {
        return poslowieDopelniacz;
    }

    public void setPoslowieDopelniacz(String poslowieDopelniacz) {
        this.poslowieDopelniacz = poslowieDopelniacz;
    }

    public Double getPoslowieWartoscBiuroTelekomunikacja() {
        return poslowieWartoscBiuroTelekomunikacja;
    }

    public void setPoslowieWartoscBiuroTelekomunikacja(Double poslowieWartoscBiuroTelekomunikacja) {
        this.poslowieWartoscBiuroTelekomunikacja = poslowieWartoscBiuroTelekomunikacja;
    }

    public Integer getPoslowieLiczbaUchwalKomisjiEtyki() {
        return poslowieLiczbaUchwalKomisjiEtyki;
    }

    public void setPoslowieLiczbaUchwalKomisjiEtyki(Integer poslowieLiczbaUchwalKomisjiEtyki) {
        this.poslowieLiczbaUchwalKomisjiEtyki = poslowieLiczbaUchwalKomisjiEtyki;
    }

    public String getPoslowieNazwisko() {
        return poslowieNazwisko;
    }

    public void setPoslowieNazwisko(String poslowieNazwisko) {
        this.poslowieNazwisko = poslowieNazwisko;
    }

    public Double getPoslowieWartoscBiuroBiuro() {
        return poslowieWartoscBiuroBiuro;
    }

    public void setPoslowieWartoscBiuroBiuro(Double poslowieWartoscBiuroBiuro) {
        this.poslowieWartoscBiuroBiuro = poslowieWartoscBiuroBiuro;
    }

    public String getPoslowieMiejsceUrodzenia() {
        return poslowieMiejsceUrodzenia;
    }

    public void setPoslowieMiejsceUrodzenia(String poslowieMiejsceUrodzenia) {
        this.poslowieMiejsceUrodzenia = poslowieMiejsceUrodzenia;
    }

    public Double getPoslowieWartoscBiuroPodrozePracownikow() {
        return poslowieWartoscBiuroPodrozePracownikow;
    }

    public void setPoslowieWartoscBiuroPodrozePracownikow(Double poslowieWartoscBiuroPodrozePracownikow) {
        this.poslowieWartoscBiuroPodrozePracownikow = poslowieWartoscBiuroPodrozePracownikow;
    }

    public String getPoslowieKrsOsobaId() {
        return poslowieKrsOsobaId;
    }

    public void setPoslowieKrsOsobaId(String poslowieKrsOsobaId) {
        this.poslowieKrsOsobaId = poslowieKrsOsobaId;
    }

    public Integer getPoslowieLiczbaPodkomisji() {
        return poslowieLiczbaPodkomisji;
    }

    public void setPoslowieLiczbaPodkomisji(Integer poslowieLiczbaPodkomisji) {
        this.poslowieLiczbaPodkomisji = poslowieLiczbaPodkomisji;
    }

    public Integer getPoslowieLiczbaPrzejazdow() {
        return poslowieLiczbaPrzejazdow;
    }

    public void setPoslowieLiczbaPrzejazdow(Integer poslowieLiczbaPrzejazdow) {
        this.poslowieLiczbaPrzejazdow = poslowieLiczbaPrzejazdow;
    }

    public Integer getPoslowieNumerNaLiscie() {
        return poslowieNumerNaLiscie;
    }

    public void setPoslowieNumerNaLiscie(Integer poslowieNumerNaLiscie) {
        this.poslowieNumerNaLiscie = poslowieNumerNaLiscie;
    }

    public String getPoslowieRozliczenieId() {
        return poslowieRozliczenieId;
    }

    public void setPoslowieRozliczenieId(String poslowieRozliczenieId) {
        this.poslowieRozliczenieId = poslowieRozliczenieId;
    }

    public String getPoslowiePkwNrListy() {
        return poslowiePkwNrListy;
    }

    public void setPoslowiePkwNrListy(String poslowiePkwNrListy) {
        this.poslowiePkwNrListy = poslowiePkwNrListy;
    }

    public Integer getPoslowieLiczbaWyjazdow() {
        return poslowieLiczbaWyjazdow;
    }

    public void setPoslowieLiczbaWyjazdow(Integer poslowieLiczbaWyjazdow) {
        this.poslowieLiczbaWyjazdow = poslowieLiczbaWyjazdow;
    }

    public Integer getPoslowieLiczbaWypowiedzi() {
        return poslowieLiczbaWypowiedzi;
    }

    public void setPoslowieLiczbaWypowiedzi(Integer poslowieLiczbaWypowiedzi) {
        this.poslowieLiczbaWypowiedzi = poslowieLiczbaWypowiedzi;
    }

    public Integer getPoslowieLiczbaProjektowUstaw() {
        return poslowieLiczbaProjektowUstaw;
    }

    public void setPoslowieLiczbaProjektowUstaw(Integer poslowieLiczbaProjektowUstaw) {
        this.poslowieLiczbaProjektowUstaw = poslowieLiczbaProjektowUstaw;
    }

    public Integer getPoslowieLiczbaGlosowan() {
        return poslowieLiczbaGlosowan;
    }

    public void setPoslowieLiczbaGlosowan(Integer poslowieLiczbaGlosowan) {
        this.poslowieLiczbaGlosowan = poslowieLiczbaGlosowan;
    }

    public Integer getPoslowieLiczbaWnioskow() {
        return poslowieLiczbaWnioskow;
    }

    public void setPoslowieLiczbaWnioskow(Integer poslowieLiczbaWnioskow) {
        this.poslowieLiczbaWnioskow = poslowieLiczbaWnioskow;
    }

    public String getPoslowieMiejsceZamieszkania() {
        return poslowieMiejsceZamieszkania;
    }

    public void setPoslowieMiejsceZamieszkania(String poslowieMiejsceZamieszkania) {
        this.poslowieMiejsceZamieszkania = poslowieMiejsceZamieszkania;
    }

    public String getPoslowieMowcaId() {
        return poslowieMowcaId;
    }

    public void setPoslowieMowcaId(String poslowieMowcaId) {
        this.poslowieMowcaId = poslowieMowcaId;
    }

    public String getPoslowieOkregWyborczyNumer() {
        return poslowieOkregWyborczyNumer;
    }

    public void setPoslowieOkregWyborczyNumer(String poslowieOkregWyborczyNumer) {
        this.poslowieOkregWyborczyNumer = poslowieOkregWyborczyNumer;
    }

    public Integer getPoslowieLiczbaSlow() {
        return poslowieLiczbaSlow;
    }

    public void setPoslowieLiczbaSlow(Integer poslowieLiczbaSlow) {
        this.poslowieLiczbaSlow = poslowieLiczbaSlow;
    }

    public Double getPoslowieWartoscBiuroSrodkiTrwale() {
        return poslowieWartoscBiuroSrodkiTrwale;
    }

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
