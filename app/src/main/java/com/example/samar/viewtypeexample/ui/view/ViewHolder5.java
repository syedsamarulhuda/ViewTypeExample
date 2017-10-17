package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalFiveAdapter;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalThreeAdapter;

/**
 * Created by samar on 13/10/17.
 */

public class ViewHolder5 extends RecyclerView.ViewHolder  {

    private RecyclerView rvListFive;
    HorizontalFiveAdapter horizontalFiveAdapter;

    public ViewHolder5(View v) {
        super(v);

        rvListFive=(RecyclerView)v.findViewById(R.id.rv_list_five);

    }

    public RecyclerView getRvListFive() {
        return rvListFive;
    }

    public void setRvListFive(RecyclerView rvListFive) {
        this.rvListFive = rvListFive;
    }

    public HorizontalFiveAdapter getHorizontalFiveAdapter() {
        return horizontalFiveAdapter;
    }

    public void setHorizontalFiveAdapter(HorizontalFiveAdapter horizontalFiveAdapter) {
        this.horizontalFiveAdapter = horizontalFiveAdapter;
    }
}
