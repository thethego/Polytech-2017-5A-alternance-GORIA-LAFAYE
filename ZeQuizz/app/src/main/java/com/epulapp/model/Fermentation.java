
package com.epulapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fermentation {

    @SerializedName("temp")
    @Expose
    private Temp temp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fermentation() {
    }

    /**
     * 
     * @param temp
     */
    public Fermentation(Temp temp) {
        super();
        this.temp = temp;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Fermentation withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

}
