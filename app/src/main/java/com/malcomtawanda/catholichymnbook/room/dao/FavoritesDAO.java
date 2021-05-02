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
public interface FavoritesDAO {
    @Insert
    void insert(Hymn hymn);

    @Update
    void update(Hymn hymn);

    @Query("SELECT * FROM hymn_table ORDER BY `hymn_title` DESC")
    LiveData<List<Hymn>> getAllHymns();
}
