package com.example.sai.hangdroid;
//done
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //addData();
        //startSinglePlayerGame(new View(this));
    }
    public void animals(View v) {
        //group 1, animals
        Intent myIntent = new Intent(this,GameActivity.class);

        //MyDBHandler dbHandler = new MyDBHandler(this, null,null,1);
        //Words words = dbHandler.findHandler(1);
        //String[] wordy = words.wordArray();
        Words words = new Words("bull,calf,cat,chicken,cow,donkey,duck," +
                "goat,goose,hen,horse,lamb,pig,rooster," +
                "sheep,turkey,snake,crab,lion,puma", 1);
        String wood = "bull,calf,cat,chicken,cow,donkey,duck," +
                "goat,goose,hen,horse,lamb,pig,rooster," +
                "sheep,turkey,snake,crab,lion,puma";

        String[] wordy = wood.split(",");
        int thing = (int) (Math.random() * ((19 - 0) + 1)) + 0;
        String fin = wordy[thing];
        //String fin = "pineapple";
        Bundle ez = new Bundle();
        ez.putString("word", fin);
        myIntent.putExtras(ez);

       // change(fin);
        startActivity(myIntent);
    }
    public void food(View v) {
        //group 1, animals
        Intent myIntent = new Intent(this,GameActivity.class);

        //MyDBHandler dbHandler = new MyDBHandler(this, null,null,1);
        //Words words = dbHandler.findHandler(2);
        //String[] wordy = words.wordArray();
        Words words = new Words("bagel,bread,cereal,cheese,croissant,egg,fish," +
                "ketchup,sushi,noodles,shrimp," +
                "pasta,peanuts,pizza,rice,roll,salad,sandwich,shrimp,toast", 2);
        String[] wordy = words.wordArray();
        int thing = (int) (Math.random() * ((19 - 0) + 1)) + 0;
        String fin = wordy[thing];
        //myIntent.putExtra("word",fin);
       // change(fin);
        startActivity(myIntent);
    }
    public void sports(View v) {
        //group 1, animals
        Intent myIntent = new Intent(this,GameActivity.class);

        //MyDBHandler dbHandler = new MyDBHandler(this, null,null,1);
        //Words words = dbHandler.findHandler(3);
        //String[] wordy = words.wordArray();
        Words words = new Words("athletics,baseball,basketball,bowling,cycling,football," +
                "golf,gymnastics," +
                "handball,hockey,jogging,polo,rugby,skiing,soccer,softball,squash,swimming," +
                "tennis,volleyball", 3);
        String[] wordy = words.wordArray();
        int thing = (int) (Math.random() * ((19 - 0) + 1)) + 0;
        String fin = wordy[thing];
        //myIntent.putExtra("word",fin);
       // change(fin);
        startActivity(myIntent);
    }
    public void addData() {
        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);
        //animals
        int group = 1;
        String wordlist = "bull,calf,cat,chicken,cow,donkey,duck," +
                "goat,goose,hen,horse,lamb,pig,rooster," +
                "sheep,turkey,snake,crab,lion,puma";
        Words words = new Words(wordlist, group);
        dbHandler.addHandler(words);
        //this is group 1 set in done
        //food
        group = 2;
        wordlist = "bagel,bread,cereal,cheese,croissant,egg,fish,ketchup,sushi,noodles,shrimp," +
                "pasta,peanuts,pizza,rice,roll,salad,sandwich,shrimp,toast";
        words = new Words(wordlist, group);
        dbHandler.addHandler(words);
        //group 2 Done
        //sports
        group = 3;
        wordlist = "athletics,baseball,basketball,bowling,cycling,football,golf,gymnastics," +
                "handball,hockey,jogging,polo,rugby,skiing,soccer,softball,squash,swimming," +
                "tennis,volleyball";
        words = new Words(wordlist, group);
        dbHandler.addHandler(words);
    }
}

