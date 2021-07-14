package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.simplexapp.R;

public class CheckoutPageActivity extends AppCompatActivity {
    ImageView imgView;
    TextView textView;
    EditText editText;
    Button purchaseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);
        System.out.println("The lifecycle method called is onCreate");

        imgView = findViewById(R.id.imgView);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CheckoutPageActivity.this, "This is a Logo of Brand", Toast.LENGTH_SHORT).show();
            }
        });

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CheckoutPageActivity.this, "This is a Checkout Page", Toast.LENGTH_SHORT).show();
            }
        });

        editText = findViewById(R.id.editText);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CheckoutPageActivity.this, "Type the Product Name", Toast.LENGTH_SHORT).show();
            }
        });

        purchaseBtn = findViewById(R.id.purchaseBtn);
        purchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CheckoutPageActivity.this, "The data are just submitted and Product is purchased successfully!", Toast.LENGTH_LONG).show();
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