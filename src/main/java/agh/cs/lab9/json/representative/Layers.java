
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
    "dataset",
    "channels",
    "page",
    "subscribers"
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
