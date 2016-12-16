
package agh.cs.lab9.json.representative;

import agh.cs.lab9.json.AbstractAPI;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RepresentativeAPI extends AbstractAPI{


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("dataset")
    @Expose
    private String dataset;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("mp_url")
    @Expose
    private String mpUrl;
    @SerializedName("schema_url")
    @Expose
    private String schemaUrl;
    @SerializedName("global_id")
    @Expose
    private String globalId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("score")
    @Expose
    private Object score;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("layers")
    @Expose
    private Layers layers;
    @SerializedName("Aggs")
    @Expose
    private Aggs aggs;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The dataset
     */
    public String getDataset() {
        return dataset;
    }

    /**
     * 
     * @param dataset
     *     The dataset
     */
    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The mpUrl
     */
    public String getMpUrl() {
        return mpUrl;
    }

    /**
     * 
     * @param mpUrl
     *     The mp_url
     */
    public void setMpUrl(String mpUrl) {
        this.mpUrl = mpUrl;
    }

    /**
     * 
     * @return
     *     The schemaUrl
     */
    public String getSchemaUrl() {
        return schemaUrl;
    }

    /**
     * 
     * @param schemaUrl
     *     The schema_url
     */
    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }

    /**
     * 
     * @return
     *     The globalId
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * 
     * @param globalId
     *     The global_id
     */
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The score
     */
    public Object getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Object score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The layers
     */
    public Layers getLayers() {
        return layers;
    }

    /**
     * 
     * @param layers
     *     The layers
     */
    public void setLayers(Layers layers) {
        this.layers = layers;
    }

    /**
     * 
     * @return
     *     The aggs
     */
    public Aggs getAggs() {
        return aggs;
    }

    /**
     * 
     * @param aggs
     *     The Aggs
     */
    public void setAggs(Aggs aggs) {
        this.aggs = aggs;
    }

    @Override
    public String toString() {
        return "RepresentativeAPI{" +
                "id='" + id + '\'' +
                ", dataset='" + dataset + '\'' +
                ", url='" + url + '\'' +
                ", mpUrl='" + mpUrl + '\'' +
                ", schemaUrl='" + schemaUrl + '\'' +
                ", globalId='" + globalId + '\'' +
                ", slug='" + slug + '\'' +
                ", score=" + score +
                ", data=" + data +
                ", layers=" + layers +
                ", aggs=" + aggs +
                '}';
    }
}