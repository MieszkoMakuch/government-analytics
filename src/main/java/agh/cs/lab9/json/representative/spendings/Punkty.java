
package agh.cs.lab9.json.representative.spendings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Punkty {

    @SerializedName("tytul")
    @Expose
    private String tytul;
    @SerializedName("numer")
    @Expose
    private String numer;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

}
