package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ngo {

    @SerializedName("organizacja")
    @Expose
    private Organizacja organizacja;
    @SerializedName("rola")
    @Expose
    private Rola rola;
    @SerializedName("forma")
    @Expose
    private Forma forma;

    public Organizacja getOrganizacja() {
        return organizacja;
    }

    public void setOrganizacja(Organizacja organizacja) {
        this.organizacja = organizacja;
    }

    public Rola getRola() {
        return rola;
    }

    public void setRola(Rola rola) {
        this.rola = rola;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Ngo{" +
                "organizacja=" + organizacja +
                ", rola=" + rola +
                ", forma=" + forma +
                '}';
    }
}
