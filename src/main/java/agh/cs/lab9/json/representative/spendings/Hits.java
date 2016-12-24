package agh.cs.lab9.json.representative.spendings;

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Object getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Object maxScore) {
        this.maxScore = maxScore;
    }

    public List<Object> getHits() {
        return hits;
    }

    public void setHits(List<Object> hits) {
        this.hits = hits;
    }

}
