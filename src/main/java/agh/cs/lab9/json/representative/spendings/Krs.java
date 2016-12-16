
package agh.cs.lab9.json.representative.spendings;

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
    "biznes",
    "ngo"
})
public class Krs {

    @JsonProperty("biznes")
    private List<Object> biznes = null;
    @JsonProperty("ngo")
    private List<Object> ngo = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("biznes")
    public List<Object> getBiznes() {
        return biznes;
    }

    @JsonProperty("biznes")
    public void setBiznes(List<Object> biznes) {
        this.biznes = biznes;
    }

    @JsonProperty("ngo")
    public List<Object> getNgo() {
        return ngo;
    }

    @JsonProperty("ngo")
    public void setNgo(List<Object> ngo) {
        this.ngo = ngo;
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
