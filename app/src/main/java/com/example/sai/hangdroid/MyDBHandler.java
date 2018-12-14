package com.example.sai.hangdroid;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {
    ///info on the database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "WordDB.db";
    public static final String TABLE_NAME = "Sections";
    public static final String COLUMN_WORDS = "Words";
    public static final String COLUMN_GROUP = "Group1";
    //initializing of the database
    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_WORDS +
                " INTEGER PRIMARY KEY," + COLUMN_GROUP + " TEXT)";

        db.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    public String loadHandler() {
        String query = "Select * FROM " + TABLE_NAME;
        String result = "";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            result += String.valueOf(result_0) + " " + result_1 +
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }
    //adds a term, using the Words class
    public void addHandler(Words wordy) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_WORDS, wordy.getWords());
        values.put(COLUMN_GROUP, wordy.getGroup());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    //finds the record by searching for the group
    public Words findHandler(int grouper) {
        //SQL LINE DOESNT WORK, NEAR GROUP
        String g = String.valueOf(grouper);
        String query = "Select * FROM " + TABLE_NAME + " WHERE " + COLUMN_GROUP + "=" + g;
        //String query = "Select * FROM Sections WHERE RowNum = 1";
        Words words1 = new Words("bull,calf,cat,chicken,cow,donkey,duck," +
                "goat,goose,hen,horse,lamb,pig,rooster," +
                "sheep,turkey,snake,crab,lion,puma", 1);
        Words words2 = new Words("bagel,bread,cereal,cheese,croissant,egg,fish," +
                "ketchup,sushi,noodles,shrimp," +
                "pasta,peanuts,pizza,rice,roll,salad,sandwich,shrimp,toast", 2);
        Words words3 = new Words("athletics,baseball,basketball,bowling,cycling,football," +
                "golf,gymnastics," +
                "handball,hockey,jogging,polo,rugby,skiing,soccer,softball,squash,swimming," +
                "tennis,volleyball", 3);
        if (grouper == words1.getGroup()) {
            return words1;
        } else if (grouper == words2.getGroup()) {
            return words2;
        } else if (grouper == words3.getGroup()) {
            return words3;
        }



        //SQLiteDatabase db = this.getWritableDatabase();
        //SQLiteDatabase db = this.getReadableDatabase();


        //Cursor cursor = db.rawQuery(query, null);
        /*Words word = new Words();
        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            word.setGroup(Integer.parseInt(cursor.getString(0)));
            word.setWords(cursor.getString(1));
        } else {
            word = null;
        }
        db.close();*/
        //return word;
        return null;
    }
    public boolean deleteHandler(int ID) {
        //no need
        return false;
    }
    public boolean updateHandler(int ID, String name) {
        return false;
    }
}

