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

public class ThirdActivity extends AppCompatActivity {

    ImageView header_background2, third_back_arrow;
    TextView third_title,  third_rating_number, about2, about_text2, venue_type2, venue_type_text2;
    RatingBar third_ratingbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        header_background2 = findViewById(R.id.header_background2);
        third_back_arrow = findViewById(R.id.third_back_arrow);
        third_title = findViewById(R.id.third_title);
        third_rating_number = findViewById(R.id.third_rating_number);
        about2 = findViewById(R.id.about2);
        about_text2 = findViewById(R.id.about_text2);
        venue_type2 = findViewById(R.id.venue_type2);
        venue_type_text2 = findViewById(R.id.venue_type_text2);
        third_ratingbar = findViewById(R.id.third_ratingbar);

        third_back_arrow.setOnClickListener(view -> {
            Intent intent = new Intent( ThirdActivity.this, MainActivity.class);
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