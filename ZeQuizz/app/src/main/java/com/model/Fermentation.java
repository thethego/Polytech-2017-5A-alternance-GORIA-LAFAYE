
package com.epulapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fermentation {

    @SerializedName("temp")
    @Expose
    private Temp_ temp;

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
    public Fermentation(Temp_ temp) {
        super();
        this.temp = temp;
    }

    public Temp_ getTemp() {
        return temp;
    }

    public void setTemp(Temp_ temp) {
        this.temp = temp;
    }

    public Fermentation withTemp(Temp_ temp) {
        this.temp = temp;
        return this;
    }

}
