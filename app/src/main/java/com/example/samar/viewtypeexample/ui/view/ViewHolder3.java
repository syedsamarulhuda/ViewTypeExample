package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalThreeAdapter;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalTwoAdapter;

/**
 * Created by samar on 12/10/17.
 */

public class ViewHolder3 extends RecyclerView.ViewHolder {

    private RecyclerView rvListThree;
    HorizontalThreeAdapter horizontalThreeAdapter;

    public ViewHolder3(View v) {
        super(v);

        rvListThree=(RecyclerView)v.findViewById(R.id.rv_list_three);

        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(rvListThree);

    }

    public RecyclerView getRvListThree() {
        return rvListThree;
    }

    public void setRvListThree(RecyclerView rvListThree) {
        this.rvListThree = rvListThree;
    }

    public HorizontalThreeAdapter getHorizontalThreeAdapter() {
        return horizontalThreeAdapter;
    }

    public void setHorizontalThreeAdapter(HorizontalThreeAdapter horizontalThreeAdapter) {
        this.horizontalThreeAdapter = horizontalThreeAdapter;
    }
}
