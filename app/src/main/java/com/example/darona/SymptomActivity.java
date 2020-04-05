package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SymptomActivity extends AppCompatActivity {

    ImageView backButton;
    String[] questionData = {"For whom are you taking this test?"};
    String[] option1Data = {"For Yourself"};
    String[] option2Data = {"Parent"};
    String[] option3Data = {"Spouse"};
    String[] option4Data = {"Child"};
    String[] option5Data = {"Someone else"};


    TextView question;
    Button option1, option2, option3, option4, option5;
    int currentQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SymptomActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        option5 = findViewById(R.id.option5);
        setData();

    }

    void setData(){
        question.setText("Q1) " + questionData[currentQuestionNumber]);
        option1.setText(option1Data[currentQuestionNumber]);
        option2.setText(option2Data[currentQuestionNumber]);
        option3.setText(option3Data[currentQuestionNumber]);
        option4.setText(option4Data[currentQuestionNumber]);
        option5.setText(option5Data[currentQuestionNumber]);
    }
}
