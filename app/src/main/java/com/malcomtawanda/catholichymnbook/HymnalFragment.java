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

import java.util.List;

public class HymnalFragment extends Fragment {

    private HymnViewModel hymnViewModel;
    private RecyclerViewAdapter adapter = new RecyclerViewAdapter();

    public HymnalFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_hymnal, container, false);

        RecyclerView recyclerView =  view.findViewById(R.id.fragment_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hymnViewModel = new ViewModelProvider(requireActivity()).get(HymnViewModel.class);
        hymnViewModel.getAllHymns().observe(getActivity(), new Observer<List<Hymn>>() {
            @Override
            public void onChanged(List<Hymn> hymns) {
                adapter.setHymns(hymns);
            }
        });
//        itemSelector.setOnClickListener(item -> {
//            model.select(item);
//        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}