
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
    "liczba_pol",
    "liczba_rocznikow",
    "punkty",
    "roczniki"
})
public class Wydatki {

    @JsonProperty("liczba_pol")
    private Integer liczbaPol;
    @JsonProperty("liczba_rocznikow")
    private Integer liczbaRocznikow;
    @JsonProperty("punkty")
    private List<Punkty> punkty = null;
    @JsonProperty("roczniki")
    private List<Roczniki> roczniki = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("liczba_pol")
    public Integer getLiczbaPol() {
        return liczbaPol;
    }

    @JsonProperty("liczba_pol")
    public void setLiczbaPol(Integer liczbaPol) {
        this.liczbaPol = liczbaPol;
    }

    @JsonProperty("liczba_rocznikow")
    public Integer getLiczbaRocznikow() {
        return liczbaRocznikow;
    }

    @JsonProperty("liczba_rocznikow")
    public void setLiczbaRocznikow(Integer liczbaRocznikow) {
        this.liczbaRocznikow = liczbaRocznikow;
    }

    @JsonProperty("punkty")
    public List<Punkty> getPunkty() {
        return punkty;
    }

    @JsonProperty("punkty")
    public void setPunkty(List<Punkty> punkty) {
        this.punkty = punkty;
    }

    @JsonProperty("roczniki")
    public List<Roczniki> getRoczniki() {
        return roczniki;
    }

    @JsonProperty("roczniki")
    public void setRoczniki(List<Roczniki> roczniki) {
        this.roczniki = roczniki;
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
