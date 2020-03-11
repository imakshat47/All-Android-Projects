package com.example.foodapp;

import android.widget.ArrayAdapter;

public class Other {

    private String name;
    private String description;

    public static final Other[] others = {
            new Other("Salad","Fresh vege"),
            new Other("Lunch box","Packed easy portable"),
    };

    public Other(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
    public String toString(){
        return this.name;
    }
}
