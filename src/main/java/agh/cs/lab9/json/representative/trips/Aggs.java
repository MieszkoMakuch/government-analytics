
package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aggs {

    @SerializedName("_page")
    @Expose
    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Aggs{" +
                "page=" + page +
                '}';
    }
}
