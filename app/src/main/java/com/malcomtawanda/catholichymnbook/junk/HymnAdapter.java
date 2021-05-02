package com.malcomtawanda.catholichymnbook.junk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.malcomtawanda.catholichymnbook.R;
import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.ArrayList;
import java.util.List;

public class HymnAdapter extends RecyclerView.Adapter<HymnAdapter.HymnHolder> {

    private List<Hymn> hymns =new ArrayList<>();


    @NonNull
    @Override
    public HymnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.hymnal_item, parent, false);

        return new HymnHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull HymnHolder holder, int position) {

        Hymn currentHymn = hymns.get(position);
        holder.textViewhymnName.setText(currentHymn.getHymnTitle());
        holder.textViewauthorName.setText(currentHymn.getHymnist());

    }

    @Override
    public int getItemCount() {
        if(hymns != null){
            return hymns.size();
        }else{
            return 0;
        }
    }

    public void setHymns(List<Hymn> hymns){
        this.hymns = hymns;
        notifyDataSetChanged();
    }

    public Hymn getHymnAt(int position) {
        return hymns.get(position);
    }

    public class HymnHolder extends RecyclerView.ViewHolder{
        private TextView textViewhymnName;
        private TextView textViewauthorName;

        public HymnHolder(@NonNull View itemView) {
            super(itemView);
            textViewhymnName = itemView.findViewById(R.id.hymn_title);
            textViewauthorName = itemView.findViewById(R.id.hymn_lyrics_hint);
        }
    }
}
