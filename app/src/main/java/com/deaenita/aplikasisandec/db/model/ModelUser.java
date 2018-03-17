package com.deaenita.aplikasisandec.db.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by USER on 17/03/2018.
 */

@Entity(tableName = "user")
public class ModelUser {
    @PrimaryKey (autoGenerate = true)
    int id;
    String nama;
    String keahlian;

    public ModelUser(String nama, String keahlian) {
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
}
