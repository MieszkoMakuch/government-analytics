
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
    "tytul",
    "numer"
})
public class Punkty {

    @JsonProperty("tytul")
    private String tytul;
    @JsonProperty("numer")
    private String numer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tytul")
    public String getTytul() {
        return tytul;
    }

    @JsonProperty("tytul")
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @JsonProperty("numer")
    public String getNumer() {
        return numer;
    }

    @JsonProperty("numer")
    public void setNumer(String numer) {
        this.numer = numer;
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
