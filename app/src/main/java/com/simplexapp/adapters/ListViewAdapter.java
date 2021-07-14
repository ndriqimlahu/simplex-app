package com.simplexapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.simplexapp.R;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    String dessertList[];
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] dessertList) {
        this.context = context;
        this.dessertList = dessertList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return dessertList.length;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.cell_of_listview,null);
        TextView tvDessertName = view.findViewById(R.id.tvDessertName);
        tvDessertName.setText(dessertList[position]);
        return view;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}