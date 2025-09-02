package com.example.loginmvc.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class AppDataBase extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public static final String DB_NAME, factory: null, version);
    public static  int version = 1;
    public AppDataBase(Context context) {
        super(context, DB_NAME, factory: null, version);
        db = getWritableDatabase()
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
