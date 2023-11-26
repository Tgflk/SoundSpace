package com.example.soundspace;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityCalGroup2 extends AppCompatActivity {

    private ImageButton btn_caltndargroup2_home;

    private Button btn_group1_1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_group2);

        btn_caltndargroup2_home = findViewById(R.id.btn_caltndargroup2_home);
        btn_group1_1 = findViewById(R.id.btn_group1_1);

        btn_caltndargroup2_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCalGroup2.this, MainMenu.class);
                startActivity(intent);
            }
        });
        btn_group1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCalGroup2.this, ActivityCalendar.class);
                startActivity(intent);
            }
        });
    }
}