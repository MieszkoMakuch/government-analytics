
package agh.cs.lab9.json.representative.spendings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("doc_count")
    @Expose
    private Integer docCount;
    @SerializedName("page")
    @Expose
    private Page_ page;

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public Page_ getPage() {
        return page;
    }

    public void setPage(Page_ page) {
        this.page = page;
    }

}
