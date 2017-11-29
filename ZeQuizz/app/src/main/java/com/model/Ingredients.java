
package com.epulapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredients {

    @SerializedName("malt")
    @Expose
    private List<Malt> malt = new ArrayList<Malt>();
    @SerializedName("hops")
    @Expose
    private List<Hop> hops = new ArrayList<Hop>();
    @SerializedName("yeast")
    @Expose
    private String yeast;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingredients() {
    }

    /**
     * 
     * @param malt
     * @param yeast
     * @param hops
     */
    public Ingredients(List<Malt> malt, List<Hop> hops, String yeast) {
        super();
        this.malt = malt;
        this.hops = hops;
        this.yeast = yeast;
    }

    public List<Malt> getMalt() {
        return malt;
    }

    public void setMalt(List<Malt> malt) {
        this.malt = malt;
    }

    public Ingredients withMalt(List<Malt> malt) {
        this.malt = malt;
        return this;
    }

    public List<Hop> getHops() {
        return hops;
    }

    public void setHops(List<Hop> hops) {
        this.hops = hops;
    }

    public Ingredients withHops(List<Hop> hops) {
        this.hops = hops;
        return this;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public Ingredients withYeast(String yeast) {
        this.yeast = yeast;
        return this;
    }

}
