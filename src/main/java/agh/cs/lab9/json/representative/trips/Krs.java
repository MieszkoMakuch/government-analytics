package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Krs {

    @SerializedName("biznes")
    @Expose
    private List<Object> biznes = null;
    @SerializedName("ngo")
    @Expose
    private List<Ngo> ngo = null;

    public List<Object> getBiznes() {
        return biznes;
    }

    public void setBiznes(List<Object> biznes) {
        this.biznes = biznes;
    }

    public List<Ngo> getNgo() {
        return ngo;
    }

    public void setNgo(List<Ngo> ngo) {
        this.ngo = ngo;
    }

    @Override
    public String toString() {
        return "Krs{" +
                "biznes=" + biznes +
                ", ngo=" + ngo +
                '}';
    }
}
