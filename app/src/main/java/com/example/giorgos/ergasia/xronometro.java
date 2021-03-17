package com.example.giorgos.ergasia;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class xronometro extends AppCompatActivity {

    private Button startButton;
    private Button pauseButton;
    private Button reset;

    private TextView timerValue;

    private long startTime = 0L;

    private Handler customHandler = new Handler();

    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xronometro);

        timerValue = (TextView) findViewById(R.id.timerValue);

        startButton = (Button) findViewById(R.id.button6);

        startButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startTime = SystemClock.uptimeMillis();
                customHandler.postDelayed(updateTimerThread, 0);



            }
        });

        pauseButton = (Button) findViewById(R.id.button7);

        pauseButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                timeSwapBuff += timeInMilliseconds;
                customHandler.removeCallbacks(updateTimerThread);

            }
        });

        reset = (Button) findViewById(R.id.button8);

        reset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                customHandler.postDelayed(updateTimerThread, 2000);
                timeSwapBuff = 0L;
                customHandler.removeCallbacks(updateTimerThread);
                timerValue.setText(0 + ":" + 0 + ":" + String.format("%02d", 0));




            }
        });

    }


    private Runnable updateTimerThread = new Runnable() {

        public void run() {


                timeInMilliseconds = SystemClock.uptimeMillis() - startTime;

                updatedTime = timeSwapBuff + timeInMilliseconds;

                int secs = (int) (updatedTime / 1000);
                int mins = secs / 60;
                int hours = mins / 60;
                secs = secs % 60;
                timerValue.setText(hours + ":" + +mins + ":" + String.format("%02d", secs));
                customHandler.postDelayed(this, 0);


        }

    };


}
