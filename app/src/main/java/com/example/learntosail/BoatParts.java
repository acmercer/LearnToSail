package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class BoatParts extends AppCompatActivity {


    private TextView halyardBlank, halyardLabel, mainBlank, mainLabel, mastBlank, mastLabel, jibBlank, jibLabel, hullBlank, hullLabel, daggerBlank, daggerLabel, kickerBlank, kickerLabel, mainsheetBlank, mainsheetLabel, jibsheetBlank, jibsheetLabel, painterBlank, painterLabel, boomBlank, boomLabel, rudderBlank, rudderLabel, tillerBlank, tillerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat_parts);
        ImageButton back = findViewById(R.id.btnBoatBack);
        back.setOnClickListener(v -> back());
        ImageButton home = findViewById(R.id.btnBoatHome);
        home.setOnClickListener(v -> home());
        ImageButton reset = findViewById(R.id.btnReset);
        reset.setOnClickListener(v -> restart());

        //Blank spots for labels
        halyardBlank = findViewById(R.id.halyardBlank); halyardBlank.setOnDragListener(new LabelDragListener()); halyardBlank.setOnTouchListener(new LabelTouchListener());
        mainBlank = findViewById(R.id.mainBlank); mainBlank.setOnDragListener(new LabelDragListener()); mainBlank.setOnTouchListener(new LabelTouchListener());
        mastBlank = findViewById(R.id.mastBlank); mastBlank.setOnDragListener(new LabelDragListener()); mastBlank.setOnTouchListener(new LabelTouchListener());
        jibBlank = findViewById(R.id.jibBlank); jibBlank.setOnDragListener(new LabelDragListener()); jibBlank.setOnTouchListener(new LabelTouchListener());
        hullBlank = findViewById(R.id.hullBlank); hullBlank.setOnDragListener(new LabelDragListener()); hullBlank.setOnTouchListener(new LabelTouchListener());
        daggerBlank = findViewById(R.id.daggerBlank); daggerBlank.setOnDragListener(new LabelDragListener()); daggerBlank.setOnTouchListener(new LabelTouchListener());
        kickerBlank = findViewById(R.id.kickerBlank); kickerBlank.setOnDragListener(new LabelDragListener()); kickerBlank.setOnTouchListener(new LabelTouchListener());
        mainsheetBlank = findViewById(R.id.mainsheetBlank); mainsheetBlank.setOnDragListener(new LabelDragListener()); mainsheetBlank.setOnTouchListener(new LabelTouchListener());
        jibsheetBlank = findViewById(R.id.jibsheetBlank); jibsheetBlank.setOnDragListener(new LabelDragListener()); jibsheetBlank.setOnTouchListener(new LabelTouchListener());
        painterBlank = findViewById(R.id.painterBlank); painterBlank.setOnDragListener(new LabelDragListener()); painterBlank.setOnTouchListener(new LabelTouchListener());
        boomBlank = findViewById(R.id.boomBlank); boomBlank.setOnDragListener(new LabelDragListener()); boomBlank.setOnTouchListener(new LabelTouchListener());
        rudderBlank = findViewById(R.id.rudderBlank); rudderBlank.setOnDragListener(new LabelDragListener()); rudderBlank.setOnTouchListener(new LabelTouchListener());
        tillerBlank = findViewById(R.id.tillerBlank); tillerBlank.setOnDragListener(new LabelDragListener()); tillerBlank.setOnTouchListener(new LabelTouchListener());

        //Labels to be dragged
        halyardLabel = findViewById(R.id.halyardLabel); halyardLabel.setOnTouchListener(new LabelTouchListener()); halyardLabel.setOnDragListener(new LabelDragListener());
        mainLabel = findViewById(R.id.mainLabel); mainLabel.setOnTouchListener(new LabelTouchListener()); mainLabel.setOnDragListener(new LabelDragListener());
        mastLabel = findViewById(R.id.mastLabel); mastLabel.setOnTouchListener(new LabelTouchListener()); mastLabel.setOnDragListener(new LabelDragListener());
        jibLabel = findViewById(R.id.jibLabel); jibLabel.setOnTouchListener(new LabelTouchListener()); jibLabel.setOnDragListener(new LabelDragListener());
        hullLabel = findViewById(R.id.hullLabel); hullLabel.setOnTouchListener(new LabelTouchListener()); hullLabel.setOnDragListener(new LabelDragListener());
        daggerLabel = findViewById(R.id.daggerLabel); daggerLabel.setOnTouchListener(new LabelTouchListener()); daggerLabel.setOnDragListener(new LabelDragListener());
        kickerLabel = findViewById(R.id.kickerLabel); kickerLabel.setOnTouchListener(new LabelTouchListener()); kickerLabel.setOnDragListener(new LabelDragListener());
        mainsheetLabel = findViewById(R.id.mainsheetLabel); mainsheetLabel.setOnTouchListener(new LabelTouchListener()); mainsheetLabel.setOnDragListener(new LabelDragListener());
        jibsheetLabel = findViewById(R.id.jibsheetLabel); jibsheetLabel.setOnTouchListener(new LabelTouchListener()); jibsheetLabel.setOnDragListener(new LabelDragListener());
        painterLabel = findViewById(R.id.painterLabel);painterLabel.setOnTouchListener(new LabelTouchListener()); painterLabel.setOnDragListener(new LabelDragListener());
        boomLabel = findViewById(R.id.boomLabel); boomLabel.setOnTouchListener(new LabelTouchListener()); boomLabel.setOnDragListener(new LabelDragListener());
        rudderLabel = findViewById(R.id.rudderLabel); rudderLabel.setOnTouchListener(new LabelTouchListener()); rudderLabel.setOnDragListener(new LabelDragListener());
        tillerLabel = findViewById(R.id.tillerLabel); tillerLabel.setOnTouchListener(new LabelTouchListener()); tillerLabel.setOnDragListener(new LabelDragListener());
    }
    public void back(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    public void home(){
        Intent intent2 = new Intent(this, HomeScreen.class);
        startActivity(intent2);
    }
    public void restart() {
        recreate();
    }
    private final class LabelTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent){
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                //Set-up drag action
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                return true;
            }
            else {
                return false;
            }
        }
    }
    private class LabelDragListener implements View.OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event){
            //Handle drag events
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                case DragEvent.ACTION_DRAG_ENTERED:
                case DragEvent.ACTION_DRAG_EXITED:
                case DragEvent.ACTION_DRAG_ENDED:
                default:
                    break;
                case DragEvent.ACTION_DROP:
                    //Handle dragged view being dropped over a drop view
                    View view = (View) event.getLocalState();
                    TextView dropTarget = (TextView) v;
                    TextView dropped = (TextView) view;
                    String dropID = view.getResources().getResourceEntryName(view.getId());
                    String endID = view.getResources().getResourceEntryName(view.getId());
                    dropTarget.setText(dropped.getText());
                    dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                    if (dropID.contains("Blank")) {
                        if (endID.contains("Label")) {
                            view.setVisibility(View.GONE);
                        } else {
                            dropped.setText("");
                        }
                        //view.setVisibility(View.INVISIBLE);

                        Object tag = dropTarget.getTag();

                        if (tag != null) {
                            //the tag is the view id already dropped here
                            int existingID = (Integer) tag;
                            //set the original view visible again
                            findViewById(existingID).setVisibility(View.VISIBLE);
                        }
                    }
            }
            return true;
        }
    }
}