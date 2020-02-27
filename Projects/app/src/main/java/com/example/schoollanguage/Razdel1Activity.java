package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Razdel1Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_razdel1);
        textView = findViewById(R.id.textView);
        Intent intent;
        intent = getIntent();
        String position = intent.getStringExtra("key");
        textView.setText(position);

    }
}
