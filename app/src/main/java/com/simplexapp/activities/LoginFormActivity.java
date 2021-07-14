package com.simplexapp.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.simplexapp.R;

public class LoginFormActivity extends AppCompatActivity {
    Button signInBtn;
    EditText feedbackMessage;
    TextView feedbackResult;
    Button submitBtn;
    TextView textViewProgrammatically;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        System.out.println("The lifecycle method called is onCreate");

        signInBtn = findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginFormActivity.this, CheckoutPageActivity.class);
                Toast.makeText(LoginFormActivity.this, "Welcome to the Checkout Page!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        feedbackMessage = findViewById(R.id.feedbackMessage);
        feedbackResult = findViewById(R.id.feedbackResult);
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbackResult.setText(feedbackMessage.getText().toString());
                Toast.makeText(LoginFormActivity.this, "The feedback is submitted!", Toast.LENGTH_SHORT).show();
            }
        });

        textViewProgrammatically = findViewById(R.id.textViewProgrammatically);
        textViewProgrammatically.setText("Example how the TextView has changed programmatically!");
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

    @Override
    public void onBackPressed() {
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("The Alert Dialog");
        alertDialogBuilder.setMessage("Do you want to close this application ?");
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish(); // the click of button "Yes"
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // the click of button "No"
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}