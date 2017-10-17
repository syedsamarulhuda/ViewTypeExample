package com.example.samar.viewtypeexample.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.samar.viewtypeexample.R;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView ivListToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ivListToolbar=(ImageView)findViewById(R.id.ivListToolbar);
        ivListToolbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.ivListToolbar:
                Intent intentHome = new Intent(this, MainActivity.class);
                startActivity(intentHome);
                finish();
                break;
        }
    }
}
