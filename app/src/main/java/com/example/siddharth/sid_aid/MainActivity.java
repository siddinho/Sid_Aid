package com.example.siddharth.sid_aid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.viewflipper1);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(400);
    }
}
