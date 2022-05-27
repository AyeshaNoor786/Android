package com.example.tictactoegame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    TextView headertext;

    int Player_o = 0;
    int Player_x = 1;

    int active_player = Player_o;

    int[] filled_pos = {-1, -1, -1, -1, -1, -1, -1, -1, -1};

    boolean isGameActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headertext = findViewById(R.id.header_text);
        headertext.setText("Player O Turn !");

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        btn0.setOnClickListener((View.OnClickListener) this);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {

        if (!isGameActive)
            return;

        Button clickbtn = findViewById(view.getId());
        int clicktag = Integer.parseInt(view.getTag().toString());

        if (filled_pos[clicktag] != -1) {
            return;
        }

        filled_pos[clicktag] = active_player;

        if (active_player == Player_o) {
            clickbtn.setText("O");
            clickbtn.setBackground(getDrawable(android.R.color.holo_blue_light));
            active_player = Player_x;
            headertext.setText("Player X turn!");
        } else {
            clickbtn.setText("X");
            clickbtn.setBackground(getDrawable(android.R.color.holo_orange_light));
            active_player = Player_o;
            headertext.setText("Player O turn!");
        }

        checkForWin();

    }

    private void checkForWin() {
        int[][] winning_pos = {{0, 1, 2}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {3, 4, 5}, {6, 7, 8}, {0, 4, 8}, {2, 4, 6}};
        for (int i = 0; i < 8; i++) {
            int val0 = winning_pos[i][0];
            int val1 = winning_pos[i][1];
            int val2 = winning_pos[i][2];

            if (filled_pos[val0] == filled_pos[val1] && filled_pos[val1] == filled_pos[val2]) {
                if (filled_pos[val0] != -1) {
                    // Winner

                    isGameActive = false;

                    if (filled_pos[val0] == Player_o) {
                        showDialog("Player O is Winner");
                    } else {
                        showDialog("Player X is Winner");
                    }
                }
            }
        }
        int count =0;
        for(int f=0;f<8;f++)
        {
            if(filled_pos[f]!=-1) {
                count++;
            }
        }
        if(count==8)
        {
            showDialog("Drawn !");
        }
    }


    private void showDialog(String winnerText) {
        new AlertDialog.Builder(this)
                .setTitle(winnerText)
                .setPositiveButton("Restart game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        restartGame();
                    }
                })
                .show();
    }

    private void restartGame() {
        active_player = Player_o;
        headertext.setText("Player O Turn !");
        filled_pos = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1};
        btn0.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn0.setBackground(getDrawable(android.R.color.darker_gray));
        btn1.setBackground(getDrawable(android.R.color.darker_gray));
        btn2.setBackground(getDrawable(android.R.color.darker_gray));
        btn3.setBackground(getDrawable(android.R.color.darker_gray));
        btn4.setBackground(getDrawable(android.R.color.darker_gray));
        btn5.setBackground(getDrawable(android.R.color.darker_gray));
        btn6.setBackground(getDrawable(android.R.color.darker_gray));
        btn7.setBackground(getDrawable(android.R.color.darker_gray));
        btn8.setBackground(getDrawable(android.R.color.darker_gray));
        isGameActive = true;
    }
}

