package com.example.samar.viewtypeexample.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.view.ViewHolderHoriz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samar on 12/11/16.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ItemHolder> {

    private List<Integer> items;
    private Context context;

    public HorizontalAdapter(List<Integer> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.layout_view_holder_horizontal, viewGroup, false);

        return new ItemHolder(v);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {

        int imgId= getItem(position);
        holder.ivImage.setImageDrawable(context.getResources().getDrawable(imgId));
    }



    public int getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }




    public class ItemHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;


        public ItemHolder(View itemView) {
            super(itemView);

            ivImage = (ImageView) itemView.findViewById(R.id.img);


        }

    }

    public void setItems(List<Integer> mitems) {
        items=mitems;
        notifyDataSetChanged();
    }

}
