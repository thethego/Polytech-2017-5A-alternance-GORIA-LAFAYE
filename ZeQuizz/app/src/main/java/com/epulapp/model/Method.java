
package com.epulapp.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Method {

    @SerializedName("mash_temp")
    @Expose
    private List<MashTemp> mashTemp = new ArrayList<MashTemp>();
    @SerializedName("fermentation")
    @Expose
    private Fermentation fermentation;
    @SerializedName("twist")
    @Expose
    private Object twist;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Method() {
    }

    /**
     * 
     * @param mashTemp
     * @param twist
     * @param fermentation
     */
    public Method(List<MashTemp> mashTemp, Fermentation fermentation, Object twist) {
        super();
        this.mashTemp = mashTemp;
        this.fermentation = fermentation;
        this.twist = twist;
    }

    public List<MashTemp> getMashTemp() {
        return mashTemp;
    }

    public void setMashTemp(List<MashTemp> mashTemp) {
        this.mashTemp = mashTemp;
    }

    public Method withMashTemp(List<MashTemp> mashTemp) {
        this.mashTemp = mashTemp;
        return this;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }

    public Method withFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
        return this;
    }

    public Object getTwist() {
        return twist;
    }

    public void setTwist(Object twist) {
        this.twist = twist;
    }

    public Method withTwist(Object twist) {
        this.twist = twist;
        return this;
    }

}
