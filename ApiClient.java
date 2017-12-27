package com.work.madhurbhatnagar.testapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MadhurBhatnagar on 12/24/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "https://earthquake.usgs.gov/fdsnws/event/1/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }
        return retrofit;
    }


}
