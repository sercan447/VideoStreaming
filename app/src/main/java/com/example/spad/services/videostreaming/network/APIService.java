package com.example.spad.services.videostreaming.network;

import com.example.spad.services.videostreaming.Model.Data;
import com.example.spad.services.videostreaming.Model.DataDetail;
import com.example.spad.services.videostreaming.Model.Model;
import com.example.spad.services.videostreaming.Model.ModelDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("anasayfa.json")
    Call<Model> getNewsList();


    @GET("detay.json")
    Call<ModelDetail> getNewsDetail();
}