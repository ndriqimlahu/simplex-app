package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import com.simplexapp.R;
import com.simplexapp.preferences.SharedPrefs;

public class SharedPreferencesActivity extends AppCompatActivity {
    EditText etName, etSurname, etMoney;
    CheckBox checkBoxRemember;
    Button btnSaveData, btnClearData, btnRetrieveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        findViews();

        boolean isChecked = SharedPrefs.getBoolean(SharedPreferencesActivity.this,"checkbox");
        etName.setText(SharedPrefs.getString(SharedPreferencesActivity.this,"name"));
        etSurname.setText(SharedPrefs.getString(SharedPreferencesActivity.this,"surname"));
        checkBoxRemember.setChecked(isChecked);

        checkBoxRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"name",etName.getText().toString());
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"surname",etSurname.getText().toString());
                    SharedPrefs.saveBoolean(SharedPreferencesActivity.this,"checkbox",true);
                } else {
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"name","");
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"surname","");
                    SharedPrefs.saveBoolean(SharedPreferencesActivity.this,"checkbox",false);
                }
            }
        });

        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText().length() > 0 && etSurname.getText().length() > 0 && etMoney.getText().length() > 0) {
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"name",etName.getText().toString());
                    SharedPrefs.saveString(SharedPreferencesActivity.this,"surname",etSurname.getText().toString());
                    SharedPrefs.saveDouble(SharedPreferencesActivity.this,"money",Double.parseDouble(etMoney.getText().toString()));
                } else {
                    Toast.makeText(SharedPreferencesActivity.this, "All fields must be filled!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClearData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText("");
                etSurname.setText("");
                etMoney.setText("");
            }
        });

        btnRetrieveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(SharedPrefs.getString(SharedPreferencesActivity.this,"name"));
                etSurname.setText(SharedPrefs.getString(SharedPreferencesActivity.this,"surname"));
                String money = String.valueOf(SharedPrefs.getDouble(SharedPreferencesActivity.this,"money"));
                etMoney.setText(money);
            }
        });
    }

    private void findViews() {
        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etMoney = findViewById(R.id.etMoney);
        checkBoxRemember = findViewById(R.id.checkBoxRemember);
        btnSaveData = findViewById(R.id.btnSaveData);
        btnClearData = findViewById(R.id.btnClearData);
        btnRetrieveData = findViewById(R.id.btnRetrieveData);
    }
}