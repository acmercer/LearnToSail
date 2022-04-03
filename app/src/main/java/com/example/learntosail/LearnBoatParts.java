package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class LearnBoatParts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_boat_parts);
        ImageButton back = findViewById(R.id.btnBoatBack2);
        back.setOnClickListener(v -> back());
        ImageButton home = findViewById(R.id.btnBoatHome2);
        home.setOnClickListener(v -> home());
        ImageButton mainSheet = findViewById(R.id.btnMainSheet);
        mainSheet.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.mainTitle));
            String descript = getResources().getString(R.string.mainDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton mainhal = findViewById(R.id.btnMainHalyard);
        mainhal.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.halyardTitle));
            String descript = getResources().getString(R.string.halyardDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton mainsail = findViewById(R.id.btnMainsail);
        mainsail.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.mainSailTitle));
            String descript = getResources().getString(R.string.mainSailDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton jibsheet = findViewById(R.id.btnJibSheet);
        jibsheet.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.jibsheetTitle));
            String descript = getResources().getString(R.string.jibsheetDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton daggerboard = findViewById(R.id.btnDaggerBoard);
        daggerboard.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.daggerTitle));
            String descript = getResources().getString(R.string.daggerDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton rudder = findViewById(R.id.btnRudder);
        rudder.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.rudderTitle));
            String descript = getResources().getString(R.string.rudderDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton tiller = findViewById(R.id.btnTiller);
        tiller.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.tillerTitle));
            String descript = getResources().getString(R.string.tillerDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton kicker = findViewById(R.id.btnKicker);
        kicker.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.kickerTitle));
            String descript = getResources().getString(R.string.kickerDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton painter = findViewById(R.id.btnPainter);
        painter.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.painterTitle));
            String descript = getResources().getString(R.string.painterDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton mast = findViewById(R.id.btnMast);
        mast.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.mastTitle));
            String descript = getResources().getString(R.string.mastDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton boom = findViewById(R.id.btnBoom);
        boom.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.boomTitle));
            String descript = getResources().getString(R.string.boomDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton jib = findViewById(R.id.btnJib);
        jib.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.jibTitle));
            String descript = getResources().getString(R.string.jibDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
        ImageButton hull = findViewById(R.id.btnHull);
        hull.setOnClickListener(v -> {
            String title = (getResources().getString(R.string.hullTitle));
            String descript = getResources().getString(R.string.hullDesc);
            PopUpClass popUpClass = new PopUpClass();
            popUpClass.showPopupWindow(v, title,descript);
        });
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