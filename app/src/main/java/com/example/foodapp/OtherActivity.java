package com.example.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OtherActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listOthers = getListView();
        ArrayAdapter<Other> otherArrayAdapter = new ArrayAdapter<Other>(this,android.R.layout.simple_list_item_1,Other.others);
        listOthers.setAdapter(otherArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(OtherActivity.this,OtherD.class);
        intent.putExtra(OtherD.EXTRA_ONO,(int) id);
        startActivity(intent);
    }
}
