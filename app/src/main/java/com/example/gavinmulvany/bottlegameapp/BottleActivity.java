package com.example.gavinmulvany.bottlegameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BottleActivity extends AppCompatActivity {

    ImageButton ib_bottle;
    Button b_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle);

        ib_bottle = (ImageButton) findViewById(R.id.ib_bottle);
        b_go = (Button) findViewById(R.id.b_go);

    }
}
