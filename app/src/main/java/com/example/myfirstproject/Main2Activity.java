package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button);
        button.setBackgroundColor(Color.TRANSPARENT);
        button.setTextColor(Color.WHITE);


        MainThread mainThread = new MainThread();
        mainThread.start();
    }

    public class MainThread extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                MainThread.sleep(2800);
                Intent intent = new Intent(Main2Activity.this, MainVariantActivity.class);
                startActivity(intent);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
