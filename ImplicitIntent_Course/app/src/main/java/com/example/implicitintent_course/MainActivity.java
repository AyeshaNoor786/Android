package com.example.implicitintent_course;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText = findViewById(R.id.Website_edittext);
        mLocationEditText = findViewById(R.id.location_edittext);
        mShareTextEditText = findViewById(R.id.share_edittext);
    }

    public void openWebsite(View view) {
        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);

        // Find an activity to hand the intent and start that activity.
        //if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        //}else{
          //  Log.d("ImplicitIntent","Can't handle this");
        //}
    }

    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW,addressUri);

        // Find an activity to hand the intent and start that activity.
        //if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        //}else{
          //  Log.d("ImplicitIntent","Can't handle this");
        //}
    }

    public void shareText(View view) {
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.Share_Text_Title)
                .setText(txt)
                .startChooser();
    }

    public void openCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // Find an activity to hand the intent and start that activity.
        //if(intent.resolveActivity(getPackageManager())!=null){
        startActivity(intent);
        //}else{
        //  Log.d("ImplicitIntent","Can't handle this");
        //}
    }
}