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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksikogrophy);
        tV = findViewById(R.id.tV);
        textView = findViewById(R.id.tV2);
        imageView = findViewById(R.id.image);

        t1 = getIntent().getStringExtra("key");
        t2 = getIntent().getStringExtra("key1");
        t3 = getIntent().getStringExtra("key");
        t4 = getIntent().getStringExtra("key1");


        if (t1 == null) {
            Log.d("lala", "onCreate:  done");
            tV.setText(t1);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.table));
            textView.setText(t2);
            return;
        } else if (t3 != null)
            tV.setText(t3);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.table_2));
        textView.setText(t4);
        Log.d("lala", "onCreate:  done1");


    }
}
