package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.simplexapp.R;
import java.util.Random;

public class BeautyAndBeastActivity extends AppCompatActivity {
    Button btnRentFrom;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_and_beast);

        btnRentFrom = findViewById(R.id.btnRentFrom);
        btnRentFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumbers = random.nextInt(100);
                Toast.makeText(BeautyAndBeastActivity.this, "The random number is " + randomNumbers, Toast.LENGTH_SHORT).show();
            }
        });
    }
}