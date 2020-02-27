package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainTheOtherActivity extends AppCompatActivity {
    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_the_other);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.buttonNext);
        button.setTextColor(Color.BLACK);
        buttonListener();
    }

    public void buttonListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boyName = editText.getText().toString();
                if (boyName.equals("")) {
                    Toast.makeText(MainTheOtherActivity.this, "Введите имя мальчика", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainTheOtherActivity.this, MainTheOther2Activity.class);
                    intent.putExtra("key", boyName + " ❤️ ");
                    startActivity(intent);
                }
            }
        });
    }
}
