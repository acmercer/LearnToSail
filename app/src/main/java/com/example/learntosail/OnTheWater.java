package com.example.learntosail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OnTheWater extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_select2);
        ImageView backbtn = findViewById(R.id.backButton2);
        backbtn.setOnClickListener(v -> goBack2());
        ImageButton home2 = findViewById(R.id.btnTopic2Home);
        home2.setOnClickListener(v -> home2());
        Button pointsofsail = findViewById(R.id.btnPointsofSail);
        pointsofsail.setOnClickListener(v -> {
            Intent intent3 = new Intent(this, LearnPointsOfSail.class);
            startActivity(intent3);
        });
    }
    public void goBack2(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
    public void home2(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
}
