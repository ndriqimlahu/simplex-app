package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.simplexapp.R;
import com.simplexapp.adapters.AlbumPhotoAdapter;
import com.simplexapp.api.AlbumPhotoAPI;
import com.simplexapp.models.AlbumPhotoModel;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlbumPhotoListActivity extends AppCompatActivity {
    ListView lvAlbumPhotoList;
    ArrayList<AlbumPhotoModel> arrayList = new ArrayList<>();
    AlbumPhotoAdapter adapter;
    ConstraintLayout clFailedPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_photo_list);

        lvAlbumPhotoList = findViewById(R.id.lvAlbumPhotoList);
        clFailedPopup = findViewById(R.id.clFailedPopup);

        if (hasInternetConnectivity()) {
            makeApiCallAndLoadDataIntoListView();
        } else {
            clFailedPopup.setVisibility(View.VISIBLE);
            Toast.makeText(this, "No internet connection!", Toast.LENGTH_SHORT).show();
        }

        lvAlbumPhotoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AlbumPhotoListActivity.this,AlbumPhotoDetailsActivity.class);
                AlbumPhotoModel albumPhotoModel = arrayList.get(position);
                intent.putExtra("albumObject",albumPhotoModel);
                startActivity(intent);
            }
        });
    }

    private void makeApiCallAndLoadDataIntoListView() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AlbumPhotoAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AlbumPhotoAPI albumPhotoApi = retrofit.create(AlbumPhotoAPI.class);
        Call<ArrayList<AlbumPhotoModel>> call = albumPhotoApi.getAlbums();
        call.enqueue(new Callback<ArrayList<AlbumPhotoModel>>() {
            @Override
            public void onResponse(Call<ArrayList<AlbumPhotoModel>> call, Response<ArrayList<AlbumPhotoModel>> response) {
                arrayList = response.body();
                adapter = new AlbumPhotoAdapter(AlbumPhotoListActivity.this,arrayList);
                lvAlbumPhotoList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<AlbumPhotoModel>> call, Throwable throwable) {
                clFailedPopup.setVisibility(View.VISIBLE);
            }
        });
    }

    boolean hasInternetConnectivity() {
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnectedOrConnecting());
    }
}