package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Alphabet_Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_images);

        Intent intent = getIntent();
        String key = intent.getStringExtra("Key");
        TextView textView;
        ImageView imageView, pic;

        imageView = (ImageView) findViewById(R.id.fimg);
        textView = findViewById(R.id.txt);
        pic = (ImageView) findViewById(R.id.simg);

        if(key.equals("A"))
        {
            imageView.setImageResource(R.drawable.a);
            textView.setText("APPLE");
            pic.setImageResource(R.drawable.apple);
        }
        else if(key.equals("B"))
        {
            imageView.setImageResource(R.drawable.b);
            textView.setText("BALL");
            pic.setImageResource(R.drawable.ball);
        }
        else if(key.equals("C"))
        {
            imageView.setImageResource(R.drawable.c);
            textView.setText("CAT");
            pic.setImageResource(R.drawable.cat);
        }
        else if(key.equals("D"))
        {
            imageView.setImageResource(R.drawable.d);
            textView.setText("DOLL");
            pic.setImageResource(R.drawable.doll);
        }
        else if(key.equals("E"))
        {
            imageView.setImageResource(R.drawable.e);
            textView.setText("EAGLE");
            pic.setImageResource(R.drawable.eagle);
        }
        else if(key.equals("F"))
        {
            imageView.setImageResource(R.drawable.f);
            textView.setText("FLOWER");
            pic.setImageResource(R.drawable.flo);
        }
        else if(key.equals("G"))
        {
            imageView.setImageResource(R.drawable.g);
            textView.setText("GUN");
            pic.setImageResource(R.drawable.gun);
        }
        else if(key.equals("H"))
        {
            imageView.setImageResource(R.drawable.h);
            textView.setText("HUT");
            pic.setImageResource(R.drawable.hut);
        }
        else if(key.equals("I"))
        {
            imageView.setImageResource(R.drawable.i);
            textView.setText("ICE CREAM");
            pic.setImageResource(R.drawable.ice_cream);
        }
        else if(key.equals("J"))
        {
            imageView.setImageResource(R.drawable.j);
            textView.setText("JUG");
            pic.setImageResource(R.drawable.jug);
        }
        else if(key.equals("K"))
        {
            imageView.setImageResource(R.drawable.k);
            textView.setText("KITE");
            pic.setImageResource(R.drawable.kite);
        }
        else if(key.equals("L"))
        {
            imageView.setImageResource(R.drawable.l);
            textView.setText("LION");
            pic.setImageResource(R.drawable.lion);
        }
        else if(key.equals("M"))
        {
            imageView.setImageResource(R.drawable.m);
            textView.setText("MANGO");
            pic.setImageResource(R.drawable.mango);
        }
        else if(key.equals("N"))
        {
            imageView.setImageResource(R.drawable.n);
            textView.setText("NATURE");
            pic.setImageResource(R.drawable.nature);
        }
        else if(key.equals("O"))
        {
            imageView.setImageResource(R.drawable.o);
            textView.setText("OWL");
            pic.setImageResource(R.drawable.owl);
        }
        else if(key.equals("P"))
        {
            imageView.setImageResource(R.drawable.p);
            textView.setText("PEN");
            pic.setImageResource(R.drawable.pen);
        }
        else if(key.equals("Q"))
        {
            imageView.setImageResource(R.drawable.q);
            textView.setText("QUEEN");
            pic.setImageResource(R.drawable.queen);
        }
        else if(key.equals("R"))
        {
            imageView.setImageResource(R.drawable.r);
            textView.setText("RABBIT");
            pic.setImageResource(R.drawable.rabbit);
        }
        else if(key.equals("S"))
        {
            imageView.setImageResource(R.drawable.s);
            textView.setText("STAR");
            pic.setImageResource(R.drawable.star);
        }
        else if(key.equals("T"))
        {
            imageView.setImageResource(R.drawable.t);
            textView.setText("TEA");
            pic.setImageResource(R.drawable.tea);
        }
        else if(key.equals("U"))
        {
            imageView.setImageResource(R.drawable.u);
            textView.setText("UMBRELLA");
            pic.setImageResource(R.drawable.umbrella);
        }
        else if(key.equals("V"))
        {
            imageView.setImageResource(R.drawable.v);
            textView.setText("VAN");
            pic.setImageResource(R.drawable.van);
        }
        else if(key.equals("W"))
        {
            imageView.setImageResource(R.drawable.w);
            textView.setText("WATERMELON");
            pic.setImageResource(R.drawable.watermelon);
        }
        else if(key.equals("X"))
        {
            imageView.setImageResource(R.drawable.x);
            textView.setText("X-RAY");
            pic.setImageResource(R.drawable.xray);
        }
        else if(key.equals("Y"))
        {
            imageView.setImageResource(R.drawable.y);
            textView.setText("YOGHURT");
            pic.setImageResource(R.drawable.yogurt);
        }
        else if(key.equals("Z"))
        {
            imageView.setImageResource(R.drawable.z);
            textView.setText("ZEBRA");
            pic.setImageResource(R.drawable.zebra);
        }
    }
}