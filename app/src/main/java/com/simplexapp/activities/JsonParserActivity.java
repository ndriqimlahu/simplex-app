package com.simplexapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.simplexapp.R;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParserActivity extends AppCompatActivity {
    String JSON_STRING = "{\"student\":{\"id\":\"01\",\"name\":\"Ndriçim Lahu\",\"profession\":\"Web and Mobile Application Developer\"}}";
    TextView tvId, tvName, tvProfession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parser);

        tvId = findViewById(R.id.tvId);
        tvName = findViewById(R.id.tvName);
        tvProfession = findViewById(R.id.tvProfession);

        try {
            JSONObject jsonObject = new JSONObject(JSON_STRING);
            JSONObject studentJsonObject = jsonObject.getJSONObject("student");

            System.out.println("ID Number: " + studentJsonObject.getString("id") +
                    " Student Name: " + studentJsonObject.getString("name") +
                    " Profession: " + studentJsonObject.getString("profession"));
            tvId.setText(studentJsonObject.getString("id"));
            tvName.setText(studentJsonObject.getString("name"));
            tvProfession.setText(studentJsonObject.getString("profession"));
        } catch (JSONException jsonException) {
            jsonException.printStackTrace();
        }
    }
}