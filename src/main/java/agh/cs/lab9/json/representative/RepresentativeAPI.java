
package agh.cs.lab9.json.representative;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "id",
    "dataset",
    "url",
    "mp_url",
    "schema_url",
    "global_id",
    "slug",
    "score",
    "data",
    "layers",
    "Aggs"
})
public class RepresentativeAPI {

    @JsonProperty("id")
    private String id;
    @JsonProperty("dataset")
    private String dataset;
    @JsonProperty("url")
    private String url;
    @JsonProperty("mp_url")
    private String mpUrl;
    @JsonProperty("schema_url")
    private String schemaUrl;
    @JsonProperty("global_id")
    private String globalId;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("score")
    private Object score;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("layers")
    private Layers layers;
    @JsonProperty("Aggs")
    private Aggs aggs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("dataset")
    public String getDataset() {
        return dataset;
    }

    @JsonProperty("dataset")
    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("mp_url")
    public String getMpUrl() {
        return mpUrl;
    }

    @JsonProperty("mp_url")
    public void setMpUrl(String mpUrl) {
        this.mpUrl = mpUrl;
    }

    @JsonProperty("schema_url")
    public String getSchemaUrl() {
        return schemaUrl;
    }

    @JsonProperty("schema_url")
    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }

    @JsonProperty("global_id")
    public String getGlobalId() {
        return globalId;
    }

    @JsonProperty("global_id")
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("score")
    public Object getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Object score) {
        this.score = score;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("layers")
    public Layers getLayers() {
        return layers;
    }

    @JsonProperty("layers")
    public void setLayers(Layers layers) {
        this.layers = layers;
    }

    @JsonProperty("Aggs")
    public Aggs getAggs() {
        return aggs;
    }

    @JsonProperty("Aggs")
    public void setAggs(Aggs aggs) {
        this.aggs = aggs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
