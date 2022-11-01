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

public class FifthActivity extends AppCompatActivity {

    ImageView header_background4, fifth_back_arrow;
    TextView fifth_title,  fifth_rating_number, about4, about_text4, venue_type4, venue_type_text4;
    RatingBar fifth_ratingbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        header_background4 = findViewById(R.id.header_background4);
        fifth_back_arrow = findViewById(R.id.fifth_back_arrow);
        fifth_title = findViewById(R.id.fifth_title);
        fifth_rating_number = findViewById(R.id.fifth_rating_number);
        about4 = findViewById(R.id.about4);
        about_text4 = findViewById(R.id.about_text4);
        venue_type4 = findViewById(R.id.venue_type4);
        venue_type_text4 = findViewById(R.id.venue_type_text4);
        fifth_ratingbar = findViewById(R.id.fifth_ratingbar);

        fifth_back_arrow.setOnClickListener(view -> {
            Intent intent = new Intent( FifthActivity.this, MainActivity.class);
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