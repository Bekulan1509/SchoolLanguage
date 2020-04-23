package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainResultActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.beBack);
        button.setTextColor(Color.BLACK);
        Random random = new Random();
        int runNum = random.nextInt(100);
        Intent intent = getIntent();
        String boy = intent.getStringExtra("key");
        String girl = intent.getStringExtra("key1");
        if (runNum < 50) {
            textView.setText(boy + "" + girl + " ваше совместимость с этим человеком " + runNum + " % 👎");
        } else if (runNum > 50 && runNum < 80) {
            textView.setText(boy + "" + girl + " ваше совместимость с этим человеком " + runNum + " % " +
                    "ВЫ БУДЕТЕ ХОРОШЕЙ ПАРОЙ 💞 ");
        } else if (runNum > 80) {
            textView.setText(boy + "" + girl + " ваше совместимость с этим человеком " + runNum + " " + "% " +
                    "ВЫ СОЗДАНЫ ДЛЯ ДРУГ ДРУГА 💘");

        }
        button();

    }

    public void button() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainResultActivity.this, MainTheOtherActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
