package com.work.madhurbhatnagar.testapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by MadhurBhatnagar on 12/24/2017.
 */

public interface ApiInterface {

    @POST("query?format=geojson&starttime=2014-01-01&endtime=2014-01-02&minmagnitude=6.5")
    Call<List<TestClass>> getTestClass();

}
