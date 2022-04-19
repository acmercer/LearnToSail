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
            popUp.displayPopUp(v, getResources().getString(R.string.closeHaulTitle), getResources().getString(R.string.closeHaulText), getResources().getDrawable(R.mipmap.ic_closehaul_foreground));
        });
        ImageButton beamReach = findViewById(R.id.btnBeamReach);
        beamReach.setOnClickListener(v -> {
            PointsofsailPopUp popUp = new PointsofsailPopUp();
            popUp.displayPopUp(v, getResources().getString(R.string.beamReachTitle), getResources().getString(R.string.beamReachText), getResources().getDrawable(R.mipmap.ic_beamreach_foreground));
        });
        ImageButton broadReach = findViewById(R.id.btnBroadReach);
        broadReach.setOnClickListener(v -> {
            PointsofsailPopUp popUp = new PointsofsailPopUp();
            popUp.displayPopUp(v, getResources().getString(R.string.broadReachTitle), getResources().getString(R.string.broadReachText), getResources().getDrawable(R.mipmap.ic_broadreach_foreground));
        });
        ImageButton trainingRun = findViewById(R.id.btnTrainingRun);
        trainingRun.setOnClickListener(v -> {
            PointsofsailPopUp popUp = new PointsofsailPopUp();
            popUp.displayPopUp(v, getResources().getString(R.string.trainingRunTitle), getResources().getString(R.string.trainingRunText), getResources().getDrawable(R.mipmap.ic_trainingrun_foreground));
        });
        ImageButton deadRun = findViewById(R.id.btnDeadRun);
        deadRun.setOnClickListener(v -> {
            PointsofsailPopUp popUp = new PointsofsailPopUp();
            popUp.displayPopUp(v, getResources().getString(R.string.deadRunTitle), getResources().getString(R.string.deadRunText), getResources().getDrawable(R.mipmap.ic_deadrun_foreground));
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