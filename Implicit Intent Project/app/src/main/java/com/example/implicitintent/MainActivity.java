package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private EditText url, address, share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.website_edittext);
        address = findViewById(R.id.location_edittext);
        share = findViewById(R.id.share_edittext);
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