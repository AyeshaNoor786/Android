package com.example.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

//    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* lottie = findViewById(R.id.lottie);
        lottie.setAnimation(R.raw.lottie);
        lottie.playAnimation();
        lottie.loop(true); */
    }
}