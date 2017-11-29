
package com.epulapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amount {

    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Amount() {
    }

    /**
     * 
     * @param unit
     * @param value
     */
    public Amount(Double value, String unit) {
        super();
        this.value = value;
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Amount withValue(Double value) {
        this.value = value;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Amount withUnit(String unit) {
        this.unit = unit;
        return this;
    }

}
