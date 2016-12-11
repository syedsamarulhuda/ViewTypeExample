package com.example.samar.viewtypeexample.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.view.ViewHolder1;
import com.example.samar.viewtypeexample.ui.view.ViewHolderHoriz;

import java.util.List;

/**
 * Created by samar on 12/11/16.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> items;
    private Context context;

    public HorizontalAdapter(List<String> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        View v = inflater.inflate(R.layout.layout_view_holder_horizontal, viewGroup, false);
        viewHolder = new ViewHolderHoriz(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ViewHolderHoriz vh = (ViewHolderHoriz) holder;

        vh.getLabel().setText(items.get(position));

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }
}
