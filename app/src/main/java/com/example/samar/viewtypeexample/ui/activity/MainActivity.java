package com.example.samar.viewtypeexample.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.example.samar.viewtypeexample.R;
import com.example.samar.viewtypeexample.ui.adapter.ComplexRecyclerViewAdapter;
import com.example.samar.viewtypeexample.ui.util.Collection_Five;
import com.example.samar.viewtypeexample.ui.util.Collection_Four;
import com.example.samar.viewtypeexample.ui.util.Collection_Three;
import com.example.samar.viewtypeexample.ui.util.Collection_Two;
import com.example.samar.viewtypeexample.ui.util.Colletion_One;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ComplexRecyclerViewAdapter complexRecyclerViewAdapter;
    ImageView icHome, icCategory, icCart, icProfile, icWishlist;
    ImageView ivSearch;
    CardView cvFooter;
    Animation slideUpAnimation, slideDownAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initView() {

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.rList);
        cvFooter = (CardView) findViewById(R.id.footerLayout);
        ivSearch = (ImageView) findViewById(R.id.ivSearch);
        ivSearch.setOnClickListener(this);
        icHome = (ImageView) findViewById(R.id.icHome);
        icHome.setOnClickListener(this);
        icHome.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.tab_select));
        icCategory = (ImageView) findViewById(R.id.icCategory);
        icCategory.setOnClickListener(this);
        icCart = (ImageView) findViewById(R.id.icCart);
        icCart.setOnClickListener(this);
        icWishlist = (ImageView) findViewById(R.id.icWishlist);
        icWishlist.setOnClickListener(this);
        icProfile = (ImageView) findViewById(R.id.icProfile);
        icProfile.setOnClickListener(this);

        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);

        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
    }

    public void initData() {

        recyclerView.setLayoutManager(layoutManager);
        complexRecyclerViewAdapter = new ComplexRecyclerViewAdapter(getSampleArrayList(), this);
        recyclerView.setAdapter(complexRecyclerViewAdapter);


        recyclerView.addOnScrollListener(new HidingScrollListener() {
                                             @Override
                                             public void onHide() {

                                                 // ivSearch.animate().translationY(-ivSearch.getHeight()).setInterpolator(new AccelerateInterpolator(2));

                                                 cvFooter.animate().translationY(cvFooter.getHeight()).setInterpolator(new AccelerateInterpolator(2)).start();

                                             }

                                             @Override
                                             public void onShow() {
                                                 // ivSearch.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));

                                                 cvFooter.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
                                             }

                                             @Override
                                             public void onTop() {

                                                 //  ivSearch.setVisibility(View.VISIBLE);

                                                 //ivSearch.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));

                                             }

                                             @Override
                                             public void onScrollTop() {

                                                 ivSearch.setVisibility(View.VISIBLE);
                                             }

                                             @Override
                                             public void onScrollHide() {
                                                 ivSearch.setVisibility(View.GONE);
                                             }


                                         }


        );


    }


    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new Collection_Two());
        items.add(new Colletion_One());
        items.add(new Collection_Three());
        items.add(new Collection_Four());
        items.add(new Collection_Five());
        return items;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.icHome:
                /*Intent intentHome = new Intent(this, MainActivity.class);
                startActivity(intentHome);
                finish();*/
                break;
            case R.id.icCategory:
                Intent intentCategory = new Intent(this, CategoryActivity.class);
                startActivity(intentCategory);
                //finish();
                break;
            case R.id.icWishlist:
                Intent intentWishlist = new Intent(this, WishlistActivity.class);
                startActivity(intentWishlist);
                //finish();
                break;
            case R.id.icCart:
                Intent intentCart = new Intent(this, CartActivtiy.class);
                startActivity(intentCart);
                //  finish();
                break;
            case R.id.icProfile:
                Intent intentProfile = new Intent(this, ProfileActivity.class);
                startActivity(intentProfile);
                //   finish();
                break;
            case R.id.ivSearch:
                Intent intentSearch = new Intent(this, CalendarActivity.class);
                startActivity(intentSearch);
                //   finish();
                break;
        }

    }
}
