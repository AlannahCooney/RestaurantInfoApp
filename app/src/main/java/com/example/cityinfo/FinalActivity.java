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

public class FinalActivity extends AppCompatActivity {

    ImageView header_background5, final_back_arrow;
    TextView final_title,  final_rating_number, about5, about_text5, venue_type5, venue_type_text5;
    RatingBar final_ratingbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        header_background5 = findViewById(R.id.header_background5);
        final_back_arrow = findViewById(R.id.final_back_arrow);
        final_title = findViewById(R.id.final_title);
        final_rating_number = findViewById(R.id.final_rating_number);
        about5 = findViewById(R.id.about5);
        about_text5 = findViewById(R.id.about_text5);
        venue_type5 = findViewById(R.id.venue_type5);
        venue_type_text5 = findViewById(R.id.venue_type_text5);
        final_ratingbar = findViewById(R.id.final_ratingbar);

        final_back_arrow.setOnClickListener(view -> {
            Intent intent = new Intent( FinalActivity.this, MainActivity.class);
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