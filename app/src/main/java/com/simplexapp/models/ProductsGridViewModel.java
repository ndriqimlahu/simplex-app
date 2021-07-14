package com.simplexapp.models;

public class ProductsGridViewModel {
    private int ivProductIcon;
    private String tvProductTitle;

    public ProductsGridViewModel(int ivProductIcon, String tvProductTitle) {
        this.ivProductIcon = ivProductIcon;
        this.tvProductTitle = tvProductTitle;
    }

    public int getIvProductIcon() {
        return ivProductIcon;
    }

    public String getTvProductTitle() {
        return tvProductTitle;
    }
}