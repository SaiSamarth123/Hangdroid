package com.example.sai.hangdroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class GameActivity extends AppCompatActivity {
    Intent intent = getIntent();
    private String gWord = intent.getExtras().getString("name");
    //private String gWord = "tree";
    private String hidden = "";
    int counter = 1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView answer = (TextView) findViewById(R.id.textView6);
        for (int i = 0; i < gWord.length(); i++) {
            hidden += "-";
        }
        answer.setText(hidden);
    }


    public void introduceLetter(View v) {
        System.out.println("Hi");
        EditText myEditText = (EditText) findViewById(R.id.editTextLetter);
        String letter = myEditText.getText().toString();
        letter = letter.toLowerCase();
        Log.d("", "The letter introduced is " + letter);
        if (letter.length() == 1) {
            checkLetter(letter);
        }
        //TextView answer = (TextView) findViewById(R.id.textView6);
        //answer.setText(letter);
        //editTextLayer.setText("Q");

    }

    public void checkLetter(String letter) {
        boolean guessed = false;
        System.out.println("Checking it");
        int counta = 0;
        String fin = "";
        for (int i = 0; i < gWord.length(); i++) {
            if (gWord.charAt(i) == letter.charAt(0)) {
                guessed = true;
                //show(i, letter.charAt(0));
                fin += letter.charAt(0);
            } else {
                fin += hidden.charAt(i);
            }
        }

        hidden = fin;
        TextView answer = (TextView) findViewById(R.id.textView6);
        answer.setText(hidden);
        if (guessed == false) {
            letterFailed(letter);
        }
    }

    public void show(int position, char letterGuessed) {
        int counter = 0;
        String fin = "";
        for (int i = 0; i < gWord.length(); i++) {
            if (i != position) {
                fin += hidden.charAt(i);
            } else {
                fin += letterGuessed;
            }
        }
        hidden = fin;
        TextView answer = (TextView) findViewById(R.id.textView6);
        answer.setText(hidden);
        //LinearLayout layoutLetter = findViewById(R.id.linearLetter);
        //TextView textView = (TextView) layoutLetter.getChildAt(position);
        //textView.setText(Character.toString(letterGuessed));
    }

    public void letterFailed(String fLetter) {
        TextView failed = (TextView) findViewById(R.id.textView);
        String s = failed.getText().toString();
        String s1 = s + fLetter + " ";
        failed.setText(s1);
        counter++;
        ImageView imageView = (findViewById(R.id.imageView5));
       if (counter == 1) {
            imageView.setImageResource(R.drawable.hang0);
       } else if (counter == 2) {
           imageView.setImageResource(R.drawable.hang1);
       } else if (counter == 3) {
           imageView.setImageResource(R.drawable.hang2);
       } else if (counter  == 4) {
           imageView.setImageResource(R.drawable.hang3);
       } else if (counter == 5) {
           imageView.setImageResource(R.drawable.hang4);
       } else  if (counter == 6) {
           imageView.setImageResource(R.drawable.hang5);
       } else if (counter == 7) {
           imageView.setImageResource(R.drawable.hang6);
           TextView answer = (TextView) findViewById(R.id.textView6);
           answer.setText("LOSS!");
       }

    }
}





