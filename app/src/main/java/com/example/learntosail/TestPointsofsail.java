package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TestPointsofsail extends AppCompatActivity {

    private QuestionPoS[] questionList = new QuestionPoS[] {
            new QuestionPoS(R.mipmap.ic_broadreach_foreground, 2,R.string.closebtn,R.string.broadReachTitle,R.string.trainingRunTitle,R.string.goingAway, false,0),
            new QuestionPoS(R.mipmap.ic_closehaul_foreground, 3,R.string.beamHaul, R.string.deadReach,R.string.closeHaulTitle,R.string.broadRun, false,0),
            new QuestionPoS(R.mipmap.ic_trainingrun_foreground, 1, R.string.trainingRunTitle, R.string.goingAway, R.string.beamReachTitle, R.string.deadRunTitle, false,0),
            new QuestionPoS(R.mipmap.ic_beamreach_foreground, 3, R.string.deadReach,R.string.broadHaul,R.string.beamReachTitle,R.string.broadRun, false,0),
            new QuestionPoS(R.mipmap.ic_nogo_foreground,3,R.string.flappySail,R.string.facingWind,R.string.noGoZone,R.string.closeHaulTitle, false,0),
            new QuestionPoS(R.mipmap.ic_deadrun_foreground,4,R.string.goingAway,R.string.broadReachTitle,R.string.sailAway,R.string.deadRunTitle, false,0)
    };
    private Button option1, option2, option3, option4;
    private ImageButton previous, next, reset, home;
    private TextView NoHolder, OutOf, Title, Wind, ans1, ans2, ans3, ans4, ans5, ans6, totalRight, endPrompt;
    private ImageView boat, windarrow;
    private int questionNo,correctCount;
    private CardView finished;
    private String correctBoolean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_pointsofsail);
        questionNo = 0; correctCount = 0;
        NoHolder = findViewById(R.id.txtCounter);
        NoHolder.setText(Integer.toString(questionNo+1));
        Title = findViewById(R.id.txtPoSTitle);
        option1 = findViewById(R.id.btnOptionOne);
        option2 = findViewById(R.id.btnOptionTwo);
        option3 = findViewById(R.id.btnOptionThree);
        option4 = findViewById(R.id.btnOptionFour);
        previous = findViewById(R.id.imgPrevious);
        next = findViewById(R.id.imgNext);
        option1.setOnClickListener(this::onClick);
        option2.setOnClickListener(this::onClick);
        option3.setOnClickListener(this::onClick);
        option4.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);
        previous.setOnClickListener(this::onClick);
        boat = findViewById(R.id.imgBoatPoS);
        OutOf = findViewById(R.id.txtOutOf);
        Wind = findViewById(R.id.txtWindDirection);
        windarrow = findViewById(R.id.imgWindArrow);
        finished = findViewById(R.id.endPage);
        totalRight = findViewById(R.id.txtScorePoS);
        endPrompt = findViewById(R.id.txtEndMsg);
        reset = findViewById(R.id.btnResetPoS);
        home = findViewById(R.id.btnHomePoS);
        reset.setOnClickListener(this::onClick);
        home.setOnClickListener(this::onClick);
        ans1 = findViewById(R.id.txtAns1);ans2 = findViewById(R.id.txtAns2);ans3 = findViewById(R.id.txtAns3);
        ans4 = findViewById(R.id.txtAns4);ans5 = findViewById(R.id.txtAns5);ans6 = findViewById(R.id.txtAns6);
    }
    public void onClick (View v){
        switch (v.getId()){
            case R.id.btnOptionOne:
                checkAnswer(1);
                option1.setBackgroundColor(0x52FB9058);option2.setBackgroundColor(0xFFFB9058);
                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                break;
            case R.id.btnOptionTwo:
                checkAnswer(2);
                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0x52FB9058);
                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                break;
            case R.id.btnOptionThree:
                checkAnswer(3);
                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                option3.setBackgroundColor(0x52FB9058);option4.setBackgroundColor(0xFFFB9058);
                break;
            case R.id.btnOptionFour:
                checkAnswer(4);
                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0x52FB9058);
                break;
            case R.id.btnResetPoS:
                recreate();
                break;
            case R.id.btnHomePoS:
                startActivity(new Intent(this, HomeScreen.class));
            case R.id.imgPrevious:
                if (questionNo > 0){
                    questionNo = questionNo - 1;
                    questionSet();
                    switch (questionList[questionNo].getSelected()){
                        case 1:
                            option1.setBackgroundColor(0x52FB9058);option2.setBackgroundColor(0xFFFB9058);
                            option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                            break;
                        case 2:
                            option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0x52FB9058);
                            option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                            break;
                        case 3:
                            option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                            option3.setBackgroundColor(0x52FB9058);option4.setBackgroundColor(0xFFFB9058);
                            break;
                        case 4:
                            option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                            option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0x52FB9058);
                            break;
                    }

                }
                break;
            case R.id.imgNext:
                if (questionNo < 7){
                    questionNo +=1;
                    if (questionNo == 6){
                        option1.setVisibility(View.INVISIBLE);
                        option2.setVisibility(View.INVISIBLE);
                        option3.setVisibility(View.INVISIBLE);
                        option4.setVisibility(View.INVISIBLE);
                        boat.setVisibility(View.INVISIBLE);
                        next.setVisibility(View.INVISIBLE);
                        previous.setVisibility(View.INVISIBLE);
                        NoHolder.setVisibility(View.INVISIBLE);
                        OutOf.setVisibility(View.INVISIBLE);
                        windarrow.setVisibility(View.INVISIBLE);
                        Wind.setVisibility(View.INVISIBLE);
                        Title.setVisibility(View.INVISIBLE);
                        finished.setVisibility(View.VISIBLE);
                        for (int i = 0; i < questionList.length; i++){
                            if (questionList[i].isCorrect() == true){
                                correctCount+=1;
                                correctBoolean = getResources().getString(R.string.correctans) ;
                            }
                            else {
                                correctBoolean = getResources().getString(R.string.wrongans) ;
                            }

                            switch (i){
                                case 0:
                                    ans1.setText(correctBoolean);
                                case 1:
                                    ans2.setText(correctBoolean);
                                case 2:
                                    ans3.setText(correctBoolean);
                                case 3:
                                    ans4.setText(correctBoolean);
                                case 4:
                                    ans5.setText(correctBoolean);
                                case 5:
                                    ans6.setText(correctBoolean);
                            }
                        }
                        totalRight.setText(Integer.toString(correctCount));
                        if (correctCount<2){
                            endPrompt.setText("Practice needed...");
                        }
                        else if (correctCount <5){
                            endPrompt.setText("Not bad...");
                        }
                        else{
                            endPrompt.setText("Perfect!");
                        }


                    }
                    else {
                        switch (questionList[questionNo].getSelected()){
                            case 0:
                                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                                break;
                            case 1:
                                option1.setBackgroundColor(0x52FB9058);option2.setBackgroundColor(0xFFFB9058);
                                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                                break;
                            case 2:
                                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0x52FB9058);
                                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0xFFFB9058);
                                break;
                            case 3:
                                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                                option3.setBackgroundColor(0x52FB9058);option4.setBackgroundColor(0xFFFB9058);
                                break;
                            case 4:
                                option1.setBackgroundColor(0xFFFB9058);option2.setBackgroundColor(0xFFFB9058);
                                option3.setBackgroundColor(0xFFFB9058);option4.setBackgroundColor(0x52FB9058);
                                break;
                        }
                        questionSet();
                    }
                }
                break;
        }
    }
    private void questionSet(){
        boat.setImageResource(questionList[questionNo].getImage());
        option1.setText(questionList[questionNo].option1());
        option2.setText(questionList[questionNo].option2());
        option3.setText(questionList[questionNo].option3());
        option4.setText(questionList[questionNo].option4());
        NoHolder.setText(Integer.toString(questionNo+1));
    }
    private void checkAnswer(int selected){
        int rightAns = questionList[questionNo].rightAnswer();
        if (selected == rightAns){
            questionList[questionNo].setUserAns(true);
        }
        else {
            questionList[questionNo].setUserAns(false);
        }
        questionList[questionNo].setSelected(selected);
    }
}