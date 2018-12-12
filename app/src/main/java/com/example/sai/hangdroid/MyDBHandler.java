package com.example.sai.hangdroid;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
public class MyDBHandler extends SQLiteOpenHelper {
    ///info on the database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "WordDB.db";
    public static final String TABLE_NAME = "Word";
    public static final String COLUMN_WORDS = "Words";
    //initilizing of the database
    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {}
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    public String loadHandler() {
        return null;
    }
    public void addHandler(Word wordy) {

    }
    public Word findHandler(String wordy) {
        Word word = new Word(wordy, wordy.length());
        return word;
    }
    public boolean deleteHandler(int ID) {
        return false;
    }
    public boolean updateHandler(int ID, String name) {
        return false;
    }
}
