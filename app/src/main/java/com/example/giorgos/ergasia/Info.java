package com.example.giorgos.ergasia;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Η εφαρμογή δημιουργήθηκε απο τους: Γκουβερο Ιωάννη, Παναγιωτοπούλου Αγγελική, Φάσσα Γεώργιο");

        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


    }
