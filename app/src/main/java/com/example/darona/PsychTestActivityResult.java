package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PsychTestActivityResult extends AppCompatActivity {
    ImageView activitiesLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psych_test_result);
        activitiesLink = findViewById(R.id.activities_link);
        activitiesLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PsychTestActivityResult.this, ActivityCenterActivity.class);
                startActivity(intent);
            }
        });
    }
}
