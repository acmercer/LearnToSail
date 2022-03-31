package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreenlayout);
        Button one = findViewById(R.id.Preparing1);
        one.setOnClickListener(v -> openFirstChoice());
        Button two = findViewById(R.id.onthewater);
        two.setOnClickListener(v -> openSecondChoice());
        Button three = findViewById(R.id.extras);
        three.setOnClickListener(v -> openThirdChoice());
    }
    public void openFirstChoice(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    public void openSecondChoice(){
        Intent intent = new Intent(this, OnTheWater.class);
        startActivity(intent);
    }
    public void openThirdChoice(){
        Intent intent = new Intent(this, GainSpeed.class);
        startActivity(intent);
    }
}