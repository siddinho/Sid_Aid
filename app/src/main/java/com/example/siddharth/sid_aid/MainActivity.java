package com.example.siddharth.sid_aid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.viewflipper1);
        viewFlipper.setAutoStart(true);


        //Second Day Code


        final Button Emergency = (Button) findViewById(R.id.emergencybtn);
        Emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Emergency.class);
                startActivity(i);
            }
        });

        Button WaterReminder = (Button) findViewById(R.id.reminderbtnbtn);
        WaterReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, WaterReminder.class);
                startActivity(i);

            }
        });



    }
}
