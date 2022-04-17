package com.example.learntosail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OnTheWater extends AppCompatActivity {
    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_select2);
        button = findViewById(R.id.backButton2);
        button.setOnClickListener(v -> goBack2());
        ImageButton home2 = findViewById(R.id.btnTopic2Home);
        home2.setOnClickListener(v -> home2());
        Button pointsofsail = findViewById(R.id.btnPointsofSail);
        pointsofsail.setOnClickListener(v -> pointofsail());
    }
    public void goBack2(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
    public void home2(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
    public void pointofsail(){
        Intent intent3 = new Intent(this, LearnPointsOfSail.class);
        startActivity(intent3);
    }
}
