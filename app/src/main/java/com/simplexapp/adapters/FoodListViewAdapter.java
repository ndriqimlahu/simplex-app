package com.simplexapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.simplexapp.R;
import com.simplexapp.models.FoodListViewModel;
import java.util.ArrayList;

public class FoodListViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<FoodListViewModel> arrayList;
    LayoutInflater inflater;

    public FoodListViewAdapter(Context context, ArrayList<FoodListViewModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_cell_of_food_listview,null);

        ImageView ivFoodIcon = view.findViewById(R.id.ivFoodIcon);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvPrice = view.findViewById(R.id.tvPrice);

        FoodListViewModel foodListViewModel = arrayList.get(position);

        ivFoodIcon.setImageResource(foodListViewModel.getFoodImage());
        tvTitle.setText(foodListViewModel.getTitle());
        tvDescription.setText(foodListViewModel.getDescription());
        tvPrice.setText(foodListViewModel.getPrice());

        return view;
    }
}