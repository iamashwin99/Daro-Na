package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    LinearLayout activityCenter, outsideHappenings, botheredUser, coronaFAQs, symptomCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        activityCenter = findViewById(R.id.activity_center);
        outsideHappenings = findViewById(R.id.happening_outside);
        botheredUser = findViewById(R.id.bothered_user);
        coronaFAQs = findViewById(R.id.corona_faq);
        symptomCheck = findViewById(R.id.psych_test);

        activityCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, ActivityCenterActivity.class);
                startActivity(intent);
            }
        });

        outsideHappenings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, OutsideHappenings.class);
                startActivity(intent);
            }
        });

        symptomCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, SymptomActivity.class);
                startActivity(intent);
            }
        });

        coronaFAQs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, FAQActivity.class);
                startActivity(intent);
            }
        });

        botheredUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Dashboard.this, PsychTestActivity.class);
                startActivity(intent);
            }
        });

    }
}
