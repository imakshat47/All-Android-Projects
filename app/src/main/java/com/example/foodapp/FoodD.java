package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodD extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_d);


        int foodNo = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);

        Food food = Food.foods[foodNo];

        TextView name = (TextView)findViewById(R.id.name);
        TextView desc = (TextView)findViewById(R.id.desc);
        ImageView imageView = (ImageView)findViewById(R.id.foodim);

        name.setText(food.getName());
        desc.setText(food.getDescription());
        imageView.setImageResource(food.getImageId());
    }
}
