package com.example.giorgos.ergasia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class venzinadika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venzinadika);
    }

    public void episk(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu3W_bluYZiCTFckygQ83exOv_AkYXDgs")));


    }

    public void venz(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.gr/maps/search/gas+stations/")));


    }

    }

