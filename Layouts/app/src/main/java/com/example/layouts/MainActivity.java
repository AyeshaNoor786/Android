package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView one,two,three,four,five,six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.first);
        two=findViewById(R.id.second);
        three=findViewById(R.id.third);
        four=findViewById(R.id.fourth);
        five=findViewById(R.id.fifth);
        six=findViewById(R.id.sixth);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Allhumdullilah", Toast.LENGTH_SHORT).show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Assalam-o-Allaikum !", Toast.LENGTH_SHORT).show();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Android App Development", Toast.LENGTH_SHORT).show();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'll try my Best In Shaa Allah", Toast.LENGTH_SHORT).show();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Android Layouts", Toast.LENGTH_SHORT).show();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Allah Hafiz !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

//  there is another method for using onClickListener
//  to implement View.OnClickListener and override the method OnClick

//  Another Method (use in xml file)
//  android:onClick="first"