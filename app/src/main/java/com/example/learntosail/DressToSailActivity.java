package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class DressToSailActivity extends AppCompatActivity {
    ImageView imgSunHat, imgBouyancy, imgWinterHat, imgLongWetsuit, imgShortWetsuit, imgsuncreamL, imgsuncreamR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_to_sail);
        ImageButton back = findViewById(R.id.backButtonW);
        back.setOnClickListener(v -> {
            startActivity(new Intent(this, FirstActivity.class));
        });
        ImageButton home = findViewById(R.id.btnDressHomeW);
        home.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeScreen.class));
        });
        ImageButton sunHat = findViewById(R.id.selectSunHatW);
        sunHat.setOnClickListener(v -> sunHat());
        imgSunHat = findViewById(R.id.sunHatW);
        imgBouyancy = findViewById(R.id.bouyancyAidW);
        imgWinterHat = findViewById(R.id.winterHatW);
        imgLongWetsuit = findViewById(R.id.longWetsuitW);
        imgShortWetsuit = findViewById(R.id.shortWetsuitW);
        imgsuncreamL = findViewById(R.id.suncreamLW);
        imgsuncreamR = findViewById(R.id.suncreamRW);
        ImageView[] imgs = {imgSunHat, imgBouyancy, imgWinterHat, imgLongWetsuit, imgShortWetsuit, imgsuncreamL, imgsuncreamR};
        ImageButton bouyancy = findViewById(R.id.selectBouyancyW);
        bouyancy.setOnClickListener(v -> bouyancy());
        ImageButton winter = findViewById(R.id.selectWinterHatW);
        winter.setOnClickListener(v -> winterHat());
        ImageButton longsuit = findViewById(R.id.selectLongWetsuitW);
        longsuit.setOnClickListener(v -> longWetsuit());
        ImageButton shortsuit = findViewById(R.id.selectShortWetsuitW);
        shortsuit.setOnClickListener(v -> shortWetsuit());
        ImageButton suncream = findViewById(R.id.selectSunCreamW);
        suncream.setOnClickListener(v -> suncream());
        Button dressDone = findViewById(R.id.btnReadyW);
        dressDone.setOnClickListener(v -> DressToSailCheckSummer(v));
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
    public void DressToSailCheckSummer(View view){
        int count = 0; String title = "";
        String hatCheck = "";
        String wetsuits ="";
        String bouyancy = "";
        String suncream = "";
        if(imgWinterHat.getVisibility() == View.VISIBLE){
            hatCheck = "You're going to get too hot in a winter hat!";
        }
        else if (imgSunHat.getVisibility() == View.VISIBLE){
            hatCheck = "Good job the sunhat will keep the sun off your face!";
            count+=1;
        }
        else {
            hatCheck = "You should cover your head and face from the sun.";
        }
        if (imgLongWetsuit.getVisibility() == View.VISIBLE){
            wetsuits = "If possible a short wetsuit instead or if it's really hot swim shorts and a top.";
        }
        else if (imgShortWetsuit.getVisibility()== View.VISIBLE){
            wetsuits = "A short wetsuit is ideal for this weather!";
            count+=1;
        }
        else {
            wetsuits = "If you fall in you can still get cold without a wetsuit even when sunny.";
        }
        if (imgBouyancy.getVisibility() == View.INVISIBLE){
            bouyancy = "Always wear a bouyancy aid when sailing!";
        }
        else {
            bouyancy = "Well done! Wearing a bouyancy aid is very important!";
            count+=1;
        }
        if (imgsuncreamL.getVisibility() == View.INVISIBLE){
            suncream = "Don't forget the sun reflects off the water making it easy to burn!";
        }
        else {
            suncream = "Suncream is always a good idea when it's sunny!";
            count+=1;
        }
        if (count <= 1){
            title = "Try again...";
        }
        else if (count <=3){
            title = "Good try!";
        }
        else{
            title = "Perfect!";
        }
        displayResults(view, title, suncream, bouyancy, wetsuits, hatCheck, count);
    }
    public void displayResults(final View view, String title, String suncream, String bouyancy, String wetsuits, String hatCheck, int count) {


        //Create a View object yourself through inflater
        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.checkoutfit, null);

        //Specify the length and width through constants
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        //Make Inactive Items Outside Of PopupWindow
        boolean focusable = true;

        //Create a window with our parameters
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        //Set the location of the window on the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        //Initialize the elements of our window, install the handler
        //TextView txtTitle, txtHat, txtFace, txtWetsuit, txtBouyancy;
        TextView txtTitle = popupView.findViewById(R.id.txtTitleDress);
        TextView txtHat = popupView.findViewById(R.id.txtHead);
        TextView txtFace = popupView.findViewById(R.id.txtFace);
        TextView txtWetsuit = popupView.findViewById(R.id.txtWetsuit);
        TextView txtBouyancy = popupView.findViewById(R.id.txtBouyancy);
        Button retry = popupView.findViewById(R.id.btnRetry);
        Button next = popupView.findViewById(R.id.btnNext);
        if (count == 4){
            next.setClickable(true);
            next.setBackgroundColor(0xFFFB9058);
        }
        else {
            next.setClickable(false);
        }
        txtTitle.setText(title);
        txtHat.setText(hatCheck);
        txtFace.setText(suncream);
        txtWetsuit.setText(wetsuits);
        txtBouyancy.setText(bouyancy);
        retry.setOnClickListener(v -> {
            popupWindow.dismiss();
        });
        next.setOnClickListener(v -> {
            startActivity(new Intent(DressToSailActivity.this, DressToSailActivityW.class));
            popupWindow.dismiss();
        });


        //Handler for clicking on the inactive zone of the window

        popupView.setOnTouchListener((v, event) -> {

            //Close the window when clicked
            popupWindow.dismiss();
            return true;
        });
    }
}