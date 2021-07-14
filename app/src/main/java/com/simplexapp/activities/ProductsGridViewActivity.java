package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import com.simplexapp.R;
import com.simplexapp.adapters.ProductsGridViewAdapter;
import com.simplexapp.models.ProductsGridViewModel;
import java.util.ArrayList;

public class ProductsGridViewActivity extends AppCompatActivity {
    GridView productsGridView;
    ArrayList<ProductsGridViewModel> arrayList = new ArrayList<>();
    ProductsGridViewAdapter productsGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_grid_view);

        productsGridView = findViewById(R.id.productsGridView);

        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "Coffee"));
        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "Espresso"));
        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "French Fries"));
        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "Honey"));
        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "Pudding"));
        arrayList.add(new ProductsGridViewModel(R.mipmap.ic_launcher, "Ice Cream"));

        productsGridViewAdapter = new ProductsGridViewAdapter(this,arrayList);
        productsGridView.setAdapter(productsGridViewAdapter);
    }
}