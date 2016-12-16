
package agh.cs.lab9.json.sejmometr;

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
    "Dataobject",
    "Count",
    "Took",
    "Links"
})
public class SejmometrAPI {

    @JsonProperty("Dataobject")
    private List<Dataobject> dataobject = null;
    @JsonProperty("Count")
    private Integer count;
    @JsonProperty("Took")
    private Integer took;
    @JsonProperty("Links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Dataobject")
    public List<Dataobject> getDataobject() {
        return dataobject;
    }

    @JsonProperty("Dataobject")
    public void setDataobject(List<Dataobject> dataobject) {
        this.dataobject = dataobject;
    }

    @JsonProperty("Count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("Count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("Took")
    public Integer getTook() {
        return took;
    }

    @JsonProperty("Took")
    public void setTook(Integer took) {
        this.took = took;
    }

    @JsonProperty("Links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "SejmometrAPI{" +
                "dataobject=" + dataobject +
                ", count=" + count +
                ", took=" + took +
                ", links=" + links +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
