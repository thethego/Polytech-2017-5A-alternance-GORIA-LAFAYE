
package com.epulapp.model;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Beer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("first_brewed")
    @Expose
    private String firstBrewed;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("abv")
    @Expose
    private Double abv;
    @SerializedName("ibu")
    @Expose
    private Double ibu;
    @SerializedName("target_fg")
    @Expose
    private Integer targetFg;
    @SerializedName("target_og")
    @Expose
    private Double targetOg;
    @SerializedName("ebc")
    @Expose
    private Double ebc;
    @SerializedName("srm")
    @Expose
    private Double srm;
    @SerializedName("ph")
    @Expose
    private Double ph;
    @SerializedName("attenuation_level")
    @Expose
    private Double attenuationLevel;
    @SerializedName("volume")
    @Expose
    private Volume volume;
    @SerializedName("boil_volume")
    @Expose
    private BoilVolume boilVolume;
    @SerializedName("method")
    @Expose
    private Method method;
    @SerializedName("ingredients")
    @Expose
    private Ingredients ingredients;
    @SerializedName("food_pairing")
    @Expose
    private List<String> foodPairing = new ArrayList<String>();
    @SerializedName("brewers_tips")
    @Expose
    private String brewersTips;
    @SerializedName("contributed_by")
    @Expose
    private String contributedBy;
    public Bitmap beerImage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Beer() {
    }

    /**
     * 
     * @param imageUrl
     * @param boilVolume
     * @param ebc
     * @param attenuationLevel
     * @param firstBrewed
     * @param contributedBy
     * @param ibu
     * @param ingredients
     * @param id
     * @param targetOg
     * @param srm
     * @param abv
     * @param description
     * @param foodPairing
     * @param name
     * @param brewersTips
     * @param volume
     * @param method
     * @param ph
     * @param targetFg
     * @param tagline
     */
    public Beer(Integer id, String name, String tagline, String firstBrewed, String description, String imageUrl, Double abv, Double ibu, Integer targetFg, Double targetOg, Double ebc, Double srm, Double ph, Double attenuationLevel, Volume volume, BoilVolume boilVolume, Method method, Ingredients ingredients, List<String> foodPairing, String brewersTips, String contributedBy) {
        super();
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.firstBrewed = firstBrewed;
        this.description = description;
        this.imageUrl = imageUrl;
        this.abv = abv;
        this.ibu = ibu;
        this.targetFg = targetFg;
        this.targetOg = targetOg;
        this.ebc = ebc;
        this.srm = srm;
        this.ph = ph;
        this.attenuationLevel = attenuationLevel;
        this.volume = volume;
        this.boilVolume = boilVolume;
        this.method = method;
        this.ingredients = ingredients;
        this.foodPairing = foodPairing;
        this.brewersTips = brewersTips;
        this.contributedBy = contributedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Beer withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Beer withName(String name) {
        this.name = name;
        return this;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Beer withTagline(String tagline) {
        this.tagline = tagline;
        return this;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public Beer withFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Beer withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Beer withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public Beer withAbv(Double abv) {
        this.abv = abv;
        return this;
    }

    public Double getIbu() {
        return ibu;
    }

    public void setIbu(Double ibu) {
        this.ibu = ibu;
    }

    public Beer withIbu(Double ibu) {
        this.ibu = ibu;
        return this;
    }

    public Integer getTargetFg() {
        return targetFg;
    }

    public void setTargetFg(Integer targetFg) {
        this.targetFg = targetFg;
    }

    public Beer withTargetFg(Integer targetFg) {
        this.targetFg = targetFg;
        return this;
    }

    public Double getTargetOg() {
        return targetOg;
    }

    public void setTargetOg(Double targetOg) {
        this.targetOg = targetOg;
    }

    public Beer withTargetOg(Double targetOg) {
        this.targetOg = targetOg;
        return this;
    }

    public Double getEbc() {
        return ebc;
    }

    public void setEbc(Double ebc) {
        this.ebc = ebc;
    }

    public Beer withEbc(Double ebc) {
        this.ebc = ebc;
        return this;
    }

    public Double getSrm() {
        return srm;
    }

    public void setSrm(Double srm) {
        this.srm = srm;
    }

    public Beer withSrm(Double srm) {
        this.srm = srm;
        return this;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Beer withPh(Double ph) {
        this.ph = ph;
        return this;
    }

    public Double getAttenuationLevel() {
        return attenuationLevel;
    }

    public void setAttenuationLevel(Double attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    public Beer withAttenuationLevel(Double attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
        return this;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public Beer withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    public void setBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
    }

    public Beer withBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Beer withMethod(Method method) {
        this.method = method;
        return this;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Beer withIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public List<String> getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    public Beer withFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
        return this;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    public Beer withBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
        return this;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

    public Beer withContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
        return this;
    }

}
