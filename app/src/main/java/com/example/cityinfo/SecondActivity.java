package com.example.cityinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView header_background, second_back_arrow;
    TextView second_title,  second_rating_number, about, about_text, venue_type, venue_type_text;
    RatingBar second_ratingbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        header_background = findViewById(R.id.header_background);
        second_back_arrow = findViewById(R.id.second_back_arrow);
        second_title = findViewById(R.id.second_title);
        second_rating_number = findViewById(R.id.second_rating_number);
        about = findViewById(R.id.about);
        about_text = findViewById(R.id.about_text);
        venue_type = findViewById(R.id.venue_type);
        venue_type_text = findViewById(R.id.venue_type_text);
        second_ratingbar = findViewById(R.id.second_ratingbar);

        second_back_arrow.setOnClickListener(view -> {
            Intent intent = new Intent( SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }
}