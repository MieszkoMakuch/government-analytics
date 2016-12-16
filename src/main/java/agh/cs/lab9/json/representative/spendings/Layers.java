
package agh.cs.lab9.json.representative.spendings;

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
    "dataset",
    "channels",
    "page",
    "subscribers",
    "krs",
    "wydatki"
})
public class Layers {

    @JsonProperty("dataset")
    private Object dataset;
    @JsonProperty("channels")
    private Object channels;
    @JsonProperty("page")
    private Object page;
    @JsonProperty("subscribers")
    private Object subscribers;
    @JsonProperty("krs")
    private Krs krs;
    @JsonProperty("wydatki")
    private Wydatki wydatki;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataset")
    public Object getDataset() {
        return dataset;
    }

    @JsonProperty("dataset")
    public void setDataset(Object dataset) {
        this.dataset = dataset;
    }

    @JsonProperty("channels")
    public Object getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(Object channels) {
        this.channels = channels;
    }

    @JsonProperty("page")
    public Object getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Object page) {
        this.page = page;
    }

    @JsonProperty("subscribers")
    public Object getSubscribers() {
        return subscribers;
    }

    @JsonProperty("subscribers")
    public void setSubscribers(Object subscribers) {
        this.subscribers = subscribers;
    }

    @JsonProperty("krs")
    public Krs getKrs() {
        return krs;
    }

    @JsonProperty("krs")
    public void setKrs(Krs krs) {
        this.krs = krs;
    }

    @JsonProperty("wydatki")
    public Wydatki getWydatki() {
        return wydatki;
    }

    @JsonProperty("wydatki")
    public void setWydatki(Wydatki wydatki) {
        this.wydatki = wydatki;
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
