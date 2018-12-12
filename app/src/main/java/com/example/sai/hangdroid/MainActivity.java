package com.example.sai.hangdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startSinglePlayerGame(new View(this));
    }
    public void startSinglePlayerGame(View v) {
        Intent myIntent = new Intent(this,GameActivity.class);
        startActivity(myIntent);
    }

}
