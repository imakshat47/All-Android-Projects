package com.example.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkD extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_d);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);

        Drink drink = Drink.drinks[drinkNo];

        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.desc);


        name.setText(drink.getName());
        desc.setText(drink.getDescription());

    }
}
