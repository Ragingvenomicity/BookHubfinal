package com.mapp.bookhub;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsersDatabaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    private static final String Database_Name = "QuizDataBase.db";
    private static final String User_table = "UserInfo";


    private static final String Create_User_Table = "create table UserInfo (User_Name text, " +
            "Name text, Password text);";

    public UsersDatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Create_User_Table);

        this.db=db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table if exists "+User_table+";");

        this.onCreate(db);
    }

    public void insertUserData(UserInfo userInfo)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("User_Name",userInfo.getUsername());
        values.put("Name",userInfo.getName());
        values.put("Password",userInfo.getPassword());

        db.insert(User_table,null,values);
        db.close();
    }

    public boolean searchUname(String Uname)
    {
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select User_Name from UserInfo ",null );

        if (cursor.moveToFirst())
        {
            do {
                if(cursor.getString(0).equals(Uname))
                {
                    return true;
                }
            }while(cursor.moveToNext());
        }
        db.close();
        return false;
    }

    public int searchLogin(String uname, String pass)
    {
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select User_Name, Password from UserInfo ",null);

        if(cursor.moveToFirst())
        {
            do {
                if(cursor.getString(0).equals(uname))
                {
                    if(cursor.getString(1).equals(pass))
                        return 2;
                    else
                        return 1;
                }
            }while(cursor.moveToNext());
        }
        db.close();
        return 0;
    }

    public UserInfo getProfile(String uname)
    {
        db = getReadableDatabase();
        UserInfo userInfo = new UserInfo();
        Cursor cursor = db.rawQuery("select User_Name, Name, Password  from UserInfo ",null);

        if(cursor.moveToFirst())
        {
            do {
                if(cursor.getString(0).equals(uname))
                {
                    userInfo.setUsername(cursor.getString(0));
                    userInfo.setName(cursor.getString(1));
                    userInfo.setPassword(cursor.getString(2));
                    break;

                }
            }while(cursor.moveToNext());
        }
        db.close();
        return userInfo ;
    }

    public UserInfo updateUserProfile(UserInfo userInfo)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        db.update(User_table,values,"User_Name = ?",new String[] {userInfo.getUsername()});
        db.close();
        return userInfo;

    }





}