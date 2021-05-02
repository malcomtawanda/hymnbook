package com.malcomtawanda.catholichymnbook.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.List;

@Dao
public interface HymnalDAO {

    @Insert
    void insert(Hymn hymn);

    @Insert
    void insertAll(Hymn[] allhymns);

    @Update
    void update(Hymn hymn);

    @Query("SELECT * FROM hymn_table ORDER BY `hymn_title` DESC")
    LiveData<List<Hymn>> getAllHymns();

    //query for searching a hymn by its like title

    //query for searching for a hymn by its hymn number

    //query to display hymns by categories







    @Delete
    void delete(Hymn hymn);


}
