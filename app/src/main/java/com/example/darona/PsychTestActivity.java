package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PsychTestActivity extends AppCompatActivity {

    TextView question;
    ImageView backButton;
    Button option1, option2, option3, option4;

    String[] questions = {
            "I feel tense or wound up",
            "I can laugh and see the funny side of things",
            "I get a sort of frightened feeling as if something awful is about to happen:"
    };
    String[] option1Data = {
            "Most of the time",
            "As much as I always could",
            "Very definitely and quite badly"
    };
    String[] option2Data = {
            "A lot of the time",
            "Not quite so much now",
            "Yes, but not too badly"

    };
    String[] option3Data = {
            "From time to time, occasionally",
            "Definitely not so much now",
            "A little, but it doesn't worry me"
    };
    String[] option4Data = {
            "Not at all",
            "Not at all",
            "Not at all"
    };
    int currentQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psych_test);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        backButton = findViewById(R.id.back_button);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PsychTestActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        setData();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQuestionNumber==2){
                    Intent intent = new Intent(PsychTestActivity.this, PsychTestActivityResult.class);
                    startActivity(intent);
                }
                else{
                    currentQuestionNumber++ ;
                    setData();
                }
            }
        };
        option1.setOnClickListener(listener);
        option2.setOnClickListener(listener);
        option3.setOnClickListener(listener);
        option4.setOnClickListener(listener);

    }

    void setData(){
        if(currentQuestionNumber != 2) {
            question.setText("Q" + (currentQuestionNumber + 1) + ") " + questions[currentQuestionNumber]);
        }
        else{
            question.setText("Q14) " + questions[currentQuestionNumber]);
        }
        option1.setText(option1Data[currentQuestionNumber]);
        option2.setText(option2Data[currentQuestionNumber]);
        option3.setText(option3Data[currentQuestionNumber]);
        option4.setText(option4Data[currentQuestionNumber]);
    }
}
