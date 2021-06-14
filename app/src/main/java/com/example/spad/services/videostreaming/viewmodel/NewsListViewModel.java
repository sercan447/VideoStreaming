package com.example.spad.services.videostreaming.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spad.services.videostreaming.Model.Data;
import com.example.spad.services.videostreaming.Model.DataDetail;
import com.example.spad.services.videostreaming.Model.Model;
import com.example.spad.services.videostreaming.Model.ModelDetail;
import com.example.spad.services.videostreaming.network.APIService;
import com.example.spad.services.videostreaming.network.RetroInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsListViewModel extends ViewModel {

    private MutableLiveData<Model> newsList;
    private MutableLiveData<ModelDetail> newsDetail;

    public NewsListViewModel(){
        newsList = new MutableLiveData<>();
        newsDetail = new MutableLiveData<>();
    }

    public MutableLiveData<Model> getNewsListObServer(){
        return newsList;
    }

    public MutableLiveData<ModelDetail> getNewsDetailObServer(){
        return newsDetail;
    }

    public void makeApiCall(){
        APIService apiService = RetroInstance.getRetrofitClient().create(APIService.class);

        Call<Model> call = apiService.getNewsList();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {

                newsList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                newsList.postValue(null);
            }
        });
    }//makeApiCall

    public void makeNewsDetaill(){
        APIService apiService = RetroInstance.getRetrofitClient().create(APIService.class);

        Call<ModelDetail> call = apiService.getNewsDetail();

        call.enqueue(new Callback<ModelDetail>() {
            @Override
            public void onResponse(Call<ModelDetail> call, Response<ModelDetail> response) {

                Log.e("SERCAN","DETAY1 : "+response.body());
                newsDetail.postValue(response.body());

            }

            @Override
            public void onFailure(Call<ModelDetail> call, Throwable t) {
                newsList.postValue(null);
            }
        });
    }//makeApiCall


}
