package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class LeksikogrophyActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;


    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;

    String t1;
    String t2;
    String t3;
    String t4;
    String t5;
    String t6;
    String t7;
    String theme;
    TextView textViewTheme;
    int image;
    int image2;
    int image3;
    int image4;
    int image5;
    int image6;
    int image7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksikogrophy);

        textView = findViewById(R.id.tV);
        textView2 = findViewById(R.id.tV2);
        textView3 = findViewById(R.id.tV3);
        textView4 = findViewById(R.id.tV4);
        textView5 = findViewById(R.id.tV5);
        textView6 = findViewById(R.id.tV6);
        textView7 = findViewById(R.id.tV7);
        textViewTheme = findViewById(R.id.textViewTheme);


        imageView = findViewById(R.id.image);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        imageView5 = findViewById(R.id.image5);
        imageView6 = findViewById(R.id.image6);
        imageView7 = findViewById(R.id.image7);


        image = getIntent().getIntExtra("image", 0);
        image2 = getIntent().getIntExtra("image1", 0);
        image3 = getIntent().getIntExtra("image2", 0);
        image4 = getIntent().getIntExtra("image3", 0);
        image5 = getIntent().getIntExtra("image4", 0);
        image6 = getIntent().getIntExtra("image5", 0);
        image7 = getIntent().getIntExtra("image6", 0);


        theme = getIntent().getStringExtra("theme");
        t1 = getIntent().getStringExtra("key");
        t2 = getIntent().getStringExtra("key1");
        t3 = getIntent().getStringExtra("key2");
        t4 = getIntent().getStringExtra("key3");
        t5 = getIntent().getStringExtra("key4");
        t6 = getIntent().getStringExtra("key5");
        t7 = getIntent().getStringExtra("key6");

        imageView.setImageResource(image);
        imageView2.setImageResource(image2);
        imageView3.setImageResource(image3);
        imageView4.setImageResource(image4);
        imageView5.setImageResource(image5);
        imageView6.setImageResource(image6);
        imageView7.setImageResource(image7);

        textViewTheme.setText(theme);
        textView.setText(t1);
        textView2.setText(t2);
        textView3.setText(t3);
        textView4.setText(t4);
        textView5.setText(t5);
        textView6.setText(t6);
        textView7.setText(t7);


//    t3 = getIntent().getStringExtra("key");
//    image2 = getIntent().getIntExtra("image", 0);
//    t4 = getIntent().getStringExtra("key1");
//    tV.setText(t3);
//    imageView.setImageResource(image2);
//    textView.setText(t4);
//
//
//
//    t5 = getIntent().getStringExtra("key");
//    image3 = getIntent().getIntExtra("image", 0);
//    t6 = getIntent().getStringExtra("key1");
//    tV.setText(t5);
//    imageView.setImageResource(image3);
//    textView.setText(t6);


    }
}
