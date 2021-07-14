package com.simplexapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.simplexapp.R;
import com.simplexapp.models.AlbumPhotoModel;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class AlbumPhotoAdapter extends BaseAdapter {
    Context context;
    ArrayList<AlbumPhotoModel> arrayList;
    LayoutInflater layoutInflater;

    public AlbumPhotoAdapter(Context context, ArrayList<AlbumPhotoModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);
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
        view = layoutInflater.inflate(R.layout.cell_album_photo,null);
        ImageView ivUrl = view.findViewById(R.id.ivUrl);
        TextView tvAlbumId = view.findViewById(R.id.tvAlbumId);
        TextView tvId = view.findViewById(R.id.tvId);
        TextView tvTitle = view.findViewById(R.id.tvTitle);

        AlbumPhotoModel albumPhotoModel = arrayList.get(position);

        Picasso.get().load(albumPhotoModel.getUrl()).placeholder(R.mipmap.ic_launcher).into(ivUrl);
        tvAlbumId.setText("Album Id: " + albumPhotoModel.getAlbumId());
        tvId.setText("Id: " + albumPhotoModel.getId());
        tvTitle.setText("Title: " + albumPhotoModel.getTitle());

        return view;
    }
}