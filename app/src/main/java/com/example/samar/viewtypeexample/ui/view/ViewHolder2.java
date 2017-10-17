package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalAdapter;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalTwoAdapter;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolder2 extends RecyclerView.ViewHolder {

    private ImageView ivExample;
    private RecyclerView rvList;
    private RecyclerView rvListTwo;
    HorizontalAdapter adapter;
    HorizontalTwoAdapter horizontalTwoAdapter;


    public ViewHolder2(View v) {
        super(v);
        ivExample = (ImageView) v.findViewById(R.id.ivExample);
        rvList = (RecyclerView) v.findViewById(R.id.rv_list);
        rvListTwo = (RecyclerView) v.findViewById(R.id.rv_list_two);

        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(rvList);
    }

    public ImageView getIvExample() {
        return ivExample;
    }

    public void setIvExample(ImageView ivExample) {
        this.ivExample = ivExample;
    }


    public RecyclerView getRvList() {
        return rvList;
    }

    public void setRvList(RecyclerView rvList) {
        this.rvList = rvList;
    }

    public HorizontalAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(HorizontalAdapter adapter) {
        this.adapter = adapter;
    }

    public RecyclerView getRvListTwo() {
        return rvListTwo;
    }

    public void setRvListTwo(RecyclerView rvListTwo) {
        this.rvListTwo = rvListTwo;
    }

    public HorizontalTwoAdapter getHorizontalTwoAdapter() {
        return horizontalTwoAdapter;
    }

    public void setHorizontalTwoAdapter(HorizontalTwoAdapter horizontalTwoAdapter) {
        this.horizontalTwoAdapter = horizontalTwoAdapter;
    }
}