package com.malcomtawanda.catholichymnbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.List;

import static com.malcomtawanda.catholichymnbook.R.id.arrow_drawable;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HymnalViewHolder> {

    private List<Hymn> hymns;

    private ItemClickListener clickListener;

    public RecyclerViewAdapter(List<Hymn> hymns){
        this.hymns = hymns;
        ;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.HymnalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hymnal_item ,parent, false);
        return new HymnalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.HymnalViewHolder holder, int position) {
        holder.textForHymnNumber.setText(hymns.get(position).getHymnNumber());
        holder.textForHymnTitle.setText(hymns.get(position).getHymnTitle());
        holder.textForHymnLyrics.setText(hymns.get(position).getHymnLyrics());
        holder.imageForArrowIcon.setImageResource(R.drawable.ic_arrow_right);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(hymns.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        if(hymns != null){
            return hymns.size();
        }else{
            return 0;
        }
    }

    public void setHymns(List<Hymn> hymns) {
    }

    class HymnalViewHolder extends RecyclerView.ViewHolder{


        TextView textForHymnNumber;
        TextView textForHymnTitle;
        TextView textForHymnLyrics;
        ImageView imageForArrowIcon;

        public HymnalViewHolder(@NonNull View itemView) {
            super(itemView);
            textForHymnNumber = itemView.findViewById(R.id.hymn_number);
            textForHymnTitle = itemView.findViewById(R.id.hymn_title);
            textForHymnLyrics = itemView.findViewById(R.id.hymn_lyrics_hint);
            imageForArrowIcon = itemView.findViewById(arrow_drawable);
        }
    }

    public interface ItemClickListener{
        public void onItemClick(Hymn hymn);
    }

}
