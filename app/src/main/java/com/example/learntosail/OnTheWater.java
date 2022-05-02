package com.example.learntosail;

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
        pointsofsail.setOnClickListener(v -> showPopup(v));
    }
    public void goBack2(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
    public void home2(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
    public void showPopup(final View view) {

        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_pop_up_choice, null);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        Button learn = popupView.findViewById(R.id.btnLearn);
        learn.setOnClickListener(v -> {
            startActivity(new Intent(OnTheWater.this, LearnPointsOfSail.class));
            popupWindow.dismiss();
        });
        Button test = popupView.findViewById(R.id.btnTest);
        test.setOnClickListener(v -> {
            startActivity(new Intent(OnTheWater.this, TestPointsofsail.class));
            popupWindow.dismiss();
        });

        popupView.setOnTouchListener((v, event) -> {

            //Close the window when clicked
            popupWindow.dismiss();
            return true;
        });
    }
}
