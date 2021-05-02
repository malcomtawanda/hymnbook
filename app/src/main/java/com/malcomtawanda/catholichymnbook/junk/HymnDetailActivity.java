package com.malcomtawanda.catholichymnbook.junk;

import androidx.appcompat.app.AppCompatActivity;

public class HymnDetailActivity extends AppCompatActivity {

//    Hymn hymn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hymn_detail);
//
//        if ( savedInstanceState == null){
//
//
//            Bundle extra = getIntent().getExtras();
//            int position = extra.getInt("hymn_id");
//
//            hymn = new HymnData().hymnList().get(position);
//
//            //Toast.makeText(getApplicationContext(), "Hymn Name: " + hymn.getHymnName(), Toast.LENGTH_LONG).show();
//
//            HymnDetailFragment fragment = new HymnDetailFragment();
//            fragment.setArguments(extra);
//            FragmentManager fragmentManager = getSupportFragmentManager();
//
//            fragmentManager.beginTransaction().add(R.id.detailContainer, fragment).commit();
//        }
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_clear_strokes) {
////            editor.clear();
////            editor.apply();
////
////            for (Hole hole: holes){
////                hole.setStrokeCount(0);
////            }
////            listAdapter.notifyDataSetChanged();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}