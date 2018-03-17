package com.deaenita.aplikasisandec.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.deaenita.aplikasisandec.db.dao.DaoUser;
import com.deaenita.aplikasisandec.db.model.ModelUser;

/**
 * Created by USER on 17/03/2018.
 */

@Database(entities = {ModelUser.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DaoUser itemAndUserModel;

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context){
        if(INSTANCE == null){
            synchronized (AppDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"user_db").build()
                }
            }
        }return INSTANCE;
    }
    public static void destroyInstance(){INSTANCE = null;}

    public abstract DaoUser itemAndUserModel();
}
