package agh.cs.lab9.json.representative.trips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Layers {

    @SerializedName("dataset")
    @Expose
    private Object dataset;
    @SerializedName("channels")
    @Expose
    private Object channels;
    @SerializedName("page")
    @Expose
    private Object page;
    @SerializedName("subscribers")
    @Expose
    private Object subscribers;
    @SerializedName("krs")
    @Expose
    private Krs krs;
    @SerializedName("wyjazdy")
    @Expose
    private List<Wyjazdy> wyjazdy = null;

    public Object getDataset() {
        return dataset;
    }

    public void setDataset(Object dataset) {
        this.dataset = dataset;
    }

    public Object getChannels() {
        return channels;
    }

    public void setChannels(Object channels) {
        this.channels = channels;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }

    public Object getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Object subscribers) {
        this.subscribers = subscribers;
    }

    public Krs getKrs() {
        return krs;
    }

    public void setKrs(Krs krs) {
        this.krs = krs;
    }

    public List<Wyjazdy> getWyjazdy() {
        return wyjazdy;
    }

    public void setWyjazdy(List<Wyjazdy> wyjazdy) {
        this.wyjazdy = wyjazdy;
    }

    @Override
    public String toString() {
        return "Layers{" +
                "dataset=" + dataset +
                ", channels=" + channels +
                ", page=" + page +
                ", subscribers=" + subscribers +
                ", krs=" + krs +
                ", wyjazdy=" + wyjazdy +
                '}';
    }
}
