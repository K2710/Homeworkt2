package com.sn0ki.homeworkt2;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String NAME = "DBHomeWork";
    public static  final int VERSION = 1;

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, NAME, null, VERSION);
    }

    public void HomeWo
    .rkSave(student student)
    {

        openDB();
        ContentValues newInsert = new ContentValues();
        newInsert.put("Name",student.Name);
        newInsert.put("birday",student.Name);
        this.getWritableDatabase().insert("Student",null,newInsert);
        this.close();
    }
    public void openDB()
    {
        this.getWritableDatabase();
    }
    public void clouseDB()
    {
        this.close();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            // Usar sql para crear tabla
            String sqlCreateForm ="create table Student(ID integer primary key autoincrement Name Text, )";
            db.execSQL(sqlCreateForm);
        }
        catch (Exception ex)
        {

        }
    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
