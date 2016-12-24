package agh.cs.lab9.json.representative;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("doc_count")
    @Expose
    private Integer docCount;
    @SerializedName("page")
    @Expose
    private Page_ page;

    /**
     * @return The docCount
     */
    public Integer getDocCount() {
        return docCount;
    }

    /**
     * @param docCount The doc_count
     */
    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    /**
     * @return The page
     */
    public Page_ getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Page_ page) {
        this.page = page;
    }

}
