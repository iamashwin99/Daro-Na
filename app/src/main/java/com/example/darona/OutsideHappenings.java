package com.example.darona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class OutsideHappenings extends AppCompatActivity {

    ImageView backButton;
    WebView newsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outside_happenings);


        newsView = findViewById(R.id.news_view);
        newsView.getSettings().setJavaScriptEnabled(true);
        newsView.getSettings().setAllowFileAccess(true);
        newsView.loadUrl("http://lite.cnn.com/en");

        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OutsideHappenings.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }
}
