package com.work.madhurbhatnagar.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private recyclerAdapter adapter;
    private List<TestClass> testList;
    private ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<TestClass>> call = apiInterface.getTestClass();

        call.enqueue(new Callback<List<TestClass>>() {
            @Override
            public void onResponse(Call<List<TestClass>> call, Response<List<TestClass>> response) {

                testList = response.body();
                adapter = new recyclerAdapter(testList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<TestClass>> call, Throwable t) {
                Log.e("Failed Response","There was no response");
            }
        });

    }
}
