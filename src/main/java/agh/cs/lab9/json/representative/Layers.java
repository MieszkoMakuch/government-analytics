
package agh.cs.lab9.json.representative;

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

    /**
     * 
     * @return
     *     The dataset
     */
    public Object getDataset() {
        return dataset;
    }

    /**
     * 
     * @param dataset
     *     The dataset
     */
    public void setDataset(Object dataset) {
        this.dataset = dataset;
    }

    /**
     * 
     * @return
     *     The channels
     */
    public Object getChannels() {
        return channels;
    }

    /**
     * 
     * @param channels
     *     The channels
     */
    public void setChannels(Object channels) {
        this.channels = channels;
    }

    /**
     * 
     * @return
     *     The page
     */
    public Object getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(Object page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The subscribers
     */
    public Object getSubscribers() {
        return subscribers;
    }

    /**
     * 
     * @param subscribers
     *     The subscribers
     */
    public void setSubscribers(Object subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public String toString() {
        return "Layers{" +
                "dataset=" + dataset +
                ", channels=" + channels +
                ", page=" + page +
                ", subscribers=" + subscribers +
                '}';
    }
}
