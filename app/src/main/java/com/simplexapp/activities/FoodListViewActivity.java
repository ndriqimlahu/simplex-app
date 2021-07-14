package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.simplexapp.R;
import com.simplexapp.adapters.FoodListViewAdapter;
import com.simplexapp.models.FoodListViewModel;
import java.util.ArrayList;

public class FoodListViewActivity extends AppCompatActivity {
    ListView foodListView;
    ArrayList<FoodListViewModel> arrayList = new ArrayList<>();
    FoodListViewAdapter foodListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list_view);

        foodListView = findViewById(R.id.foodListView);

        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Pizza","Spicy Chicken Pizza","RS 310.00"));
        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Burger","Beef Burger","RS 350.00"));
        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Pizza","Chicken Pizza","RS 250.00"));
        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Burger","Chicken Burger","RS 350.00"));
        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Burger","Fish Burger","RS 310.00"));
        arrayList.add(new FoodListViewModel(R.mipmap.ic_launcher,"Mango","Mango Juice","RS 250.00"));

        foodListViewAdapter = new FoodListViewAdapter(this,arrayList);
        foodListView.setAdapter(foodListViewAdapter);

        View headerView = ((LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.header_of_food_list_view,null,false);
        foodListView.addHeaderView(headerView);
        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(FoodListViewActivity.this, "You have clicked in the header", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FoodListViewActivity.this, "You have clicked in the position: " + position, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}