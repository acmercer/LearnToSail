package com.example.learntosail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class WindDirection extends AppCompatActivity {
    private QuestionWD[] questionsWD = new QuestionWD[]{
            new QuestionWD(R.mipmap.ic_windmill_foreground,R.mipmap.ic_rubberduck_foreground,R.mipmap.ic_whoopie_foreground,R.mipmap.ic_windsock_foreground,4),
            new QuestionWD(R.mipmap.ic_beans_foreground,R.mipmap.ic_flag_foreground,R.mipmap.ic_handfan_foreground,R.mipmap.ic_beachball_foreground,2),
            new QuestionWD(R.mipmap.ic_deodorant_foreground,R.mipmap.ic_finger_foreground,R.mipmap.ic_compass_foreground,R.mipmap.ic_spintop_foreground,2),
            new QuestionWD(R.mipmap.ic_windindicator_foreground,R.mipmap.ic_airhorn_foreground,R.mipmap.ic_fan_foreground,R.mipmap.ic_mouse_foreground,1),
            new QuestionWD(R.mipmap.ic_paperclip_foreground,R.mipmap.ic_windchimes_foreground,R.mipmap.ic_app_foreground,R.mipmap.ic_weatherbook_foreground,3)
    };
    private ImageButton image1, image2, image3, image4, back, home;
    private ImageView wrong1, wrong2, wrong3, wrong4;
    private int correctAns, quesNo, mistakes;
    private CardView quesCard, resultCard;
    private TextView title, mistakesNo;
    private Button tryAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winddirection);
        quesNo = 0; mistakes = 0;
        image1 = findViewById(R.id.btnOption1);
        image2 = findViewById(R.id.btnOption2);
        image3 = findViewById(R.id.btnOption3);
        image4 = findViewById(R.id.btnOption4);
        image1.setOnClickListener(this::onClick);
        image2.setOnClickListener(this::onClick);
        image3.setOnClickListener(this::onClick);
        image4.setOnClickListener(this::onClick);
        wrong1 = findViewById(R.id.imgWrong1);
        wrong2 = findViewById(R.id.imgWrong2);
        wrong3 = findViewById(R.id.imgWrong3);
        wrong4 = findViewById(R.id.imgWrong4);
        quesCard = findViewById(R.id.cardQues);
        resultCard = findViewById(R.id.cardResults);
        title = findViewById(R.id.txtWindDirectionTitle);
        mistakesNo = findViewById(R.id.txtTotalMistakes);
        tryAgain = findViewById(R.id.btnTryAgain);
        tryAgain.setOnClickListener(v ->{
            recreate();
        });
        back = findViewById(R.id.btnWeatherBack);
        back.setOnClickListener(v ->{
            startActivity(new Intent(this, FirstActivity.class));
        });
        home = findViewById(R.id.btnWeatherHome);
        home.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeScreen.class));
        });
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOption1:
                checkAns(1);
                break;
            case R.id.btnOption2:
                checkAns(2);
                break;
            case R.id.btnOption3:
                checkAns(3);
                break;
            case R.id.btnOption4:
                checkAns(4);
                break;
        }
    }
    private void checkAns(int choice){
        correctAns = questionsWD[quesNo].getCorrectAns();
        if (choice == correctAns){
            quesNo++;
            if (quesNo<5){
                setQues();
            }
            else {
                quesCard.setVisibility(View.INVISIBLE); title.setVisibility(View.INVISIBLE);
                resultCard.setVisibility(View.VISIBLE);
                mistakesNo.setText((Integer.toString(mistakes)));
            }

        }
        else{
            mistakes++;
            switch (choice){
                case 1:
                    wrong1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    wrong2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    wrong3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    wrong4.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }
    private void setQues(){
        image1.setImageResource(questionsWD[quesNo].getImage1());
        image2.setImageResource(questionsWD[quesNo].getImage2());
        image3.setImageResource(questionsWD[quesNo].getImage3());
        image4.setImageResource(questionsWD[quesNo].getImage4());
        wrong1.setVisibility(View.INVISIBLE);
        wrong2.setVisibility(View.INVISIBLE);
        wrong3.setVisibility(View.INVISIBLE);
        wrong4.setVisibility(View.INVISIBLE);
    }
}