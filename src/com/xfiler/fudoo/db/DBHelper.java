package com.xfiler.fudoo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2015/5/18.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String SQLCreateAccount="CREATE TABLE account (" +
            "id integer primary key autoincrement," +
            "age integer," +
            "contents integer," +
            "fences integer," +
            "follows integer," +
            "account_type integer," +
            "reference_id integer," +
            "name text," +
            "sex text," +
            "url text," +
            "brief text," +
            "province text," +
            "city text," +
            "icon blob," +
            "operate_time text," +
            "create_time text," +
            "column text)";
    private static final String SQLCreateContent="CREATE TABLE content(" +
            "id integer primary key autoincrement," +
            "content_type integer," +
            "forwards integer," +
            "comments integer," +
            "draft_flag integer," +
            "relationship_flag integer," +
            "favourite_flag integer," +
            "zan_flag integer" +
            "operator integer," +
            "operate_type integer," +
            "reference_id integer," +
            "source text," +
            "content text," +
            "image blob," +
            "operate_time text," +
            "column text)";
    private String SCHEME_NAME="fudoo.db";
    private Context icontext;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        icontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLCreateAccount);
        sqLiteDatabase.execSQL(SQLCreateContent);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
