package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolder1 extends RecyclerView.ViewHolder {
    private TextView label1, label2;
    private RecyclerView rvList;

    public ViewHolder1(View v) {
        super(v);
        label1 = (TextView) v.findViewById(R.id.text1);
        label2 = (TextView) v.findViewById(R.id.text2);
        rvList=(RecyclerView)v.findViewById(R.id.rvList);

    }

    public TextView getLabel1() {
        return label1;
    }

    public void setLabel1(TextView label1) {
        this.label1 = label1;
    }

    public TextView getLabel2() {
        return label2;
    }

    public void setLabel2(TextView label2) {
        this.label2 = label2;
    }

    public RecyclerView getRvList() {
        return rvList;
    }

    public void setRvList(RecyclerView rvList) {
        this.rvList = rvList;
    }
}
