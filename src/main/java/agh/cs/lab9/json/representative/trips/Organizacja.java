
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
    "id",
    "nazwa",
    "forma_prawna_str",
    "kapital_zakladowy",
    "cel_dzialania",
    "data_rejestracji"
})
public class Organizacja {

    @JsonProperty("id")
    private String id;
    @JsonProperty("nazwa")
    private String nazwa;
    @JsonProperty("forma_prawna_str")
    private String formaPrawnaStr;
    @JsonProperty("kapital_zakladowy")
    private String kapitalZakladowy;
    @JsonProperty("cel_dzialania")
    private String celDzialania;
    @JsonProperty("data_rejestracji")
    private String dataRejestracji;
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

    @JsonProperty("nazwa")
    public String getNazwa() {
        return nazwa;
    }

    @JsonProperty("nazwa")
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @JsonProperty("forma_prawna_str")
    public String getFormaPrawnaStr() {
        return formaPrawnaStr;
    }

    @JsonProperty("forma_prawna_str")
    public void setFormaPrawnaStr(String formaPrawnaStr) {
        this.formaPrawnaStr = formaPrawnaStr;
    }

    @JsonProperty("kapital_zakladowy")
    public String getKapitalZakladowy() {
        return kapitalZakladowy;
    }

    @JsonProperty("kapital_zakladowy")
    public void setKapitalZakladowy(String kapitalZakladowy) {
        this.kapitalZakladowy = kapitalZakladowy;
    }

    @JsonProperty("cel_dzialania")
    public String getCelDzialania() {
        return celDzialania;
    }

    @JsonProperty("cel_dzialania")
    public void setCelDzialania(String celDzialania) {
        this.celDzialania = celDzialania;
    }

    @JsonProperty("data_rejestracji")
    public String getDataRejestracji() {
        return dataRejestracji;
    }

    @JsonProperty("data_rejestracji")
    public void setDataRejestracji(String dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
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
