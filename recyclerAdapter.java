package com.work.madhurbhatnagar.testapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MadhurBhatnagar on 12/24/2017.
 */

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {

    private List<TestClass> tests;

    public recyclerAdapter(List<TestClass> tests ){
        this.tests = tests;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.text1.setText(tests.get(position).getPlace());
        holder.text2.setText(tests.get(position).getURL());
    }

    @Override
    public int getItemCount() {
        return tests.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text1,text2;
        public MyViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView)itemView.findViewById(R.id.testText1);
            text2 = (TextView)itemView.findViewById(R.id.testText2);
        }
    }
}
