package com.example.simple_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<alphabets> arrAlpha = new ArrayList<>();
    RecyclerView recyclerView;
    recyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrAlpha.add(new alphabets("A","Apple",R.drawable.a));
        arrAlpha.add(new alphabets("B","Ball",R.drawable.b));
        arrAlpha.add(new alphabets("C","Cat",R.drawable.c));
        arrAlpha.add(new alphabets("D","Doll",R.drawable.d));
        arrAlpha.add(new alphabets("E","Eagle",R.drawable.e));
        arrAlpha.add(new alphabets("F","Flower",R.drawable.f));
        arrAlpha.add(new alphabets("G","Gun",R.drawable.g));
        arrAlpha.add(new alphabets("H","Hut",R.drawable.h));
        arrAlpha.add(new alphabets("I","Ice Cream",R.drawable.i));
        arrAlpha.add(new alphabets("J","Jug",R.drawable.j));
        arrAlpha.add(new alphabets("K","Kite",R.drawable.k));
        arrAlpha.add(new alphabets("L","Lion",R.drawable.l));
        arrAlpha.add(new alphabets("M","Mango",R.drawable.m));
        arrAlpha.add(new alphabets("N","Nature",R.drawable.n));
        arrAlpha.add(new alphabets("O","Owl",R.drawable.o));
        arrAlpha.add(new alphabets("P","Pen",R.drawable.p));
        arrAlpha.add(new alphabets("Q","Queen",R.drawable.q));
        arrAlpha.add(new alphabets("R","Rabbit",R.drawable.r));
        arrAlpha.add(new alphabets("S","Star",R.drawable.s));
        arrAlpha.add(new alphabets("T","Tea",R.drawable.t));
        arrAlpha.add(new alphabets("U","Umbrella",R.drawable.u));
        arrAlpha.add(new alphabets("V","Van",R.drawable.v));
        arrAlpha.add(new alphabets("W","Watermelon",R.drawable.w));
        arrAlpha.add(new alphabets("X","X-Ray",R.drawable.x));
        arrAlpha.add(new alphabets("Y","Yoghurt",R.drawable.y));
        arrAlpha.add(new alphabets("Z","Zebra",R.drawable.z));

        adapter = new recyclerAdapter(this,arrAlpha);
        recyclerView.setAdapter(adapter);
    }
}