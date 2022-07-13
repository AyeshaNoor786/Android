package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();;
    private EditText MessageEditText;

    public static final int TEXT_REQUEST = 1;

    private TextView replyHeader;
    private TextView replyMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        MessageEditText = findViewById(R.id.edittext_main);

        replyHeader = findViewById(R.id.text_reply);
        replyMessage = findViewById(R.id.text_message_reply);

        if(savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible){
                replyHeader.setVisibility(View.VISIBLE);
                replyMessage.setText(savedInstanceState.getString("reply_text"));
                replyMessage.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }


    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(replyMessage.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible",true);
            outState.putString("reply_text",replyMessage.getText().toString());
        }
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    public void LaunchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button Clicked!");
        Intent intent = new Intent(this,SecondActivity.class);
        String message = MessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
//        startActivity(intent);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==TEXT_REQUEST){
            if(resultCode==RESULT_OK){
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                replyHeader.setVisibility(View.VISIBLE);
                replyMessage.setText(reply);
                replyMessage.setVisibility(View.VISIBLE);
            }
        }
    }
}