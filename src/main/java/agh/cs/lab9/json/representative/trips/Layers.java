
package agh.cs.lab9.json.representative.trips;

import java.util.HashMap;
import java.util.List;
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
    "wyjazdy"
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
    @JsonProperty("wyjazdy")
    private List<Wyjazdy> wyjazdy = null;
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

    @JsonProperty("wyjazdy")
    public List<Wyjazdy> getWyjazdy() {
        return wyjazdy;
    }

    @JsonProperty("wyjazdy")
    public void setWyjazdy(List<Wyjazdy> wyjazdy) {
        this.wyjazdy = wyjazdy;
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
