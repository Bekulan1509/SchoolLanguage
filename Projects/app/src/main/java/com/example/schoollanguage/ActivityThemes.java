package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActivityThemes extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme1);
        textView = findViewById(R.id.TV);
        textView2 = findViewById(R.id.TV2);
        String t1 = getIntent().getStringExtra("key");
        String t2 = getIntent().getStringExtra("key1");

        textView.setText(t1);
        textView2.setText(t2);

    }
}
