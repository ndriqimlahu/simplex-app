package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.simplexapp.R;
import com.simplexapp.models.AlbumPhotoModel;
import com.squareup.picasso.Picasso;

public class AlbumPhotoDetailsActivity extends AppCompatActivity {
    ImageView ivPhoto;
    TextView ivTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_photo_details);

        ivPhoto = findViewById(R.id.ivPhoto);
        ivTitle = findViewById(R.id.ivTitle);

        AlbumPhotoModel albumPhotoModel = (AlbumPhotoModel) getIntent().getSerializableExtra("albumObject");

        Picasso.get().load(albumPhotoModel.getUrl()).placeholder(R.mipmap.ic_launcher).into(ivPhoto);
        ivTitle.setText(albumPhotoModel.getTitle());
    }
}