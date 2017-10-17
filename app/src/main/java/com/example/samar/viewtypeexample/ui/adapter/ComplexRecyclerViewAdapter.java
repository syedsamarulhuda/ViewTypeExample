package com.example.samar.viewtypeexample.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.util.Collection_Five;
import com.example.samar.viewtypeexample.ui.util.Collection_Four;
import com.example.samar.viewtypeexample.ui.util.Collection_Three;
import com.example.samar.viewtypeexample.ui.util.Collection_Two;
import com.example.samar.viewtypeexample.ui.util.Colletion_One;
import com.example.samar.viewtypeexample.ui.view.ViewHolder1;
import com.example.samar.viewtypeexample.ui.view.ViewHolder2;
import com.example.samar.viewtypeexample.ui.view.ViewHolder3;
import com.example.samar.viewtypeexample.ui.view.ViewHolder4;
import com.example.samar.viewtypeexample.ui.view.ViewHolder5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samar on 12/11/16.
 */

public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {


    private List<Object> items;
    private Context context;
    private final int COLLECTION_ONE = 0, COLLECTION_TWO = 1,COLLECTION_THREE=2,COLLECTION_FOUR=3,COLLECTION_FIVE=4;

    public ComplexRecyclerViewAdapter(List<Object> items,Context context) {
        this.items = items;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case COLLECTION_TWO:
                View v2 = inflater.inflate(R.layout.layout_viewholder2, viewGroup, false);
                viewHolder = new ViewHolder2(v2);
                break;
            case COLLECTION_ONE:
                View v1 = inflater.inflate(R.layout.layout_viewholder1, viewGroup, false);
                viewHolder = new ViewHolder1(v1);
                break;
            case COLLECTION_THREE:
                View v3 = inflater.inflate(R.layout.layout_viewholder3, viewGroup, false);
                viewHolder = new ViewHolder3(v3);
                break;
            case COLLECTION_FOUR:
                View v4 = inflater.inflate(R.layout.layout_viewholder4, viewGroup, false);
                viewHolder = new ViewHolder4(v4);
                break;
            case COLLECTION_FIVE:
                View v5 = inflater.inflate(R.layout.layout_viewholder5, viewGroup, false);
                viewHolder = new ViewHolder5(v5);
                break;

        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        switch (viewHolder.getItemViewType()) {
            case COLLECTION_TWO:
                ViewHolder2 vh2 = (ViewHolder2) viewHolder;
                configureViewHolder2(vh2);
                break;
            case COLLECTION_ONE:
                ViewHolder1 vh1 = (ViewHolder1) viewHolder;
                configureViewHolder1(vh1, position);
                break;
            case COLLECTION_THREE:
                ViewHolder3 vh3 = (ViewHolder3) viewHolder;
                configureViewHolder3(vh3);
                break;

            case COLLECTION_FOUR:
                ViewHolder4 vh4 = (ViewHolder4) viewHolder;
                configureViewHolder4(vh4);
                break;

            case COLLECTION_FIVE:
                ViewHolder5 vh5 = (ViewHolder5) viewHolder;
                configureViewHolder5(vh5);
                break;

        }

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Collection_Two) {
            return COLLECTION_TWO;
        } else if (items.get(position) instanceof Colletion_One) {
            return COLLECTION_ONE;
        }else if (items.get(position) instanceof Collection_Three) {
            return COLLECTION_THREE;
        }else if (items.get(position) instanceof Collection_Four) {
            return COLLECTION_FOUR;
        }else if (items.get(position) instanceof Collection_Five) {
            return COLLECTION_FIVE;
        }
        return -1;
    }



    private void configureViewHolder1(ViewHolder1 vh1, int position) {

        LinearLayoutManager layoutManagerTwo = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        vh1.getRvListTwo().setLayoutManager(layoutManagerTwo);
        HorizontalTwoAdapter horizontalAdapterTwo = new HorizontalTwoAdapter(new ArrayList<Integer>(), context);
        horizontalAdapterTwo.setItems(getRentMoment());
        vh1.getRvListTwo().setAdapter(horizontalAdapterTwo);
    }

    private void configureViewHolder2(ViewHolder2 vh2) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        vh2.getRvList().setLayoutManager(layoutManager);
        HorizontalAdapter horizontalAdapter=new HorizontalAdapter(new ArrayList<Integer>(), context);
        horizontalAdapter.setItems(getImgList());
        vh2.getRvList().setAdapter(horizontalAdapter);

        vh2.getIvExample().setImageResource(R.drawable.store);

    }

    private void configureViewHolder3(ViewHolder3 vh3) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        vh3.getRvListThree().setLayoutManager(layoutManager);
        HorizontalThreeAdapter horizontalAdapterThree = new HorizontalThreeAdapter(new ArrayList<Integer>(), context);
        horizontalAdapterThree.setItems(getRentByOccasion());
        vh3.getRvListThree().setAdapter(horizontalAdapterThree);

    }

    private void configureViewHolder4(ViewHolder4 vh4) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        vh4.getRvListFour().setLayoutManager(layoutManager);
        HorizontalFourAdapter horizontalFourAdapter = new HorizontalFourAdapter(new ArrayList<Integer>(), context);
        horizontalFourAdapter.setItems(getRecentlyViewed());
        vh4.getRvListFour().setAdapter(horizontalFourAdapter);


    }


    private void configureViewHolder5(ViewHolder5 vh5) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        vh5.getRvListFive().setLayoutManager(layoutManager);
        HorizontalFiveAdapter horizontalFiveAdapter = new HorizontalFiveAdapter(new ArrayList<Integer>(), context);
        horizontalFiveAdapter.setItems(getHowItWorks());
        vh5.getRvListFive().setAdapter(horizontalFiveAdapter);


    }


    @Override
    public void onClick(View v) {
        Log.d("##CLICKED", "BUTTON CLICKED");

        Toast.makeText(context, "BUTTON CLICKED",
                Toast.LENGTH_LONG).show();
    }




    private List<Integer>getRentByOccasion()
    {
        ArrayList<Integer>items= new ArrayList<>();

        items.add(R.drawable.o_1);
        items.add(R.drawable.o_2);
        items.add(R.drawable.o_3);
        items.add(R.drawable.o_4);
        return items;
    }




    private List<Integer>getHowItWorks()
    {
        ArrayList<Integer>items= new ArrayList<>();

        items.add(R.drawable.occasions);
        items.add(R.drawable.group_33);
        items.add(R.drawable.group_32);
        return items;
    }


    private List<Integer>getRentMoment()
    {
        ArrayList<Integer>items= new ArrayList<>();

        items.add(R.drawable.s_1);
        items.add(R.drawable.s_2);
        items.add(R.drawable.s_3);
        items.add(R.drawable.s_1);

        return items;
    }

    private List<Integer> getRecentlyViewed()
    {
        ArrayList<Integer>items= new ArrayList<>();

        items.add(R.drawable.rv);
        items.add(R.drawable.rv_copy);
        items.add(R.drawable.rv);
        items.add(R.drawable.rv_copy);

        return items;
    }


    private List<Integer>getImgList()
    {
        ArrayList<Integer>items= new ArrayList<>();

        items.add(R.drawable.f_1);
        items.add(R.drawable.f_2);
        items.add(R.drawable.f_3);

        return items;
    }





}
