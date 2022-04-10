package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

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
    }
    public void question1() {

    }
}