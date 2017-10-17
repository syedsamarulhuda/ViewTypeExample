package com.example.samar.viewtypeexample.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.samar.viewtypeexample.R;

import java.util.List;

/**
 * Created by samar on 12/10/17.
 */

public class HorizontalTwoAdapter extends RecyclerView.Adapter<HorizontalTwoAdapter.ItemHolder> {

    private List<Integer> items;
    private Context context;

    public HorizontalTwoAdapter(List<Integer> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.layout_view_horizontal_two, viewGroup, false);

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
