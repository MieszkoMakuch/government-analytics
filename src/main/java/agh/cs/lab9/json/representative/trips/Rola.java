
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rola {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("deleted")
    @Expose
    private String deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Rola{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", deleted='" + deleted + '\'' +
                '}';
    }
}
