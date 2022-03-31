package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class GainSpeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_speed);
        ImageButton goback = findViewById(R.id.btnback3);
        goback.setOnClickListener(v -> back());
        ImageButton gohome = findViewById(R.id.btnHome3);
        gohome.setOnClickListener(v -> home());
    }
    public void back(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
    public void home(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
}