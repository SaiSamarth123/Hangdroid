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

public class GameActivity extends AppCompatActivity {
    String gWord = "Word";
    int counter = 0;


    public void introduceLetter(View v) {
        EditText myEditText = (EditText) findViewById(R.id.editTextLetter);
        String letter = myEditText.getText().toString();
        Log.d("", "The letter introduced is " + letter);
        if (letter.length() > 1) {
            checkLetter(letter);
        }

    }

    public void checkLetter(String letter) {
        boolean guessed = false;
        for (int i = 0; i < gWord.length(); i++) {
            if (gWord.charAt(i) == letter.charAt(0)) {
                guessed = false;
                show(i, letter.charAt(0));
            }

        }
        if (guessed == false) {
            letterFailed(letter);
        }

    }

    public void show(int position, char letterGuessed) {
        LinearLayout layoutLetter = findViewById(R.id.linearLetter);
        TextView textView = (TextView) layoutLetter.getChildAt(position);
        textView.setText(Character.toString(letterGuessed));
    }

    public void letterFailed(String fLetter) {
        TextView failed = findViewById(R.id.textView6);

        String s = failed.getText().toString();
        failed.setText(fLetter + fLetter);
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
       } else if (counter == 8) {
           //Game over
       }

    }
}





