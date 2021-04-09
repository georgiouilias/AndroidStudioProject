package com.example.androidstudioproject;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Sports.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract MyDao mydaotemp();


}
