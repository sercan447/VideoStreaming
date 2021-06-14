package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

public class DataDetail {

    @SerializedName("headerAd")
   private HeaderAd headerAd;
    @SerializedName("newsDetail")
   private NewDetail newDetail;
    @SerializedName("footerAd")
   private FooterAd footerAd;

    public DataDetail(HeaderAd headerAd, NewDetail newDetail, FooterAd footerAd) {
        this.headerAd = headerAd;
        this.newDetail = newDetail;
        this.footerAd = footerAd;
    }

    public HeaderAd getHeaderAd() {
        return headerAd;
    }

    public void setHeaderAd(HeaderAd headerAd) {
        this.headerAd = headerAd;
    }

    public NewDetail getNewDetail() {
        return newDetail;
    }

    public void setNewDetail(NewDetail newDetail) {
        this.newDetail = newDetail;
    }

    public FooterAd getFooterAd() {
        return footerAd;
    }

    public void setFooterAd(FooterAd footerAd) {
        this.footerAd = footerAd;
    }

    @Override
    public String toString() {
        return "DataDetail{" +
                "headerAd=" + headerAd +
                ", newDetail=" + newDetail +
                ", footerAd=" + footerAd +
                '}';
    }
}
