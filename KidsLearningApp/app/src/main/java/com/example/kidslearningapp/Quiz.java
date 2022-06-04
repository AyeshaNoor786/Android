package com.example.kidslearningapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Quiz extends AppCompatActivity {

    ImageView ivShowImage;
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> techList = new ArrayList<>();
    int index;
    TextView tvResult;
    Button btn1, btn2, btn3, btn4;
    TextView tvPoints;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ivShowImage = findViewById(R.id.ivShowImage);
        tvResult = findViewById(R.id.tvResult);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvPoints = findViewById(R.id.tvPoints);

        index = 0;
        techList.add("Apple");
        techList.add("Cat");
        techList.add("Doll");
        techList.add("Eagle");
        techList.add("Flower");
        techList.add("Gun");
        techList.add("Hut");
        techList.add("Ice_Cream");
        techList.add("Lion");
        techList.add("Mango");
        techList.add("Pen");
        techList.add("Rabbit");
        techList.add("Star");
        techList.add("Umbrella");
        techList.add("Watermelon");
        techList.add("Zebra");

        map.put(techList.get(0), R.drawable.apple);
        map.put(techList.get(1), R.drawable.cat);
        map.put(techList.get(2), R.drawable.doll);
        map.put(techList.get(3), R.drawable.eagle);
        map.put(techList.get(4), R.drawable.flo);
        map.put(techList.get(5), R.drawable.gun);
        map.put(techList.get(8), R.drawable.hut);
        map.put(techList.get(6), R.drawable.ice_cream);
        map.put(techList.get(7), R.drawable.lion);
        map.put(techList.get(9), R.drawable.mango);
        map.put(techList.get(10), R.drawable.pen);
        map.put(techList.get(11), R.drawable.rabbit);
        map.put(techList.get(12), R.drawable.star);
        map.put(techList.get(13), R.drawable.umbrella);
        map.put(techList.get(14), R.drawable.watermelon);
        map.put(techList.get(15), R.drawable.zebra);

        // Shuffle techList so that each time we open the app it starts with
        // a random question
        Collections.shuffle(techList);

        // Initialize points to 0
        points = 0;
        // Call startGame() method that is responsible for starting the quiz.
        startGame();
    }

    private void startGame() {
        // Set the TextView for points.
        tvPoints.setText(points + " / " + techList.size());
        // To generate a question, call generateQuestions() method and pass
        // index as parameter.
        generateQuestions(index);
    }

    public void onFinish() {
        // Increment index by 1 so that the next question can be presented
        // automatically when the user is unable to select his/her answer.
        index++;
        // When timer is finished check if all questions are being asked.
        if (index > techList.size() - 1){
            // If true, hide the ImageView and Buttons.
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);

            Intent intent = new Intent(Quiz.this, GameOver.class);
            intent.putExtra("points", points);
            startActivity(intent);

            finish();
        } else {

            startGame();
        }
    }

    private void generateQuestions(int index) {
        ArrayList<String> techListTemp = (ArrayList<String>) techList.clone();

        String correctAnswer = techList.get(index);

        techListTemp.remove(correctAnswer);
        Collections.shuffle(techListTemp);

        ArrayList<String> newList = new ArrayList<>();

        newList.add(techListTemp.get(0));
        newList.add(techListTemp.get(1));
        newList.add(techListTemp.get(2));

        newList.add(correctAnswer);

        Collections.shuffle(newList);

        btn1.setText(newList.get(0));
        btn2.setText(newList.get(1));
        btn3.setText(newList.get(2));
        btn4.setText(newList.get(3));

        ivShowImage.setImageResource(map.get(techList.get(index)));
    }

    public void nextQuestion(View view) {
        btn1.setBackgroundColor(Color.parseColor("#2196f3"));
        btn2.setBackgroundColor(Color.parseColor("#2196f3"));
        btn3.setBackgroundColor(Color.parseColor("#2196f3"));
        btn4.setBackgroundColor(Color.parseColor("#2196f3"));

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        index++;

        if (index > techList.size() - 1){
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);

            Intent intent = new Intent(Quiz.this, GameOver.class);
            intent.putExtra("points", points);
            startActivity(intent);

            finish();
        } else {

            startGame();
        }
    }

    public void answerSelected(View view) {
        view.setBackgroundColor(Color.parseColor("#17243e"));

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        String answer = ((Button) view).getText().toString().trim();

        String correctAnswer = techList.get(index);

        if(answer.equals(correctAnswer)){
            points++;
            tvPoints.setText(points + " / " + techList.size());
            tvResult.setText("Correct");
        } else {

            tvResult.setText("Wrong");
        }
    }
}