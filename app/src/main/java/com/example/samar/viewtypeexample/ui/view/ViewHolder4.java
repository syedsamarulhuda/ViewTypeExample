package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalFourAdapter;
import com.example.samar.viewtypeexample.ui.adapter.HorizontalThreeAdapter;

/**
 * Created by samar on 12/10/17.
 */

public class ViewHolder4 extends RecyclerView.ViewHolder {

    private RecyclerView rvListFour;
    HorizontalFourAdapter horizontalFourAdapter;

    public ViewHolder4(View v) {
        super(v);

        rvListFour=(RecyclerView)v.findViewById(R.id.rv_list_four);

    }

    public RecyclerView getRvListFour() {
        return rvListFour;
    }

    public void setRvListFour(RecyclerView rvListFour) {
        this.rvListFour = rvListFour;
    }

    public HorizontalFourAdapter getHorizontalFourAdapter() {
        return horizontalFourAdapter;
    }

    public void setHorizontalFourAdapter(HorizontalFourAdapter horizontalFourAdapter) {
        this.horizontalFourAdapter = horizontalFourAdapter;
    }
}
