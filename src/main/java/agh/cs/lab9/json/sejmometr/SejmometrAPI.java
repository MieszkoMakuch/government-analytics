
package agh.cs.lab9.json.sejmometr;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SejmometrAPI {

    @SerializedName("Dataobject")
    @Expose
    private List<Dataobject> dataobject = null;
    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("Took")
    @Expose
    private Integer took;
    @SerializedName("Links")
    @Expose
    private Links links;

    /**
     * 
     * @return
     *     The dataobject
     */
    public List<Dataobject> getDataobject() {
        return dataobject;
    }

    /**
     * 
     * @param dataobject
     *     The Dataobject
     */
    public void setDataobject(List<Dataobject> dataobject) {
        this.dataobject = dataobject;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The Count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The took
     */
    public Integer getTook() {
        return took;
    }

    /**
     * 
     * @param took
     *     The Took
     */
    public void setTook(Integer took) {
        this.took = took;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The Links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "SejmometrAPI{" +
                "dataobject=" + dataobject +
                ", count=" + count +
                ", took=" + took +
                ", links=" + links +
                '}';
    }
}
