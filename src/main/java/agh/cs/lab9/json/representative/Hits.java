package agh.cs.lab9.json.representative;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hits {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("max_score")
    @Expose
    private Object maxScore;
    @SerializedName("hits")
    @Expose
    private List<Object> hits = null;

    /**
     * @return The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return The maxScore
     */
    public Object getMaxScore() {
        return maxScore;
    }

    /**
     * @param maxScore The max_score
     */
    public void setMaxScore(Object maxScore) {
        this.maxScore = maxScore;
    }

    /**
     * @return The hits
     */
    public List<Object> getHits() {
        return hits;
    }

    /**
     * @param hits The hits
     */
    public void setHits(List<Object> hits) {
        this.hits = hits;
    }

}
