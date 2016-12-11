package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolderHoriz extends RecyclerView.ViewHolder {

    private TextView label;
    public ViewHolderHoriz(View v) {
        super(v);
        label = (TextView) v.findViewById(R.id.tv1);
    }

    public TextView getLabel() {
        return label;
    }

    public void setLabel(TextView label) {
        this.label = label;
    }
}
