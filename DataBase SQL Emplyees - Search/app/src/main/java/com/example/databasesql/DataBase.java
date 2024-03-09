package com.example.databasesql;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class DataBase extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "base.db";
    public static final String DATABASE_TABLE = "Employees";
    public static final String col_1 = "ID";
    public static final String col_2 = "NOM";
    public static final String col_3 = "EMAIL";
    public static final String col_4 = "PHONE";
    private SearchView searchv;
    public DataBase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + DATABASE_TABLE + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOM TEXT, EMAIL TEXT, PHONE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String nom,String mail,String phone) {
        SQLiteDatabase dB = this.getWritableDatabase();
        ContentValues cn = new ContentValues();
        cn.put(col_2, nom);
        cn.put(col_3, mail);
        cn.put(col_4, phone);
        long resultat = dB.insert(DATABASE_TABLE, null, cn);
        if (resultat == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase dB = this.getWritableDatabase();
        Cursor resultat = dB.rawQuery("SELECT * FROM " + DATABASE_TABLE, null);
        return resultat;
    }


    public Cursor getAllDataSearch(String search){
        SQLiteDatabase dB = this.getWritableDatabase();
        Cursor resultat = dB.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE " +
                col_2 + " LIKE ?", new String[]{"%" + search + "%"});
        return resultat;
    }

    public Cursor getAllDataSearchByCategory(String search, String category){
        SQLiteDatabase dB = this.getWritableDatabase();
        Cursor resultat;
        if (category.equals("Name")){
            resultat = dB.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE " +
                    col_2 + " LIKE ?", new String[]{"%" + search + "%"});
        }
        else if (category.equals("Email")){
            resultat = dB.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE " +
                    col_3 + " LIKE ?", new String[]{"%" + search + "%"});
        }
        else{
            resultat = dB.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE " +
                    col_4 + " LIKE ?", new String[]{"%" + search + "%"});
        }

        return resultat;
    }

    public void delete(int id){
        SQLiteDatabase dB = this.getWritableDatabase();
        dB.delete(DATABASE_TABLE, col_1+" = ?", new String[]{String.valueOf(id)});
        dB.close();
    }
    public void update(String nom, String email, String phone, int id){
        SQLiteDatabase dB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(col_2, nom);
        cv.put(col_3, email);
        cv.put(col_4, phone);
        int count = dB.update(DATABASE_TABLE,cv, col_1+" = ?",new String[]{String.valueOf(id)});
        dB.close();
    }
}