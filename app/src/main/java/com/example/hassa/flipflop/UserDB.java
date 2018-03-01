package com.example.hassa.flipflop;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by hassa on 1/24/2018.
 */

public class UserDB {
    public static final String KEY_ROWID="_id";
    public static final String KEY_FIRSTNAME="_firstname";
    public static final String KEY_LASTNAME="_lastname";
    public static final String KEY_EMAIL="_email";
    public static final String KEY_PASSWORD="_password";

    private final String DATABASE_NAME="UserDB";
    private final String DATABASE_TABLE="UserTable";
    private final int DATABASE_VERSION=1;

    private DBHelper ourHelper;
    private final Context ourContext;
    private SQLiteDatabase ourDatabase;

    UserDB(Context con){
        ourContext=con;
    }
    private class DBHelper extends SQLiteOpenHelper
    {
        public DBHelper(Context con)
        {
            super(con,DATABASE_NAME,null,DATABASE_VERSION);

        }
        //RUNS WHEN YOU CHANGE DATABASE VERSION
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
            onCreate(db);
        }
        //only call when there exit no database
        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String sqlCode="CREATE TABLE " + DATABASE_TABLE + " (" +
                    KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_FIRSTNAME + " TEXT NOT NULL, " +
                    KEY_LASTNAME + " TEXT NOT NULL, " +
                    KEY_EMAIL + " TEXT NOT NULL, " +
                    KEY_PASSWORD + " TEXT NOT NULL);";
            db.execSQL(sqlCode);
        }
    }
    public UserDB open()throws SQLException
    {
        ourHelper=new DBHelper(ourContext);
        ourDatabase=ourHelper.getWritableDatabase();
        return this;
    }
    public void close()
    {
        ourHelper.close();
    }
    public long createEntry(String first,String last,String e,String pass)
    {
        ContentValues cv=new ContentValues();
        cv.put(KEY_FIRSTNAME,first);//first one is column name and second is data
        cv.put(KEY_LASTNAME,last);
        cv.put(KEY_EMAIL,e);
        cv.put(KEY_PASSWORD,pass);
        return ourDatabase.insert(DATABASE_TABLE,null,cv);
    }
    public String getData()
    {
        String []columns=new String[]{KEY_ROWID,KEY_FIRSTNAME,KEY_LASTNAME,KEY_EMAIL,KEY_PASSWORD};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null);
        String result="";
        int iRowID=c.getColumnIndex(KEY_ROWID);
        int iFirst=c.getColumnIndex(KEY_FIRSTNAME);
        int iLast=c.getColumnIndex(KEY_LASTNAME);
        int iEmail=c.getColumnIndex(KEY_EMAIL);
        int iPass=c.getColumnIndex(KEY_PASSWORD);
        for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=result + c.getString(iRowID) + ": " + c.getString(iFirst) + "\n" +
                    c.getString(iLast) + " " + c.getString(iEmail) + " " + c.getString(iPass) +"\n";
        }
        c.close();
        return  result;
    }
    public Cursor loginUser(String e,String  p)
    {
        return ourDatabase.query(DATABASE_TABLE, new String[] { KEY_ROWID,KEY_FIRSTNAME,KEY_LASTNAME,KEY_EMAIL,
                        KEY_PASSWORD }, KEY_EMAIL + "=? AND " + KEY_PASSWORD + "=?",
                new String[] { e,p}, null, null, null, null);


    }


}
