package com.example.soundspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityCalendar extends AppCompatActivity {

    private ImageButton btn_caltndar_home;

    private Button btn_group2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        btn_caltndar_home = findViewById(R.id.btn_caltndar_home);
        btn_group2 = findViewById(R.id.btn_group2);

        btn_caltndar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCalendar.this, MainMenu.class);
                startActivity(intent);
            }
        });
        btn_group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCalendar.this, ActivityCalGroup2.class);
                startActivity(intent);
            }
        });
    }
}