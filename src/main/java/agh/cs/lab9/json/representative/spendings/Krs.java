
package agh.cs.lab9.json.representative.spendings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Krs {

    @SerializedName("biznes")
    @Expose
    private List<Object> biznes = null;
    @SerializedName("ngo")
    @Expose
    private List<Object> ngo = null;

    public List<Object> getBiznes() {
        return biznes;
    }

    public void setBiznes(List<Object> biznes) {
        this.biznes = biznes;
    }

    public List<Object> getNgo() {
        return ngo;
    }

    public void setNgo(List<Object> ngo) {
        this.ngo = ngo;
    }

}
