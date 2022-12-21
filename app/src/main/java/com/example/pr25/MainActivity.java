package com.example.pr25;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

    final String LOG_TAG = "myLogs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class));
    }

    public void onClickStop(View v) {
        stopService(new Intent(this, MyService.class));
    }

    public void startNewActivity (View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}