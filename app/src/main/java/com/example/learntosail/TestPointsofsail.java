package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TestPointsofsail extends AppCompatActivity {

    private QuestionPoS[] questionList = new QuestionPoS[] {
            new QuestionPoS(R.mipmap.ic_broadreach, 2,R.string.closebtn,R.string.broadReachTitle,R.string.trainingRunTitle,R.string.goingAway),
            new QuestionPoS(R.mipmap.ic_closehaul, 3,R.string.beamHaul, R.string.deadReach,R.string.closeHaulTitle,R.string.broadRun),
            new QuestionPoS(R.mipmap.ic_trainingrun, 1, R.string.trainingRunTitle, R.string.goingAway, R.string.beamReachTitle, R.string.deadRunTitle),
            new QuestionPoS(R.mipmap.ic_beamreach, 3, R.string.deadReach,R.string.broadHaul,R.string.beamReachTitle,R.string.broadRun),
            new QuestionPoS(R.mipmap.ic_nogo,3,R.string.flappySail,R.string.facingWind,R.string.noGoZone,R.string.closeHaulTitle),
            new QuestionPoS(R.mipmap.ic_deadrun,4,R.string.goingAway,R.string.broadReachTitle,R.string.sailAway,R.string.deadRunTitle)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_pointsofsail);
        int questionNo = 0;
        TextView NoHolder = findViewById(R.id.txtCounter);
        NoHolder.setText(Integer.toString(questionNo));

        Button option1 = findViewById(R.id.btnOptionOne);
        Button option2 = findViewById(R.id.btnOptionTwo);
        Button option3 = findViewById(R.id.btnOptionThree);
        Button option4 = findViewById(R.id.btnOptionFour);
        ImageButton previous = findViewById(R.id.imgPrevious);
        ImageButton next = findViewById(R.id.imgNext);
        option1.setOnClickListener(v -> onClick(v));
        option2.setOnClickListener(v -> onClick(v));
        option3.setOnClickListener(v -> onClick(v));
        option4.setOnClickListener(v -> onClick(v));


    }
    public void onClick (View v){
        switch (v.getId()){
            case R.id.btnOptionOne:
                checkAnswer(1);
                break;
            case R.id.btnOptionTwo:
                checkAnswer(2);
                break;
        }
    }
}