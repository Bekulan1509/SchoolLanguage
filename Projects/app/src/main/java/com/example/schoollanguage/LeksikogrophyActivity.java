package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class LeksikogrophyActivity extends AppCompatActivity {
    TextView tV;
    TextView textView;
    ImageView imageView;
    String t1;
    String t2;
    String t3;
    String t4;
    int image;
    int image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksikogrophy);
        tV = findViewById(R.id.tV);
        textView = findViewById(R.id.tV2);
        imageView = findViewById(R.id.image);

        t1 = getIntent().getStringExtra("key");
        image = getIntent().getIntExtra("image", 0);
        t2 = getIntent().getStringExtra("key1");

        tV.setText(t1);
        imageView.setImageResource(image);
        textView.setText(t2);


        t3 = getIntent().getStringExtra("key");
        image2 = getIntent().getIntExtra("image", 0);
        t4 = getIntent().getStringExtra("key1");
        tV.setText(t3);
        imageView.setImageResource(image2);
        textView.setText(t4);


    }
}
