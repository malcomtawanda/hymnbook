package com.malcomtawanda.catholichymnbook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.Toast;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //HymnalFragment fragment = new HymnalFragment();
    private HymnViewModel hymnViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        FragmentManager fragmentManager = getSupportFragmentManager();
//        Fragment fragment = fragmentManager.findFragmentById(R.id.main_container);
//
//        if(fragment == null){
//            fragment = new HymnalFragment();
//            fragmentManager.beginTransaction().add(R.id.main_container, fragment).commit();
//        }

        RecyclerView recyclerView =  findViewById(R.id.hymnal_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);



        //hymnViewModel = new ViewModelProvider(this).get(HymnViewModel.class);
        hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(HymnViewModel.class);
        hymnViewModel.getAllHymns().observe(this, new Observer<List<Hymn>>() {
            @Override
            public void onChanged(List<Hymn> hymns) {
                adapter.setHymns(hymns);
                //Toast.makeText(MainActivity.this, "onchanged", Toast.LENGTH_SHORT).show();
            }
        });



    }
}















//    RecyclerView recyclerView = findViewById(R.id.hymnal_recyclerview);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//                recyclerView.setHasFixedSize(true);
//
//                RecyclerViewAdapter adapter = new RecyclerViewAdapter(hymnViewModel.getAllHymns().getValue());
//                recyclerView.setAdapter(adapter);
//
//                hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(HymnViewModel.class);
//        hymnViewModel.getAllHymns().observe(this, new Observer<List<Hymn>>() {
//@Override
//public void onChanged(List<Hymn> hymns) {
//        //update recyclerView
//        //Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
//        adapter.setHymns(hymns);
//        }
//        });
//
//
//
//        //hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity())).get(HymnViewModel.class);
//        hymnViewModel = new ViewModelProvider(requireActivity()).get(HymnViewModel.class);
//        hymnViewModel.getAllHymns().observe(getViewLifecycleOwner(), new Observer<List<Hymn>>() {
//@Override
//public void onChanged(List<Hymn> hymns) {
//        //update recyclerView
//        //Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
//        adapter = new RecyclerViewAdapter(hymns);
//        recyclerView.setAdapter(adapter);
////                adapter.setHymns(hymns);
//        }
//        });

//        FloatingActionButton buttonAddNote = findViewById(R.id.button_add_note);
//        buttonAddNote.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, HymnDetails.class);
//                startActivityForResult(intent, ADD_NOTE_REQUEST);
//            }
//        });


//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setHasFixedSize(true);
//
//        HymnAdapter adapter = new HymnAdapter();
//        recyclerView.setAdapter(adapter);
//
//        hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(HymnViewModel.class);
//        hymnViewModel.getAllHymns().observe(this, new Observer<List<Hymn>>() {
//            @Override
//            public void onChanged(List<Hymn> hymns) {
//                //update recyclerView
//                //Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
//                adapter.setHymns(hymns);
//            }
//        });

//        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,
//                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
//            @Override
//            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
//                return false;
//            }
//            @Override
//            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
//                hymnViewModel.delete(adapter.getHymnAt(viewHolder.getAdapterPosition()));
//                Toast.makeText(MainActivity.this, "Note deleted", Toast.LENGTH_SHORT).show();
//            }
//        }).attachToRecyclerView(recyclerView);

//        button = findViewById(R.id.viewHome);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Home.class);
//                startActivity(intent);
//                finish();
//            }
//        });

//        if (findViewById(R.id.detailContainer) != null){
//            isTwoPane = true;
//        }


    //}

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == ADD_NOTE_REQUEST && resultCode == RESULT_OK) {
//            String title = data.getStringExtra(HymnDetails.EXTRA_TITLE);
//            String description = data.getStringExtra(HymnDetails.EXTRA_DESCRIPTION);
//            int priority = data.getIntExtra(HymnDetails.EXTRA_PRIORITY, 1);
//            Hymn hymn = new Hymn(title, description, "warrup" , true, 1);
//            hymnViewModel.insert(hymn);
//            Toast.makeText(this, "Hymn saved", Toast.LENGTH_SHORT).show( );
//        } else {
//            Toast.makeText(this, "Hymn not saved", Toast.LENGTH_SHORT).show();
//         }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.main_menu, menu);
//        return true;
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.delete_all_notes:
//                //hymnViewModel.deleteAllHymns();
//                Toast.makeText(this, "All hymns deleted", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//}

//    @Override
//    public void OnItemSelected(Hymn hymn, int position) {
//
//        if (isTwoPane){
//
//            Bundle bundle = new Bundle();
//            bundle.putInt("hymn_id", position);
//
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            HymnDetailFragment hymnDetailFragment = new HymnDetailFragment();
//            hymnDetailFragment.setArguments(bundle);
//
//            fragmentManager.beginTransaction().replace(R.id.detailContainer, hymnDetailFragment).commit();
//
//        }else {
//            Intent intent =  new Intent(MainActivity.this, HymnDetailActivity.class);
//            intent.putExtra("hymn_id", position);
//            startActivity(intent);
//        }
//
//
//
//
//    }
