package com.example.samar.viewtypeexample.ui.activity;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samar.viewtypeexample.R;

public class CartActivtiy extends AppCompatActivity implements View.OnClickListener {

    TextView tvToolbarTitle;
    ImageView icHome, icCategory,icCart,icProfile,icWishlist;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_activtiy);

        icHome = (ImageView) findViewById(R.id.icHome);
        icHome.setOnClickListener(this);
        icCategory = (ImageView) findViewById(R.id.icCategory);
        icCategory.setOnClickListener(this);
        icCart = (ImageView) findViewById(R.id.icCart);
        icCart.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tab_select_copy_6));
        // icCart.setOnClickListener(this);
        icWishlist = (ImageView) findViewById(R.id.icWishlist);
        icWishlist.setOnClickListener(this);
        icProfile = (ImageView) findViewById(R.id.icProfile);
        icProfile.setOnClickListener(this);


        tvToolbarTitle=(TextView)findViewById(R.id.tvToolbarTitle);
        tvToolbarTitle.setText("Your Bag.");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.icHome:
                Intent intentHome = new Intent(this, MainActivity.class);
                startActivity(intentHome);
                finish();
                break;
            case R.id.icCategory:
                Intent intentCategory = new Intent(this, CategoryActivity.class);
                startActivity(intentCategory);
                finish();
                break;
            case R.id.icWishlist:
                Intent intentWishlist = new Intent(this, WishlistActivity.class);
                startActivity(intentWishlist);
                finish();
                break;
            case R.id.icCart:
               /* Intent intentCart = new Intent(this, MainActivity.class);
                startActivity(intentCart);*/
                break;
            case R.id.icProfile:
                Intent intentProfile = new Intent(this, ProfileActivity.class);
                startActivity(intentProfile);
                finish();
                break;
        }
    }
}
