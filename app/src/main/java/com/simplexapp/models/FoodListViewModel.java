package com.simplexapp.models;

public class FoodListViewModel {
    private int foodImage;
    private String title;
    private String description;
    private String price;

    public FoodListViewModel(int foodImage, String title, String description, String price) {
        this.foodImage = foodImage;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}