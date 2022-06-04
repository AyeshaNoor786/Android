package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Alphabets extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        Intent intent = new Intent(Alphabets.this,Alphabet_Images.class);

        textView = findViewById(R.id.A);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","A");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.B);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","B");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.C);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","C");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.D);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","D");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.E);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","E");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.F);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","F");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.G);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","G");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.H);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","H");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.I);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","I");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.J);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","J");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.K);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","K");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.L);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","L");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.M);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","M");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.N);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","N");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.O);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","O");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.P);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","P");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.Q);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","Q");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.R);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","R");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.S);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","S");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.T);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","T");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.U);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","U");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.V);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","V");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.W);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","W");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.X);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","X");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.Y);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","Y");
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.Z);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Key","Z");
                startActivity(intent);
            }
        });
    }
}