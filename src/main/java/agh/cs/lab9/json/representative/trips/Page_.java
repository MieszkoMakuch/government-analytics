
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page_ {

    @SerializedName("hits")
    @Expose
    private Hits hits;

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Page_{" +
                "hits=" + hits +
                '}';
    }
}
