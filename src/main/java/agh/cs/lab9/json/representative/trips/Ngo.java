
package agh.cs.lab9.json.representative.trips;

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
    "organizacja",
    "rola",
    "forma"
})
public class Ngo {

    @JsonProperty("organizacja")
    private Organizacja organizacja;
    @JsonProperty("rola")
    private Rola rola;
    @JsonProperty("forma")
    private Forma forma;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("organizacja")
    public Organizacja getOrganizacja() {
        return organizacja;
    }

    @JsonProperty("organizacja")
    public void setOrganizacja(Organizacja organizacja) {
        this.organizacja = organizacja;
    }

    @JsonProperty("rola")
    public Rola getRola() {
        return rola;
    }

    @JsonProperty("rola")
    public void setRola(Rola rola) {
        this.rola = rola;
    }

    @JsonProperty("forma")
    public Forma getForma() {
        return forma;
    }

    @JsonProperty("forma")
    public void setForma(Forma forma) {
        this.forma = forma;
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
