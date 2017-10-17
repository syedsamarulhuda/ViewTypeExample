package com.example.samar.viewtypeexample.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.samar.viewtypeexample.R;

public class CalendarActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView icClose, ivCal;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        icClose = (ImageView) findViewById(R.id.calClose);
        icClose.setOnClickListener(this);
        ivCal=(ImageView)findViewById(R.id.ivCalendar);
        ivCal.setOnClickListener(this);
        btnNext =(Button)findViewById(R.id.btnNext);
        btnNext.setEnabled(false);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.calClose:
                finish();
                break;
            case R.id.btnNext:
                Intent intentOccasion = new Intent(this, OccasionActivity.class);
                startActivity(intentOccasion);
                break;
            case R.id.ivCalendar:
                ivCal.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.cal_selected));
                btnNext.setEnabled(true);
                btnNext.setBackgroundColor(ContextCompat.getColor(this,R.color.btn_background));
                break;
        }
    }
}
