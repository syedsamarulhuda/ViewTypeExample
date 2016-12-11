package com.example.samar.viewtypeexample.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.ComplexRecyclerViewAdapter;
import com.example.samar.viewtypeexample.ui.util.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ComplexRecyclerViewAdapter complexRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initView() {

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.rList);
        //layoutManager = new LinearLayoutManager(this);
    }

    public void initData() {

        recyclerView.setLayoutManager(layoutManager);

        complexRecyclerViewAdapter = new ComplexRecyclerViewAdapter(getSampleArrayList(),this);
        recyclerView.setAdapter(complexRecyclerViewAdapter);
    }


    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add("image");
        items.add(new User("Jon Snow", "Castle Black"));
        items.add("image");
        items.add(new User("Tyrion Lanister", "King's Landing"));
        return items;
    }


}
