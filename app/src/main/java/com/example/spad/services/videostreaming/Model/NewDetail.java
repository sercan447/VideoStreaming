package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

public class NewDetail {


    @SerializedName("resource")
    private String resource;
    @SerializedName("bodyText")
    private String bodyText;
    @SerializedName("hasPhotoGallery")
    private boolean hasPhotoGallery;
    @SerializedName("hasVideo")
    private boolean hasVideo;
    @SerializedName("publishDate")
    private String publishDate;
    @SerializedName("fullPath")
    private String fullPath;
    @SerializedName("shortText")
    private String shortText;
    @SerializedName("itemId")
    private String itemId;
    @SerializedName("title")
    private String title;
    @SerializedName("video")
    private String video;
    @SerializedName("imageUrl")
    private String  imageUrl;
    @SerializedName("itemType")
    private String itemType;

    public NewDetail(String resource, String bodyText, boolean hasPhotoGallery, boolean hasVideo, String publishDate, String fullPath, String shortText, String itemId, String title, String video, String imageUrl, String itemType) {
        this.resource = resource;
        this.bodyText = bodyText;
        this.hasPhotoGallery = hasPhotoGallery;
        this.hasVideo = hasVideo;
        this.publishDate = publishDate;
        this.fullPath = fullPath;
        this.shortText = shortText;
        this.itemId = itemId;
        this.title = title;
        this.video = video;
        this.imageUrl = imageUrl;
        this.itemType = itemType;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
        return "NewDetail{" +
                "resource='" + resource + '\'' +
                ", bodyText='" + bodyText + '\'' +
                ", hasPhotoGallery=" + hasPhotoGallery +
                ", hasVideo=" + hasVideo +
                ", publishDate='" + publishDate + '\'' +
                ", fullPath='" + fullPath + '\'' +
                ", shortText='" + shortText + '\'' +
                ", itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                ", video='" + video + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", itemType='" + itemType + '\'' +
                '}';
    }
}
