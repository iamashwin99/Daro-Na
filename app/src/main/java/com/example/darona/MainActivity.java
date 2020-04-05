package com.example.darona;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button letsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letsGo = findViewById(R.id.letsgetgoing);
        letsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                String anxScore = settings.getString("anxiety", "-1000");
                String depScore = settings.getString("depression", "-1000");
                if (!depScore.equals("-1000")) {
                    Intent intent = new Intent(MainActivity.this, PsychTestActivity.class);
                    startActivity(intent);
                } else {
                    AppData.depressionScore = Integer.valueOf(depScore);
                    AppData.anxietyScore = Integer.valueOf(anxScore);
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);
                }
            }
        });

    }
}
