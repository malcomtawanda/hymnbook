package com.malcomtawanda.catholichymnbook.junk;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.malcomtawanda.catholichymnbook.R;
import com.malcomtawanda.catholichymnbook.room.entity.Hymn;

import java.util.List;

public class HymnArrayAdapter  extends ArrayAdapter<Hymn>  {
    private Context context;
    private  List<Hymn> hymns;
    public HymnArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Hymn> hymns) {
        super(context, resource, hymns);
        this.context = context;
        this.hymns = hymns;
    }

//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
////
//        Hymn hymn = hymns.get(position);
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//
//        View view = inflater.inflate(R.layout.hymn_list_item, null);
//
////        ImageView imageView = view.findViewById(R.id.hymnImageId);
////        imageView.setImageResource(hymn.getImageResourseId(context));
//
//        TextView textView = view.findViewById(R.id.hymnNameId);
//        textView.setText(hymn.getHymnTitle());
//
//
//       return  view;
//    }
}
