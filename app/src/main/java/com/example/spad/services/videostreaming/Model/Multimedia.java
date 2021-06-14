package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

public class Multimedia {

    @SerializedName("ectionType")
    private String ectionType;
    @SerializedName("repeatType")
    private String repeatType;
    @SerializedName("itemCountInRow")
    private int itemCountInRow;
    @SerializedName("lazyLoadingEnabled")
    private boolean lazyLoadingEnabled;
    @SerializedName("titleVisible")
    private boolean titleVisible;
    @SerializedName("title")
    private String title;
    @SerializedName("titleColor")
    private String titleColor;
    @SerializedName("titleBgColor")
    private String titleBgColor;
    @SerializedName("sectionBgColor")
    private String sectionBgColor;

    public String getEctionType() {
        return ectionType;
    }

    public void setEctionType(String ectionType) {
        this.ectionType = ectionType;
    }

    public String getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType;
    }

    public int getItemCountInRow() {
        return itemCountInRow;
    }

    public void setItemCountInRow(int itemCountInRow) {
        this.itemCountInRow = itemCountInRow;
    }

    public boolean isLazyLoadingEnabled() {
        return lazyLoadingEnabled;
    }

    public void setLazyLoadingEnabled(boolean lazyLoadingEnabled) {
        this.lazyLoadingEnabled = lazyLoadingEnabled;
    }

    public boolean isTitleVisible() {
        return titleVisible;
    }

    public void setTitleVisible(boolean titleVisible) {
        this.titleVisible = titleVisible;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitleBgColor() {
        return titleBgColor;
    }

    public void setTitleBgColor(String titleBgColor) {
        this.titleBgColor = titleBgColor;
    }

    public String getSectionBgColor() {
        return sectionBgColor;
    }

    public void setSectionBgColor(String sectionBgColor) {
        this.sectionBgColor = sectionBgColor;
    }


    @Override
    public String toString() {
        return "Multimedia{" +
                "ectionType='" + ectionType + '\'' +
                ", repeatType='" + repeatType + '\'' +
                ", itemCountInRow=" + itemCountInRow +
                ", lazyLoadingEnabled=" + lazyLoadingEnabled +
                ", titleVisible=" + titleVisible +
                ", title='" + title + '\'' +
                ", titleColor='" + titleColor + '\'' +
                ", titleBgColor='" + titleBgColor + '\'' +
                ", sectionBgColor='" + sectionBgColor + '\'' +
                '}';
    }
}
