package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data  implements Serializable {

    @SerializedName("sectionType")
    private String sectionType;
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
    @SerializedName("itemList")
    public List<Item> itemList = new ArrayList<>();
    @SerializedName("totalRecords")
    private int totalRecords;

    public Data(String sectionType, String repeatType, int itemCountInRow, boolean lazyLoadingEnabled, boolean titleVisible,
                String title, String titleColor, String titleBgColor, String sectionBgColor, List<Item> itemList,
                int totalRecords) {
        this.sectionType = sectionType;
        this.repeatType = repeatType;
        this.itemCountInRow = itemCountInRow;
        this.lazyLoadingEnabled = lazyLoadingEnabled;
        this.titleVisible = titleVisible;
        this.title = title;
        this.titleColor = titleColor;
        this.titleBgColor = titleBgColor;
        this.sectionBgColor = sectionBgColor;
        this.itemList = itemList;
        this.totalRecords = totalRecords;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
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

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Override
    public String toString() {
        return "Data{" +
                "sectionType='" + sectionType + '\'' +
                ", repeatType='" + repeatType + '\'' +
                ", itemCountInRow=" + itemCountInRow +
                ", lazyLoadingEnabled=" + lazyLoadingEnabled +
                ", titleVisible=" + titleVisible +
                ", title='" + title + '\'' +
                ", titleColor='" + titleColor + '\'' +
                ", titleBgColor='" + titleBgColor + '\'' +
                ", sectionBgColor='" + sectionBgColor + '\'' +
                ", itemList=" + itemList +
                ", totalRecords=" + totalRecords +
                '}';
    }
}
