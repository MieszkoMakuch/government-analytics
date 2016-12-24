package agh.cs.lab9.json.representative;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page_ {

    @SerializedName("hits")
    @Expose
    private Hits hits;

    /**
     * @return The hits
     */
    public Hits getHits() {
        return hits;
    }

    /**
     * @param hits The hits
     */
    public void setHits(Hits hits) {
        this.hits = hits;
    }

}
