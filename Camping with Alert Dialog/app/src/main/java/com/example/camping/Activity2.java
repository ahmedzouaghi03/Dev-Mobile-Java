package com.example.camping;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //this part for the alert dialog
        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);
        img6 = findViewById(R.id.imageView6);
        img7 = findViewById(R.id.imageView7);
        img8 = findViewById(R.id.imageView8);
        builder = new AlertDialog.Builder(this);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c6);

                builder.setTitle("Camping Image").
                        setMessage("Camping in the forest").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                        setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c8);

                builder.setTitle("Camping Image").
                        setMessage("Camping in front of the sea").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c2);

                builder.setTitle("Camping Image").
                        setMessage("Camping in the Sahara").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c3);

                builder.setTitle("Camping Image").
                        setMessage("Camping in front of the river").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c1);

                builder.setTitle("Camping Image").
                        setMessage("Couples camping").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c5);

                builder.setTitle("Camping Image").
                        setMessage("Camping on the mountains").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c7);

                builder.setTitle("Camping Image").
                            setMessage("Night forests camping").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this 3 lines for the image import
                View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);
                ImageView dialogImageView = dialogView.findViewById(R.id.imageView9);
                dialogImageView.setImageResource(R.drawable.c4);

                builder.setTitle("Camping Image").
                        setMessage("Out tents").
                        setCancelable(true).
                        //this line for displaying the image inside the alert view
                                setView(dialogView).
                        setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show()
                ;
            }
        });


    }

    public void close(View view) {
        finish();
    }

    public void previousScreen(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void scale(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(R.layout.image_display);
    }


}