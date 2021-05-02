package com.malcomtawanda.catholichymnbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.ArrayList;
import java.util.List;

import static com.malcomtawanda.catholichymnbook.R.id.arrow_drawable;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HymnalViewHolder> {

    private List<Hymn> hymnList = new ArrayList<>();

    //private ItemClickListener clickListener;



    @NonNull
    @Override
    public RecyclerViewAdapter.HymnalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hymnal_item ,parent, false);
        return new HymnalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.HymnalViewHolder holder, int position) {
        Hymn currentHymn = hymnList.get(position);
        holder.textForHymnNumber.setText(String.valueOf(currentHymn.getHymnNumber()));
        holder.textForHymnTitle.setText(currentHymn.getHymnTitle());
        //holder.textForHymnLyrics.setText(hymnList.get(position).getHymnLyrics());
        holder.textForHymnLyrics.setText(currentHymn.getHymnLyrics());
        holder.imageForArrowIcon.setImageResource(R.drawable.ic_arrow_right);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clickListener.onItemClick(hymnList.get(position));
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return hymnList.size();
    }

    public void setHymns(List<Hymn> hymnList) {
        this.hymnList = hymnList;
        notifyDataSetChanged();
    }

    class HymnalViewHolder extends RecyclerView.ViewHolder{


        private TextView textForHymnNumber;
        private TextView textForHymnTitle;
        private TextView textForHymnLyrics;
        private ImageView imageForArrowIcon;

        public HymnalViewHolder(@NonNull View itemView) {
            super(itemView);
            textForHymnNumber = itemView.findViewById(R.id.hymn_number);
            textForHymnTitle = itemView.findViewById(R.id.hymn_title);
            textForHymnLyrics = itemView.findViewById(R.id.hymn_lyrics_hint);
            imageForArrowIcon = itemView.findViewById(arrow_drawable);
        }
    }

//    public interface ItemClickListener{
//        public void onItemClick(Hymn hymn);
//    }

}
