package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class BoatParts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat_parts);
        ImageButton back = findViewById(R.id.btnBoatBack);
        back.setOnClickListener(v -> back());
        ImageButton home = findViewById(R.id.btnBoatHome);
        home.setOnClickListener(v -> home());
    }
    public void back(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    public void home(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
}