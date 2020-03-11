package com.example.foodapp;

public class Food {

    private String name;
    private String description;
    private int imageId;

    public static final Food[] foods = {
            new Food("Pizza","thin crust with extra chees",R.drawable.image),
            new Food("Burger","Veg",R.drawable.ic_launcher_background),
            new Food("Sanwich","Extra chess",R.drawable.image),
    };

    public Food(String name,String description, int imageId){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }
    public int getImageId(){
        return imageId;
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
