package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;

public class Item  implements Serializable {

    @SerializedName("hasPhotoGallery")
   private boolean hasPhotoGallery;
    @SerializedName("hasVideo")
   private boolean hasVideo;
    @SerializedName("titleVisible")
   private boolean titleVisible;
    @SerializedName("fLike")
   private String fLike;
    @SerializedName("publishDate")
   private String publishDate;
    @SerializedName("shortText")
   private String shortText;
    @SerializedName("fullPath")
   private String fullPath;
    @SerializedName("videoUrl")
   private String videoUrl;
    @SerializedName("externalUrl")
   private String externalUrl;
    @SerializedName("columnistName")
   private String columnistName;
    @SerializedName("itemId")
   private String itemId;
    @SerializedName("title")
   private String title;
    @SerializedName("imageUrl")
   private String imageUrl;
    @SerializedName("itemType")
   private String itemType;

    public Item(boolean hasPhotoGallery, boolean hasVideo, boolean titleVisible, String fLike, String publishDate,
                String shortText, String fullPath, String videoUrl, String externalUrl,
                String columnistName, String itemId, String title, String imageUrl, String itemType) {
        this.hasPhotoGallery = hasPhotoGallery;
        this.hasVideo = hasVideo;
        this.titleVisible = titleVisible;
        this.fLike = fLike;
        this.publishDate = publishDate;
        this.shortText = shortText;
        this.fullPath = fullPath;
        //this.category = category;
        this.videoUrl = videoUrl;
        this.externalUrl = externalUrl;
        this.columnistName = columnistName;
        this.itemId = itemId;
        this.title = title;
        this.imageUrl = imageUrl;
        this.itemType = itemType;
    }

    public boolean isHasPhotoGallery() {
        return hasPhotoGallery;
    }

    public void setHasPhotoGallery(boolean hasPhotoGallery) {
        this.hasPhotoGallery = hasPhotoGallery;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public boolean isTitleVisible() {
        return titleVisible;
    }

    public void setTitleVisible(boolean titleVisible) {
        this.titleVisible = titleVisible;
    }

    public String getfLike() {
        return fLike;
    }

    public void setfLike(String fLike) {
        this.fLike = fLike;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    /*
    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }
    */

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getColumnistName() {
        return columnistName;
    }

    public void setColumnistName(String columnistName) {
        this.columnistName = columnistName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "hasPhotoGallery=" + hasPhotoGallery +
                ", hasVideo=" + hasVideo +
                ", titleVisible=" + titleVisible +
                ", fLike='" + fLike + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", shortText='" + shortText + '\'' +
                ", fullPath='" + fullPath + '\'' +

                ", videoUrl='" + videoUrl + '\'' +
                ", externalUrl='" + externalUrl + '\'' +
                ", columnistName='" + columnistName + '\'' +
                ", itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", itemType='" + itemType + '\'' +
                '}';
    }
}
