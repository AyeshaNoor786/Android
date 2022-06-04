package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    TextView tvPoints, tvPersonalBest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        int points = getIntent().getExtras().getInt("points");
        // Get the handles of the TextViews for points and personal best
        tvPoints = findViewById(R.id.tvPoints);
        tvPersonalBest = findViewById(R.id.tvPersonalBest);
        // Set tvPoints with the value of points
        tvPoints.setText("" + points);
    }
    public void restart(View view) {
        // Create an Intent object to launch StartGame Activity
        Intent intent = new Intent(GameOver.this, MainActivity.class);
        startActivity(intent);
        // Finish GameOver Activity
        finish();
    }

    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}