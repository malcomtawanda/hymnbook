package com.malcomtawanda.catholichymnbook;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;
import com.malcomtawanda.catholichymnbook.repository.HymnalRepository;

import java.util.List;

public class HymnViewModel extends AndroidViewModel {

    private HymnalRepository repository;
    private LiveData<List<Hymn>> allHymns;

    public HymnViewModel(@NonNull Application application) {
        super(application);
        repository = new HymnalRepository(application);
        allHymns = repository.getAllHymns();
    }

    public void insert(Hymn hymn){
        repository.insert(hymn);
    }

    public void update(Hymn hymn){
        repository.update(hymn);
    }

    public void delete(Hymn hymn){
        repository.delete(hymn);
    }

    public LiveData<List<Hymn>> getAllHymns(){
        return allHymns;
    }
}
