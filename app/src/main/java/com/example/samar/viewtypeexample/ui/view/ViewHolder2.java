package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolder2 extends RecyclerView.ViewHolder {

    private ImageView ivExample;
    private TextView tvName;
    private Button btnDetail;

    public ViewHolder2(View v) {
        super(v);
        ivExample = (ImageView) v.findViewById(R.id.ivExample);
        tvName = (TextView) v.findViewById(R.id.tvName);
        btnDetail = (Button) v.findViewById(R.id.btnDetail);
    }

    public ImageView getIvExample() {
        return ivExample;
    }

    public void setIvExample(ImageView ivExample) {
        this.ivExample = ivExample;
    }

    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    public Button getBtnDetail() {
        return btnDetail;
    }

    public void setBtnDetail(Button btnDetail) {
        this.btnDetail = btnDetail;
    }
}