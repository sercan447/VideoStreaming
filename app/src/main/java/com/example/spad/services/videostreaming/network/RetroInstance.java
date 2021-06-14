package com.example.spad.services.videostreaming.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {


        public static String BASE_URL = "http://turkmedya.com.tr/";


        private static Retrofit retrofit;

        public static Retrofit getRetrofitClient(){
            if(retrofit == null){
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }


    }
