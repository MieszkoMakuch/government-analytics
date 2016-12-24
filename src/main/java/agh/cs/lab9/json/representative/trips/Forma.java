package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forma {

    @SerializedName("typ_id")
    @Expose
    private String typId;

    public String getTypId() {
        return typId;
    }

    public void setTypId(String typId) {
        this.typId = typId;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "typId='" + typId + '\'' +
                '}';
    }
}
