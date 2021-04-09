package com.example.androidstudioproject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void addSport(Sports sports);

    @Query("select * from sports")
    public List<Sports> getSports();

    @Delete
    public void deleteSports (Sports sports);

    @Update
    public void updateSports(Sports sports);

}
