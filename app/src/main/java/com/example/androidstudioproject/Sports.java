package com.example.androidstudioproject;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "sports")
public class Sports {
    @PrimaryKey
    @ColumnInfo (name = "sports_sid")
    private int sid;

    @ColumnInfo (name = "sports_name")
    private String name;

    @ColumnInfo (name = "sports_type")
    private String type;

    @ColumnInfo (name = "sports_gender")
    private String gender;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
