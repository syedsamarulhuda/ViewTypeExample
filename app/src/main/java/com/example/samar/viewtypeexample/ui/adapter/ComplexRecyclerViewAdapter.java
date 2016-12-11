package com.example.samar.viewtypeexample.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.util.User;
import com.example.samar.viewtypeexample.ui.view.ViewHolder1;
import com.example.samar.viewtypeexample.ui.view.ViewHolder2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samar on 12/11/16.
 */

public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {


    private List<Object> items;
    private Context context;
    private final int USER = 0, IMAGE = 1;
   HorizontalAdapter horizontalAdapter;

    public ComplexRecyclerViewAdapter(List<Object> items, Context context) {
        this.items = items;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case USER:
                View v1 = inflater.inflate(R.layout.layout_viewholder1, viewGroup, false);
                viewHolder = new ViewHolder1(v1);
                break;
            case IMAGE:
                View v2 = inflater.inflate(R.layout.layout_viewholder2, viewGroup, false);
                viewHolder = new ViewHolder2(v2);
                break;
            /*default_img:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new RecyclerViewSimpleTextViewHolder(v);
                break;*/
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        switch (viewHolder.getItemViewType()) {
            case USER:
                ViewHolder1 vh1 = (ViewHolder1) viewHolder;
                configureViewHolder1(vh1, position);
                break;
            case IMAGE:
                ViewHolder2 vh2 = (ViewHolder2) viewHolder;
                configureViewHolder2(vh2);
                break;
           /* default_img:
                RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) viewHolder;
                configureDefaultViewHolder(vh, position);
                break;*/
        }

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof User) {
            return USER;
        } else if (items.get(position) instanceof String) {
            return IMAGE;
        }
        return -1;
    }


   /* private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
        vh.getLabel().setText((CharSequence) items.get(position));
    }*/

    private void configureViewHolder1(ViewHolder1 vh1, int position) {
        User user = (User) items.get(position);
        RecyclerView.LayoutManager layoutManager;
        if (user != null) {
            vh1.getLabel1().setText("Name: " + user.name);
            vh1.getLabel2().setText("Hometown: " + user.hometown);
            layoutManager = new LinearLayoutManager(context);
            vh1.getRvList().setLayoutManager(layoutManager);


            horizontalAdapter = new HorizontalAdapter(getArrayListExample(),context);
            vh1.getRvList().setAdapter(horizontalAdapter);

        }
    }

    private void configureViewHolder2(ViewHolder2 vh2) {
        vh2.getIvExample().setImageResource(R.drawable.img);
        vh2.getTvName().setText(Html.fromHtml("<b>GOLDEN BRIDGE</b>"));
        vh2.getBtnDetail().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("##CLICKED", "BUTTON CLICKED");

        Toast.makeText(context, "BUTTON CLICKED",
                Toast.LENGTH_LONG).show();
    }

    private ArrayList<String> getArrayListExample() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Thor");
        items.add("Iron Man");
        items.add("Captain America");
        items.add("Black Widow");
        items.add("Hawk Eye");
        items.add("Hulk");
        return items;
    }
}
