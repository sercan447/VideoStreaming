package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

public class ModelDetail {

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMessage")
    private String errorMessage;
    @SerializedName("data")
    private DataDetail data;

    public ModelDetail(int errorCode, String errorMessage, DataDetail data) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public DataDetail getData() {
        return data;
    }

    public void setData(DataDetail data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "ModelDetail{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
