package com.example.learntosail;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class BoatParts extends AppCompatActivity {


    TextView halyardBlank, halyardLabel, mainBlank, mainLabel, mastBlank, mastLabel, jibBlank, jibLabel, hullBlank, hullLabel, daggerBlank, daggerLabel, kickerBlank, kickerLabel, mainsheetBlank, mainsheetLabel, jibsheetBlank, jibsheetLabel, painterBlank, painterLabel, boomBlank, boomLabel, rudderBlank, rudderLabel, tillerBlank, tillerLabel;
    ImageView tillerCheck, rudderCheck, boomCheck, painterCheck, mainsheetCheck, jibsheetCheck, kickerCheck, daggerCheck, hullCheck, jibCheck, mastCheck, mainCheck, halyardCheck;
    String [] labelTexts = {"Tiller","Rudder","The Boom","Painter","Main Sheet","Jib Sheet","Kicker","Daggerboard","The Hull","The Jib","The Mast","Mainsail","Main Halyard"};

    //TextView [] labelId = {tillerBlank, rudderBlank, boomBlank, painterBlank, mainsheetBlank, jibsheetBlank, kickerBlank, daggerBlank, hullBlank, jibBlank, mastBlank, mainBlank, halyardBlank};
    //ImageView  [] checkId = {tillerCheck, rudderCheck, boomCheck, painterCheck, mainsheetCheck, jibsheetCheck, kickerCheck, daggerCheck, hullCheck, jibCheck, mastCheck, mainCheck, halyardCheck};
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
        Button checkInput = findViewById(R.id.btnCheckBoatParts);
        checkInput.setOnClickListener(v -> checkSelection());

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

        //Check marks
        tillerCheck = findViewById(R.id.imgCheckTiller);
        rudderCheck = findViewById(R.id.imgCheckRudder);
        boomCheck = findViewById(R.id.imgCheckBoom);
        painterCheck = findViewById(R.id.imgCheckPainter);
        mainsheetCheck = findViewById(R.id.imgCheckMSheet);
        jibsheetCheck = findViewById(R.id.imgCheckJSheet);
        kickerCheck = findViewById(R.id.imgCheckKicker);
        daggerCheck = findViewById(R.id.imgCheckDagger);
        hullCheck = findViewById(R.id.imgCheckHull);
        jibCheck = findViewById(R.id.imgCheckJSail);
        mastCheck = findViewById(R.id.imgCheckMast);
        mainCheck = findViewById(R.id.imgCheckMSail);
        halyardCheck = findViewById(R.id.imgCheckHal);


        //TextView [] labelId = {tillerBlank, rudderBlank, boomBlank, painterBlank, mainsheetBlank, jibsheetBlank, kickerBlank, daggerBlank, hullBlank, jibBlank, mastBlank, mainBlank, halyardBlank};
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
                    //Handle dragged label being dropped over a blank label
                    View view = (View) event.getLocalState();
                    TextView dropTarget = (TextView) v;
                    TextView dropped = (TextView) view;
                    //String dropID = v.getResources().getResourceEntryName(v.getId());
                    String moveID = view.getResources().getResourceEntryName(view.getId());

                    Object tag = dropTarget.getTag();
                    if (tag == null){
                        dropTarget.setText(dropped.getText());
                        dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    else{
                        int currentID = (Integer) tag;
                        dropTarget.setText(dropped.getText());
                        dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                        findViewById(currentID).setVisibility(View.VISIBLE);
                    }
                    if (moveID.contains("Label")){
                        dropped.setVisibility(View.GONE);
                    }
                    else{
                        dropped.setText("");
                    }
                    dropTarget.setTag(dropped.getId());
                    }

            return true;
        }
    }
    public void checkSelection(){
        //TODO check whether it is correct
        TextView [] labelId = {tillerBlank, rudderBlank, boomBlank, painterBlank, mainsheetBlank, jibsheetBlank, kickerBlank, daggerBlank, hullBlank, jibBlank, mastBlank, mainBlank, halyardBlank};
        ImageView  [] checkId = {tillerCheck, rudderCheck, boomCheck, painterCheck, mainsheetCheck, jibsheetCheck, kickerCheck, daggerCheck, hullCheck, jibCheck, mastCheck, mainCheck, halyardCheck};
        int total =0;
        for (int i=0; i< labelId.length; i++){
            //Run through tests
            if (labelId[i].getText() == labelTexts[i]){
                checkId[i].setVisibility(View.VISIBLE);
                total+=1;
            }
            else {
                checkId[i].setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ic_incorrect));
                checkId[i].setVisibility(View.VISIBLE);
            }
        }
    }
}