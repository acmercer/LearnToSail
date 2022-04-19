package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class LearnPointsOfSail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_points_of_sail);
        ImageButton closehaul = findViewById(R.id.btnCloseHaul);
        closehaul.setOnClickListener(v -> {
            PointsofsailPopUp popUp = new PointsofsailPopUp();
            popUp.displayPopUp(v, "Close Haul", "At this point of sail you want to pull your sail all the way in.");
        });
        ImageButton back = findViewById(R.id.btnWeatherBack);
        back.setOnClickListener(v ->{
            Intent backbtn = new Intent(this, FirstActivity.class);
            startActivity(backbtn);
        });
        ImageButton home = findViewById(R.id.btnWeatherHome);
        home.setOnClickListener(v -> {
            Intent homebtn = new Intent(this, HomeScreen.class);
            startActivity(homebtn);
        });
    }
}