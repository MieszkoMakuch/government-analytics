
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organizacja {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nazwa")
    @Expose
    private String nazwa;
    @SerializedName("forma_prawna_str")
    @Expose
    private String formaPrawnaStr;
    @SerializedName("kapital_zakladowy")
    @Expose
    private String kapitalZakladowy;
    @SerializedName("cel_dzialania")
    @Expose
    private String celDzialania;
    @SerializedName("data_rejestracji")
    @Expose
    private String dataRejestracji;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getFormaPrawnaStr() {
        return formaPrawnaStr;
    }

    public void setFormaPrawnaStr(String formaPrawnaStr) {
        this.formaPrawnaStr = formaPrawnaStr;
    }

    public String getKapitalZakladowy() {
        return kapitalZakladowy;
    }

    public void setKapitalZakladowy(String kapitalZakladowy) {
        this.kapitalZakladowy = kapitalZakladowy;
    }

    public String getCelDzialania() {
        return celDzialania;
    }

    public void setCelDzialania(String celDzialania) {
        this.celDzialania = celDzialania;
    }

    public String getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(String dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }

    @Override
    public String toString() {
        return "Organizacja{" +
                "id='" + id + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", formaPrawnaStr='" + formaPrawnaStr + '\'' +
                ", kapitalZakladowy='" + kapitalZakladowy + '\'' +
                ", celDzialania='" + celDzialania + '\'' +
                ", dataRejestracji='" + dataRejestracji + '\'' +
                '}';
    }
}
