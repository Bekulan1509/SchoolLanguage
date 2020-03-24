package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActivityThemes extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme1);
        textView =findViewById(R.id.TV);
        Intent intent = getIntent();
        String t1=intent.getStringExtra("key");



        textView.setText(t1);
        //textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
