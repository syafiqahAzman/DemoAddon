package com.myapplicationdev.android.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);

        //This code is to place an Image file from
        //res folder
        ///iv.setImageResource(R.mipmap.ic_launcher);

        //This code is to place image from the internet
        //Don't forget to put internet permission in
        //Manifest
        //Don't forget to put the implementation in gradle
        String imageURL = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageURL).into(iv);


    }
}