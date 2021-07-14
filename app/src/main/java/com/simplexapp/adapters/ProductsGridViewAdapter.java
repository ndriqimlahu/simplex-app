package com.simplexapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.simplexapp.R;
import com.simplexapp.models.ProductsGridViewModel;
import java.util.ArrayList;

public class ProductsGridViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<ProductsGridViewModel> arrayList;
    LayoutInflater inflater;

    public ProductsGridViewAdapter(Context context, ArrayList<ProductsGridViewModel> arrayList) {
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
        view = inflater.inflate(R.layout.activity_cell_of_products_gridview,null);

        ImageView ivProductIcon = view.findViewById(R.id.ivProductIcon);
        TextView tvProductTitle = view.findViewById(R.id.tvProductTitle);

        ProductsGridViewModel productsGridViewModel = arrayList.get(position);

        ivProductIcon.setImageResource(productsGridViewModel.getIvProductIcon());
        tvProductTitle.setText(productsGridViewModel.getTvProductTitle());

        return view;
    }
}