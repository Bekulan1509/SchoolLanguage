package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    EditText name1;
    EditText name2;
    Button button;
    MediaPlayer buttonSound,buttonSound2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        button = findViewById(R.id.buttonAnswer);

        button.setText("получить прогноз");
        button.setTextColor(Color.BLACK);
        button.setBackgroundColor(Color.GREEN);

        buttonSound = MediaPlayer.create(this, R.raw.loosers);
        buttonSound2 = MediaPlayer.create(this,R.raw.win);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = name1.getText().toString();
                String text2 = name2.getText().toString();


                Random random = new Random();
                final int runNum = random.nextInt(100);


                if (text.equals("Bekulan") && text2.equals("Tahmina")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("Tahmina") && text2.equals("Bekulan")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("tahmina") && text2.equals("bekulan")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("bekulan") && text2.equals("tahmina")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("Бекулан") && text2.equals("Тахмина")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("Тахмина") && text2.equals("Бекулан")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("тахмина") && text2.equals("бекулан")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (text.equals("бекулан") && text2.equals("тахмина")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы будете отличной парой 👍", Toast.LENGTH_LONG).show();

                } else if (runNum < 50) {
                    Toast.makeText(MainActivity.this, "Процент вашей совместимости: " + runNum + "%", Toast.LENGTH_LONG).show();

                } else if (runNum > 50) {
                    Toast.makeText(MainActivity.this, "Процент вашей совместимости: " + runNum + "%" + "     Вы будете хорошей парой \uD83D\uDC4D", Toast.LENGTH_LONG).show();
                    buttonSound2.start();

                }
                if (text.equals("") && text2.equals("")) {
                    Toast.makeText(MainActivity.this, " ведите  двe имени!", LENGTH_SHORT).show();

                } else if (text.equals("")) {
                    Toast.makeText(MainActivity.this, " ведите первое имя!", LENGTH_SHORT).show();
                } else if (text2.equals("")) {
                    Toast.makeText(MainActivity.this, " ведите второе имя!", LENGTH_SHORT).show();
                } else
                    new CountDownTimer(2500, 10) {
                        @Override
                        public void onTick(long l) {
                            if (runNum<50){
                                buttonSound.start();
                            }else if (runNum>=50){buttonSound2.start();}

                            button.setText("✔");
                            button.setBackgroundColor(Color.GREEN);
                            button.setEnabled(false);


                        }

                        @Override
                        public void onFinish() {
                            button.setText("получить прогноз");
                            button.setBackgroundColor(Color.GREEN);
                            button.setEnabled(true);


                        }
                    }.start();

            }

        });

    }

}

