package com.deaenita.aplikasisandec.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.deaenita.aplikasisandec.db.model.ModelUser;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by USER on 17/03/2018.
 */

@Dao
public interface DaoUser {
    @Query("select * from user")
    LiveData<List<ModelUser>> getAllUser();

    @Insert(onConflict = REPLACE)
    void addUser(ModelUser modelUser);

    @Query("select * from user where id = id")
    ModelUser getModelUser(String id);

    @Delete()
    void deleteUser(ModelUser modelUser);

}
