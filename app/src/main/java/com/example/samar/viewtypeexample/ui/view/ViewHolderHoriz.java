package com.example.samar.viewtypeexample.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;

/**
 * Created by samar on 12/11/16.
 */

public class ViewHolderHoriz extends RecyclerView.ViewHolder {

    private ImageView img;
    public ViewHolderHoriz(View v) {
        super(v);
        img = (ImageView) v.findViewById(R.id.img);
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }
}
