package com.simplexapp.api;

import com.simplexapp.models.AlbumPhotoModel;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumPhotoAPI {
    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("photos")
    Call<ArrayList<AlbumPhotoModel>> getAlbums();
}