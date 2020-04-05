package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FAQActivity extends AppCompatActivity {

    LinearLayout spreadFAQs, symptomFAQs, aboutFAQs;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        spreadFAQs = findViewById(R.id.spread_faq);
        symptomFAQs = findViewById(R.id.symptoms_faq);
        aboutFAQs = findViewById(R.id.about_faq);
        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAQActivity.this, Dashboard.class);
                startActivity(intent);

            }
        });

        spreadFAQs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppData.faqCategory = 3;
                changeToFAQDetails();
            }
        });

        aboutFAQs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppData.faqCategory = 1;
                changeToFAQDetails();
            }
        });

        symptomFAQs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppData.faqCategory = 2;
                changeToFAQDetails();
            }
        });


    }
    void changeToFAQDetails(){
        Intent intent = new Intent(FAQActivity.this, FAQDataActivity.class);
        startActivity(intent);
    }
}
