
package com.epulapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hop {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("amount")
    @Expose
    private Amount amount;
    @SerializedName("add")
    @Expose
    private String add;
    @SerializedName("attribute")
    @Expose
    private String attribute;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hop() {
    }

    /**
     * 
     * @param amount
     * @param name
     * @param attribute
     * @param add
     */
    public Hop(String name, Amount amount, String add, String attribute) {
        super();
        this.name = name;
        this.amount = amount;
        this.add = add;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hop withName(String name) {
        this.name = name;
        return this;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Hop withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Hop withAdd(String add) {
        this.add = add;
        return this;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Hop withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

}
