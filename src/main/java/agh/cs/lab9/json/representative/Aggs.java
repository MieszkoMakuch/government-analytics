
package agh.cs.lab9.json.representative;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aggs {

    @SerializedName("_page")
    @Expose
    private Page page;

    /**
     * 
     * @return
     *     The page
     */
    public Page getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The _page
     */
    public void setPage(Page page) {
        this.page = page;
    }

}
