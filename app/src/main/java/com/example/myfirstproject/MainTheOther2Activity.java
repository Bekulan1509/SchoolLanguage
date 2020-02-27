package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainTheOther2Activity extends AppCompatActivity {
    EditText editText2;
    Button button2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_the_other2);
        editText2 = findViewById(R.id.editText2);
        button2 = findViewById(R.id.buttonNext2);
        button2.setTextColor(Color.BLACK);
        intent = getIntent();
        final String boy = intent.getStringExtra("key");
        Log.d("car", boy);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String girlName = editText2.getText().toString();
                if (girlName.equals("")) {
                    Toast.makeText(MainTheOther2Activity.this, "Введите имя девушки", Toast.LENGTH_LONG).show();
                    Log.d("car", "the button is clicked: ");
                } else {
                    intent = new Intent(MainTheOther2Activity.this, MainResultActivity.class);
                    intent.putExtra("key1", girlName+" = ");
                    intent.putExtra("key",boy);
                    startActivity(intent);

                }


            }
        });


    }

}
