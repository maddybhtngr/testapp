package com.work.madhurbhatnagar.testapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MadhurBhatnagar on 12/24/2017.
 */

public class TestClass {

    @SerializedName("place")
    private String place;
    @SerializedName("url")
    private String URL;


    public String getPlace() {
        return place;
    }

    public String getURL() {
        return URL;
    }
}

