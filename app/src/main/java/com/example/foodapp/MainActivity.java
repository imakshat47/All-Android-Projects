package com.example.foodapp;
/*
* By Akshat Kumar
* */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//code by devilAk
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intentF = new Intent(MainActivity.this,FoodActivity.class);
                        startActivity(intentF);
                        break;
                    case 1:
                        Intent intentD = new Intent(MainActivity.this,DrinkActivity.class);
                        startActivity(intentD);
                        break;
                    case 2:
                        Intent intentO = new Intent(MainActivity.this,OtherActivity.class);
                        startActivity(intentO);
                        break;
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setOnItemClickListener(itemClickListener);
    }
}
