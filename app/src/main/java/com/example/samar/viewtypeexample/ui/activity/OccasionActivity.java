package com.example.samar.viewtypeexample.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.samar.viewtypeexample.R;

public class OccasionActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView icOccasionClose, ivOccasion;
    Button btnSee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occasion);

        icOccasionClose = (ImageView) findViewById(R.id.occasionClose);
        icOccasionClose.setOnClickListener(this);

        ivOccasion = (ImageView) findViewById(R.id.ivOccasion);
        ivOccasion.setOnClickListener(this);

        btnSee = (Button) findViewById(R.id.btnSee);
        btnSee.setEnabled(false);
        btnSee.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnSee:
                Intent intentOccasion = new Intent(this, ListActivity.class);
                startActivity(intentOccasion);
                break;
            case R.id.occasionClose:
                finish();
                break;

            case R.id.ivOccasion:
                btnSee.setEnabled(true);
                btnSee.setBackgroundColor(ContextCompat.getColor(this, R.color.btn_background));
                break;
        }
    }
}
