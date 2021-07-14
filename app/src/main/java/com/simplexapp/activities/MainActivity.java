package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.simplexapp.R;

public class MainActivity extends AppCompatActivity {
    Button btnLoginForm, btnCheckoutPage, btnBeautyAndBeast, btnListViewActivity, btnFoodListView, btnProductsGridView,
            btnStaticFragment, btnDynamicFragment, btnDrawerLayout, btnAlbumPhotoAPI, btnSharedPreferences, btnJsonParser, btnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginForm = findViewById(R.id.btnLoginForm);
        btnLoginForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginFormActivity.class);
                startActivity(intent);
            }
        });

        btnCheckoutPage = findViewById(R.id.btnCheckoutPage);
        btnCheckoutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CheckoutPageActivity.class);
                startActivity(intent);
            }
        });

        btnBeautyAndBeast = findViewById(R.id.btnBeautyAndBeast);
        btnBeautyAndBeast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BeautyAndBeastActivity.class);
                startActivity(intent);
            }
        });

        btnListViewActivity = findViewById(R.id.btnListViewActivity);
        btnListViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        btnFoodListView = findViewById(R.id.btnFoodListView);
        btnFoodListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FoodListViewActivity.class);
                startActivity(intent);
            }
        });

        btnProductsGridView = findViewById(R.id.btnProductsGridView);
        btnProductsGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProductsGridViewActivity.class);
                startActivity(intent);
            }
        });

        btnStaticFragment = findViewById(R.id.btnStaticFragment);
        btnStaticFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StaticFragmentHolderActivity.class);
                startActivity(intent);
            }
        });

        btnDynamicFragment = findViewById(R.id.btnDynamicFragment);
        btnDynamicFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DynamicFragmentHolderActivity.class);
                startActivity(intent);
            }
        });

        btnDrawerLayout = findViewById(R.id.btnDrawerLayout);
        btnDrawerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrawerLayoutActivity.class);
                startActivity(intent);
            }
        });

        btnAlbumPhotoAPI = findViewById(R.id.btnAlbumPhotoAPI);
        btnAlbumPhotoAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumPhotoListActivity.class);
                startActivity(intent);
            }
        });

        btnSharedPreferences = findViewById(R.id.btnSharedPreferences);
        btnSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SharedPreferencesActivity.class);
                startActivity(intent);
            }
        });

        btnJsonParser = findViewById(R.id.btnJsonParser);
        btnJsonParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JsonParserActivity.class);
                startActivity(intent);
            }
        });

        btnWebView = findViewById(R.id.btnWebView);
        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("The lifecycle method called is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("The lifecycle method called is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("The lifecycle method called is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("The lifecycle method called is onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("The lifecycle method called is onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("The lifecycle method called is onDestroy");
    }
}