
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
    "pola",
    "dokument_id",
    "rok"
})
public class Roczniki {

    @JsonProperty("pola")
    private List<Double> pola = null;
    @JsonProperty("dokument_id")
    private String dokumentId;
    @JsonProperty("rok")
    private int rok;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pola")
    public List<Double> getPola() {
        return pola;
    }

    @JsonProperty("pola")
    public void setPola(List<Double> pola) {
        this.pola = pola;
    }

    @JsonProperty("dokument_id")
    public String getDokumentId() {
        return dokumentId;
    }

    @JsonProperty("dokument_id")
    public void setDokumentId(String dokumentId) {
        this.dokumentId = dokumentId;
    }

    @JsonProperty("rok")
    public int getRok() {
        return rok;
    }

    @JsonProperty("rok")
    public void setRok(int rok) {
        this.rok = rok;
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
