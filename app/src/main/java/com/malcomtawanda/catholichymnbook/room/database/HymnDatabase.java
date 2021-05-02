package com.malcomtawanda.catholichymnbook.room.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;
import com.malcomtawanda.catholichymnbook.room.dao.HymnalDAO;

@Database(entities = {Hymn.class}, version = 1)
public abstract class HymnDatabase extends RoomDatabase {
    private static volatile HymnDatabase INSTANCE;

    public abstract HymnalDAO hymnalDAO();

    public static synchronized HymnDatabase getInstanceOfDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), HymnDatabase.class, "hymnal_database").fallbackToDestructiveMigration().addCallback(roomCallback).build();
        }
        return INSTANCE;
    }

    /*call back method provides access onCreate method that allows the database to be populated on creation*/
    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(INSTANCE).execute();
        }
    };

    /*populatedbasynctask class safeguards the population process in the background rather than the main thread*/
    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private final HymnalDAO hymnalDAO;

        private PopulateDbAsyncTask(HymnDatabase db) {
            hymnalDAO = db.hymnalDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            //HymnalData hymnalData = new HymnalData();
            //hymnalDAO.insertAll(hymnalData.populateHymnalData());
            hymnalDAO.insert(new Hymn("omberai", "cleber", "All praise to our redeeming Lord", true, 1));
            hymnalDAO.insert(new Hymn("omberai", "cleber", "All praise to our redeeming Lord", true, 2));
            hymnalDAO.insert(new Hymn("omberai", "cleber", "All praise to our redeeming Lord", true, 3));
            hymnalDAO.insert(new Hymn("omberai", "cleber", "All praise to our redeeming Lord", true, 4));

            return null;
        }
    }
}

