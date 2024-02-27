package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private EditText url, address, share;
    Button cam_btn,video_cam_btn;

    ImageView photo;
    static final int request_photo = 1;
    static final int request_video = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.website_edittext);
        address = findViewById(R.id.location_edittext);
        share = findViewById(R.id.share_edittext);

        cam_btn = findViewById(R.id.camera_button);
        video_cam_btn = findViewById(R.id.video_camera_button);
        cam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePictureIntent();
            }
        });
        video_cam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeVideoIntent();
            }
        });

    }


    private void takePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, request_photo);
        }
        else{
            Log.d("Implicit Intents", "can't handle this Cam");
        }
    }

    private void takeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, request_video);
        }
        else {
            Log.d("Implicit Intents", "can't handle this Video Cam");
        }
    }

    public void openWebsite(View view) {
        String url = this.url.getText().toString();
        Uri webPage = Uri.parse(url);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, webPage);
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        } else {
            Log.d("Implicit Intents", "Can't handle this");
        }
    }

    public void openLocation(View view) {
        String address = this.address.getText().toString();
        Uri mapsPage = Uri.parse("geo:0,0?q=" + address);
        Intent intent2 = new Intent(Intent.ACTION_VIEW, mapsPage);
        if (intent2.resolveActivity(getPackageManager()) != null) {
            startActivity(intent2);
        } else {
            Log.d("Implicit Intents", "can't handle this maps");
        }
    }

    public void shareText(View view) {
        String share = this.share.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share text with")
                .setText(share)
                .startChooser();
    }
}