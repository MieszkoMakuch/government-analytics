package agh.cs.lab9.json.representative.spendings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("wydatki")
    @Expose
    private Wydatki wydatki;

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

    public Wydatki getWydatki() {
        return wydatki;
    }

    public void setWydatki(Wydatki wydatki) {
        this.wydatki = wydatki;
    }

    @Override
    public String toString() {
        return "Layers{" +
                "dataset=" + dataset +
                ", channels=" + channels +
                ", page=" + page +
                ", subscribers=" + subscribers +
                ", krs=" + krs +
                ", wydatki=" + wydatki +
                '}';
    }
}
