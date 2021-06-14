package com.example.spad.services.videostreaming.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model  implements Serializable {

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMessage")
    private String errorMessage;

    @SerializedName("data")
    public List<Data> data = new ArrayList<>();

    public Model(int errorCode, String errorMessage, List<Data> data) {
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

    public List<Data> getDatas() {
        return data;
    }

    public void setDatas(List<Data> datas) {
        this.data = datas;
    }

    @Override
    public String toString() {
        return "Model{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", datas=" + data +
                '}';
    }
}
