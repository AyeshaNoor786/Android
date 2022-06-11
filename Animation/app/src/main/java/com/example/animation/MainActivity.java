package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTranslate,btnScale,btnRotate,btnAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnScale = findViewById(R.id.btnScale);
        btnRotate = findViewById(R.id.btnRotate);
        btnAlpha = findViewById(R.id.btnAlpha);


        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation mov = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                txtAnim.startAnimation(mov);         // start animation whenever we start it
                //txtAnim.setAnimation();         // set animation but start only after changes apply
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtAnim.startAnimation(rotate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txtAnim.startAnimation(Alpha);
            }
        });

    }
}