package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalAdapter;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalTwoAdapter;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolder1 extends RecyclerView.ViewHolder {
    private RecyclerView rvListTwo;
    HorizontalTwoAdapter horizontalTwoAdapter;

    public ViewHolder1(View v) {
        super(v);

        rvListTwo=(RecyclerView)v.findViewById(R.id.rv_list_two);

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
