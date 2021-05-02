package com.malcomtawanda.catholichymnbook.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;
import com.malcomtawanda.catholichymnbook.room.dao.HymnalDAO;
import com.malcomtawanda.catholichymnbook.room.database.HymnDatabase;

import java.util.List;

public class HymnalRepository {
    private HymnalDAO hymnalDAO;
    private LiveData<List<Hymn>> allHymns;

    public HymnalRepository(Application application){
        HymnDatabase db = HymnDatabase.getInstanceOfDatabase(application);
        hymnalDAO = db.hymnalDAO();
        allHymns = hymnalDAO.getAllHymns();
    }

    public void insert(Hymn hymn){
        new InsertHymnASyncTask(hymnalDAO).execute(hymn);
    }

    public void update(Hymn hymn){
        new UpdateHymnASyncTask(hymnalDAO).execute(hymn);
    }

    public void delete(Hymn hymn){
        new DeleteHymnASyncTask(hymnalDAO).execute(hymn);
    }

    public LiveData<List<Hymn>> getAllHymns(){
        return allHymns;
    }

    private static class InsertHymnASyncTask extends AsyncTask<Hymn, Void, Void>{

        private HymnalDAO hymnalDAO;

        private InsertHymnASyncTask(HymnalDAO hymnalDAO){
            this.hymnalDAO = hymnalDAO;
        }
        @Override
        protected Void doInBackground(Hymn... hymns) {
            hymnalDAO.insert(hymns[0]);
            return null;
        }
    }

    private static class UpdateHymnASyncTask extends AsyncTask<Hymn, Void, Void>{

        private HymnalDAO hymnalDAO;

        private UpdateHymnASyncTask(HymnalDAO hymnalDAO){
            this.hymnalDAO = hymnalDAO;
        }
        @Override
        protected Void doInBackground(Hymn... hymns) {
            hymnalDAO.update(hymns[0]);
            return null;
        }
    }

    private static class DeleteHymnASyncTask extends AsyncTask<Hymn, Void, Void>{

        private HymnalDAO hymnalDAO;

        private DeleteHymnASyncTask(HymnalDAO hymnalDAO){
            this.hymnalDAO = hymnalDAO;
        }
        @Override
        protected Void doInBackground(Hymn... hymns) {
            hymnalDAO.delete(hymns[0]);
            return null;
        }
    }
}
