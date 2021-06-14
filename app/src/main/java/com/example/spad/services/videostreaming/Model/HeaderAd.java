package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

public class HeaderAd {

    @SerializedName("itemType")
   private String itemType;
    @SerializedName("adUnit")
   private String adUnit;
    @SerializedName("itemWidth")
   private int itemWidth;
    @SerializedName("itemHeight")
   private int itemHeight;

    public HeaderAd(String itemType, String adUnit, int itemWidth, int itemHeight) {
        this.itemType = itemType;
        this.adUnit = adUnit;
        this.itemWidth = itemWidth;
        this.itemHeight = itemHeight;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getAdUnit() {
        return adUnit;
    }

    public void setAdUnit(String adUnit) {
        this.adUnit = adUnit;
    }

    public int getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(int itemWidth) {
        this.itemWidth = itemWidth;
    }

    public int getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(int itemHeight) {
        this.itemHeight = itemHeight;
    }

    @Override
    public String toString() {
        return "HeaderAd{" +
                "itemType='" + itemType + '\'' +
                ", adUnit='" + adUnit + '\'' +
                ", itemWidth=" + itemWidth +
                ", itemHeight=" + itemHeight +
                '}';
    }
}
