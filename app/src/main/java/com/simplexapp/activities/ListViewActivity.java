package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.simplexapp.R;
import com.simplexapp.adapters.ListViewAdapter;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    String dessertList[] = {"Cakes","Small Cakes","Frozen Desserts","Fruit Cakes","Dessert Ball","Muffin","Puddings","Ice Cream"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,dessertList);
        listView.setAdapter(listViewAdapter);
    }
}