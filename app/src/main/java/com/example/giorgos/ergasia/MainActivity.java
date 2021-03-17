package com.example.giorgos.ergasia;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.Manifest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Κατα την οδήγηση η προσοχή πρέπει να είναι στον δρόμο και όχι στο κινητό !");

        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {}
        });


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void xartes(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.google.com")));

    }

    public void episkeves(View view) {

        startActivity(new Intent(this,venzinadika.class));
    }

    public void podilatodromoi(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/viewer?mid=1Mlm8sacYM7qXOeLsZHpOLi7I6AE&hl=en_US&ll=37.99167085910758%2C23.772372913281288&z=12")));


    }

    public void klisi(View view) {



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},123);
        } else {
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:166")));
        }
    }

    public void xronometro(View view){
        Intent intent = new Intent(this, xronometro.class);

        startActivity(intent);
    }

    public void info(View view){
        Intent intent = new Intent(this, Info.class);

        startActivity(intent);
    }
}
