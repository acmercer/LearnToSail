package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
// TODO Check selected clothing items and advise
public class DressToSailActivity extends AppCompatActivity {
    ImageView imgSunHat, imgBouyancy, imgWinterHat, imgLongWetsuit, imgShortWetsuit, imgsuncreamL, imgsuncreamR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_to_sail);
        ImageButton back = findViewById(R.id.backButton3);
        back.setOnClickListener(v -> goBack3());
        ImageButton sunHat = findViewById(R.id.selectSunHat);
        sunHat.setOnClickListener(v -> sunHat());
        imgSunHat = findViewById(R.id.sunHat);
        imgBouyancy = findViewById(R.id.bouyancyAid);
        imgWinterHat = findViewById(R.id.winterHat);
        imgLongWetsuit = findViewById(R.id.longWetsuit);
        imgShortWetsuit = findViewById(R.id.shortWetsuit);
        imgsuncreamL = findViewById(R.id.suncreamL);
        imgsuncreamR = findViewById(R.id.suncreamR);
        ImageView[] imgs = {imgSunHat, imgBouyancy, imgWinterHat, imgLongWetsuit, imgShortWetsuit, imgsuncreamL, imgsuncreamR};
        ImageButton bouyancy = findViewById(R.id.selectBouyancy);
        bouyancy.setOnClickListener(v -> bouyancy());
        ImageButton winter = findViewById(R.id.selectWinterHat);
        winter.setOnClickListener(v -> winterHat());
        ImageButton longsuit = findViewById(R.id.selectLongWetsuit);
        longsuit.setOnClickListener(v -> longWetsuit());
        ImageButton shortsuit = findViewById(R.id.selectShortWetsuit);
        shortsuit.setOnClickListener(v -> shortWetsuit());
        ImageButton suncream = findViewById(R.id.selectSunCream);
        suncream.setOnClickListener(v -> suncream());
        Button dressDone = findViewById(R.id.btnReady);
        ImageButton home = findViewById(R.id.btnDressHome);
        home.setOnClickListener(v -> dressHome());
    }
    public void dressHome(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
    public void goBack3(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    public void sunHat(){
        if (imgSunHat.getVisibility() == View.INVISIBLE){
            if (imgWinterHat.getVisibility()==View.VISIBLE){
                imgWinterHat.setVisibility(View.INVISIBLE);
            }
            imgSunHat.setVisibility(View.VISIBLE);
        }
        else{
            imgSunHat.setVisibility(View.INVISIBLE);
        }
    }
    public void bouyancy(){
        if (imgBouyancy.getVisibility() == View.INVISIBLE){
            imgBouyancy.setVisibility(View.VISIBLE);
        }
        else{
            imgBouyancy.setVisibility(View.INVISIBLE);
        }
    }
    public void winterHat(){
        if (imgWinterHat.getVisibility() == View.INVISIBLE){
            if (imgSunHat.getVisibility()==View.VISIBLE){
                imgSunHat.setVisibility(View.INVISIBLE);
            }
            imgWinterHat.setVisibility(View.VISIBLE);
        }
        else{
            imgWinterHat.setVisibility(View.INVISIBLE);
        }
    }
    public void longWetsuit(){
        if (imgLongWetsuit.getVisibility() == View.INVISIBLE){
            if (imgShortWetsuit.getVisibility()==View.VISIBLE){
                imgShortWetsuit.setVisibility(View.INVISIBLE);
            }
            imgLongWetsuit.setVisibility(View.VISIBLE);
        }
        else{
            imgLongWetsuit.setVisibility(View.INVISIBLE);
        }
    }
    public void shortWetsuit(){
        if (imgShortWetsuit.getVisibility() == View.INVISIBLE){
            if (imgLongWetsuit.getVisibility()==View.VISIBLE){
                imgLongWetsuit.setVisibility(View.INVISIBLE);
            }
            imgShortWetsuit.setVisibility(View.VISIBLE);
        }
        else{
            imgShortWetsuit.setVisibility(View.INVISIBLE);
        }
    }
    public void suncream(){
        if (imgsuncreamR.getVisibility() == View.INVISIBLE){
            imgsuncreamR.setVisibility(View.VISIBLE);
            imgsuncreamL.setVisibility(View.VISIBLE);
        }
        else{
            imgsuncreamL.setVisibility(View.INVISIBLE);
            imgsuncreamR.setVisibility(View.INVISIBLE);
        }
    }
}