package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_topic_select1);
    ImageButton button = findViewById(R.id.backbutton);
    button.setOnClickListener(v -> goBack());
    Button btnDressing = findViewById(R.id.btnDressing);
    btnDressing.setOnClickListener(v -> dressing());
    Button btnBoatParts = findViewById(R.id.btnBoatParts);
    btnBoatParts.setOnClickListener(v -> showPopupWindow(v));
    ImageButton home = findViewById(R.id.btnTopic1Home);
    home.setOnClickListener(v -> home());
    Button btnWeather = findViewById(R.id.btnWeather);
    btnWeather.setOnClickListener(V -> {
        Intent weather = new Intent(this,WindDirection.class);
        startActivity(weather);
    });
}
    public void goBack(){
        Intent intent1 = new Intent(this, HomeScreen.class);
        startActivity(intent1);
    }
    public void dressing(){
        Intent intent2 = new Intent(this, DressToSailActivity.class);
        startActivity(intent2);
    }
    public void home(){
        Intent intent4 = new Intent(this, HomeScreen.class);
        startActivity(intent4);
    }
    public void showPopupWindow(final View view) {

        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_pop_up_choice, null);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;
        boolean focusable = true;

        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        Button learn = popupView.findViewById(R.id.btnLearn);
        learn.setOnClickListener(v -> {
            startActivity(new Intent(FirstActivity.this, LearnBoatParts.class));
            popupWindow.dismiss();
        });
        Button test = popupView.findViewById(R.id.btnTest);
        test.setOnClickListener(v -> {
            startActivity(new Intent(FirstActivity.this, BoatParts.class));
            popupWindow.dismiss();
        });

        popupView.setOnTouchListener((v, event) -> {

            popupWindow.dismiss();
            return true;
        });
    }

}