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

public class FourthActivity extends AppCompatActivity {

    ImageView header_background3, fourth_back_arrow;
    TextView fourth_title,  fourth_rating_number, about3, about_text3, venue_type3, venue_type_text3;
    RatingBar fourth_ratingbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        header_background3 = findViewById(R.id.header_background3);
        fourth_back_arrow = findViewById(R.id.fourth_back_arrow);
        fourth_title = findViewById(R.id.fourth_title);
        fourth_rating_number = findViewById(R.id.fourth_rating_number);
        about3 = findViewById(R.id.about3);
        about_text3 = findViewById(R.id.about_text3);
        venue_type3 = findViewById(R.id.venue_type3);
        venue_type_text3 = findViewById(R.id.venue_type_text3);
        fourth_ratingbar = findViewById(R.id.fourth_ratingbar);

        fourth_back_arrow.setOnClickListener(view -> {
            Intent intent = new Intent( FourthActivity.this, MainActivity.class);
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