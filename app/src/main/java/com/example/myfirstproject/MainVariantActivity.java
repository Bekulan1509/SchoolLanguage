package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainVariantActivity extends AppCompatActivity {
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_variant);

        button1 = findViewById(R.id.buttonVariant1);
        button2 = findViewById(R.id.buttonVariant2);
        button1.setTextColor(Color.BLACK);
        button2.setTextColor(Color.BLACK);
        button();
        button2();

    }

    public void button() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainVariantActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void button2() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainVariantActivity.this, MainTheOtherActivity.class);
                startActivity(intent);
            }
        });
    }
}
