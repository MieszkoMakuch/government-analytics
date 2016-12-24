package agh.cs.lab9.json.sejmometr;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("last")
    @Expose
    private String last;

    /**
     * @return The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * @param self The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * @return The next
     */
    public String getNext() {
        return next;
    }

    /**
     * @param next The next
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * @return The last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last The last
     */
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
