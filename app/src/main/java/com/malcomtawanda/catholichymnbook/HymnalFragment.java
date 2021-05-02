package com.malcomtawanda.catholichymnbook;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.ArrayList;
import java.util.List;


public class HymnalFragment extends Fragment /*implements RecyclerViewAdapter.ItemClickListener*/ {

//    private List<Hymn> list = new ArrayList<>();
//
//    private RecyclerView recyclerView;
//    private RecyclerViewAdapter adapter;
//    private HymnViewModel hymnViewModel;
//    //private LiveData<List<Hymn>> hymnList = hymnViewModel.getAllHymns();
//
//    public HymnalFragment() {
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//
//
//        }
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
////        RecyclerView recyclerView = view.findViewById(R.id.hymnal_recyclerview);
////        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
////        recyclerView.setLayoutManager(layoutManager);
////        recyclerView.setHasFixedSize(true);
//
//
//        //hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity())).get(HymnViewModel.class);
//
//        hymnViewModel = new ViewModelProvider(requireActivity()).get(HymnViewModel.class);
//        hymnViewModel.getAllHymns().observe(getActivity(), hymns -> {
//            //update recyclerView
//            //Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
//            //adapter.setHymns(hymns);
//        });
//
//    }
}

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_hymnal, container, false);
//
//        RecyclerView recyclerView = view.findViewById(R.id.hymnal_recyclerview);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
//
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
//        recyclerView.setAdapter(adapter);
//
//
//        buildListData();
//
//        return view;
//    }

//    private void initialiseRecyclerView(View view) {

//        RecyclerView recyclerView = view.findViewById(R.id.hymnal_recyclerview);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
//
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
//        recyclerView.setAdapter(adapter);
//
//
//        //hymnViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity())).get(HymnViewModel.class);
//        hymnViewModel = new ViewModelProvider(requireActivity()).get(HymnViewModel.class);
//        hymnViewModel.getAllHymns().observe(getActivity(), new Observer<List<Hymn>>() {
//            @Override
//            public void onChanged(List<Hymn> hymns) {
//                //update recyclerView
//                //Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
//                adapter.setHymns(hymns);
//            }
////        });
//    }

//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
//
//    private void buildListData(){
//        list.add(new Hymn("ALL PRAISE TO OUR REDEEMING LORD" , "Charles Wesley",
//                "All praise to our redeeming Lord,\n" +
//                        "Who joins us by His grace,\n" +
//                        "And bids us, each to each restored,\n" +
//                        "Together seek His face.\n" +
//                        "The gift which He on one bestows,\n" +
//                        "We all delight to prove,\n" +
//                        "The grace through every vessel flows\n" +
//                        "In purest streams of love.\n" +
//                        "He bids us build each other up;\n" +
//                        "And, gathered into one,\n" +
//                        "To our high calling’s glorious hope,\n" +
//                        "We hand in hand go on.\n" +
//                        "We all partake the joy of one;\n" +
//                        "The common peace we feel:\n" +
//                        "A peace to sensual minds unknown,\n" +
//                        "A joy unspeakable.\n" +
//                        "And if our fellowship below\n" +
//                        "In Jesus be so sweet,\n" +
//                        "What height of rapture shall we know\n" +
//                        "When round His throne we meet!", true , 2));
//    }
//
//    @Override
//    public void onItemClick(Hymn hymn) {
//
//    }
