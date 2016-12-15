
package agh.cs.lab9.json.representative.spendings;

import agh.cs.lab9.json.AbstractAPI;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RepresentativeSpendingsAPI extends AbstractAPI {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMpUrl() {
        return mpUrl;
    }

    public void setMpUrl(String mpUrl) {
        this.mpUrl = mpUrl;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Layers getLayers() {
        return layers;
    }

    public void setLayers(Layers layers) {
        this.layers = layers;
    }

    public Aggs getAggs() {
        return aggs;
    }

    public void setAggs(Aggs aggs) {
        this.aggs = aggs;
    }

    @Override
    public String toString() {
        return "RepresentativeSpendingsAPI{" +
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
