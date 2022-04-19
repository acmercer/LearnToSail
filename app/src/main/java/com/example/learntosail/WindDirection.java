package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class WindDirection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winddirection);

        //Setting up different image views
        ImageButton imgOp1, imgOp2, imgOp3, imgOp4;
        imgOp1 = findViewById(R.id.btnOption1);
        imgOp2 = findViewById(R.id.btnOption2);
        imgOp3 = findViewById(R.id.btnOption3);
        imgOp4 = findViewById(R.id.btnOption4);
        imgOp1.setOnClickListener(v -> {
            WindCheck popUpClass = new WindCheck();
            popUpClass.showWindPopup(v);
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
    public void wrong() {
        //Code to alert the choice was wrong
    }
}