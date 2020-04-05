package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ActivityCenterActivity extends AppCompatActivity {

    ImageView backButton;
    LinearLayout musicTherapy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_activity);

        backButton = findViewById(R.id.back_button);
        musicTherapy = findViewById(R.id.music_therapy_window);


        musicTherapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCenterActivity.this, SpotifyActivity.class);
                startActivity(intent);
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCenterActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });





    }
}
