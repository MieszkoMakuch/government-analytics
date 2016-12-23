
package agh.cs.lab9.json.representative.spendings;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Roczniki {

    @SerializedName("pola")
    @Expose
    private List<BigDecimal> pola = null;
    @SerializedName("dokument_id")
    @Expose
    private String dokumentId;
    @SerializedName("rok")
    @Expose
    private int rok;

    public List<BigDecimal> getPola() {
        return pola;
    }

    public void setPola(List<BigDecimal> pola) {
        this.pola = pola;
    }

    public String getDokumentId() {
        return dokumentId;
    }

    public void setDokumentId(String dokumentId) {
        this.dokumentId = dokumentId;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Roczniki{" +
                "pola=" + pola +
                ", dokumentId='" + dokumentId + '\'' +
                ", rok=" + rok +
                '}';
    }
}
