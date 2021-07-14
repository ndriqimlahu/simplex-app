package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.simplexapp.R;

public class DrawerLayoutActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Button btnOptionPopup;
    ConstraintLayout clOptionPopup;
    ImageView ivOpenMenu;
    TextView tvHome, tvAboutUs, tvContactUs, tvFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        btnOptionPopup = findViewById(R.id.btnOptionPopup);
        clOptionPopup = findViewById(R.id.clOptionPopup);
        ivOpenMenu = findViewById(R.id.ivMenu);
        tvHome = findViewById(R.id.tvHome);
        tvAboutUs = findViewById(R.id.tvAboutUs);
        tvContactUs = findViewById(R.id.tvContactUs);
        tvFeedback = findViewById(R.id.tvFeedback);

        ivOpenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        tvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        tvAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        tvContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        tvFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        btnOptionPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clOptionPopup.setVisibility(View.VISIBLE);
                btnOptionPopup.setVisibility(View.INVISIBLE);
            }
        });
    }
}