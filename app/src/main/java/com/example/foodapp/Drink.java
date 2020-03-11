package com.example.foodapp;

public class Drink {

    private String name;
    private String description;

    public static final Drink[] drinks = {
            new Drink("Cola","Chilled drink"),
            new Drink("Mango Shake","Fresh n Healthy"),
            new Drink("Juice","Cool n fresh"),
    };

    public Drink(String name,String description){
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
