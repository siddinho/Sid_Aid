package com.example.siddharth.sid_aid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

public class WaterReminder extends AppCompatActivity {
    Button workbtn;
    EditText weight;
    String natureofwork = "None";
    TextView calculate;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_reminder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Answer = (TextView) findViewById(R.id.ans);
        weight = (EditText) findViewById(R.id.weight);
        workbtn = (Button) findViewById(R.id.workbtn);
        workbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(WaterReminder.this, workbtn);
                mymenu.getMenuInflater().inflate(R.menu.mymenu1, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        natureofwork = (String) item.getTitle();
                        workbtn.setText(natureofwork);
                        return true;
                    }
                });
                mymenu.show();
            }
        });


        calculate = (TextView) findViewById(R.id.calculatewaterbtn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Integer.parseInt(weight.getText().toString());
                double a = 0;
                a = 0.67 * (w * 2.20);
                if (natureofwork.equalsIgnoreCase("Sedantary")) {
                } else if (natureofwork.equalsIgnoreCase("Light Outdoors")) {
                    a = a + 12;
                } else if (natureofwork.equalsIgnoreCase("High Outdoors")) {
                    a = a + 24;
                } else {
                }
                double w1 = a * 0.0295;
                Answer.setText(" Daily Intake for Weight (kg):" + w + "\n is :" + w1 + " Litres");

            }
        });

    }

}
