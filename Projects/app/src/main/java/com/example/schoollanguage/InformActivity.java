package com.example.schoollanguage;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class InformActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform);
        button = findViewById(R.id.name);
        button.setBackgroundColor(Color.TRANSPARENT);
       InformThread thread = new InformThread();
       thread.start();
    }
     class InformThread extends Thread{
         @Override
         public void run() {
             super.run();
             try {
                 InformThread.sleep(2300);
                 startActivity(new Intent(InformActivity.this, MainActivity.class));
                 finish();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
}
