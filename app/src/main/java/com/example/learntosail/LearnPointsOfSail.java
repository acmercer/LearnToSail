package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class LearnPointsOfSail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_points_of_sail);
        ImageButton closehaul = findViewById(R.id.btnCloseHaul);
        closehaul.setOnClickListener(v -> {
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, "hi", "no");
        });
    }
}