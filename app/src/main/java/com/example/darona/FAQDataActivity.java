package com.example.darona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FAQDataActivity extends AppCompatActivity {

    LinearLayout ll1, ll2, ll3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqdata);
        ll1 = findViewById(R.id.faq_1);
        ll2 = findViewById(R.id.faq_2);
        ll3 = findViewById(R.id.faq_3);

        if(AppData.faqCategory == 1){
            ll1.setVisibility(View.VISIBLE);
        }
        else{
            if(AppData.faqCategory==2){
                ll2.setVisibility(View.VISIBLE);
            }
            else{
                ll3.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onBackPressed() {
        ll1.setVisibility(View.GONE);
        ll2.setVisibility(View.GONE);
        ll3.setVisibility(View.GONE);
        super.onBackPressed();
    }
}
