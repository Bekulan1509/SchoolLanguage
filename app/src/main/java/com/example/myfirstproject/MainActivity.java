package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

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
    MediaPlayer buttonSound, buttonSound2, buttonSound3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        button = findViewById(R.id.buttonAnswer);


        button.setTextColor(getResources().getColor(R.color.colorPrimary));
        button.setBackgroundColor(getResources().getColor(R.color.BLUE));


        buttonSound = MediaPlayer.create(this, R.raw.loosers);
        buttonSound2 = MediaPlayer.create(this, R.raw.winer);
        buttonSound3 = MediaPlayer.create(this, R.raw.super_winer);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String text = name1.getText().toString();
                final String text2 = name2.getText().toString();


                Random random = new Random();
                int runNum = random.nextInt(100);


                if (text.equals("Bekulan") && text2.equals("Tahmina")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("Tahmina") && text2.equals("Bekulan")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "    Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("tahmina") && text2.equals("bekulan")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "    Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("bekulan") && text2.equals("tahmina")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "    Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("Бекулан") && text2.equals("Тахмина")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("Тахмина") && text2.equals("Бекулан")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("тахмина") && text2.equals("бекулан")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "     Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("1") || text.equals("2") || text.equals("3") || text.equals("4") || text.equals("5") || text.equals("6") || text.equals("7") || text.equals("8") || text.equals("9") || text.equals("0")) {
                    Toast.makeText(MainActivity.this, "уберите цифры!", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("бекулан") && text2.equals("тахмина")) {
                    Toast.makeText(MainActivity.this, "процент вашей совместимости 100%" + "    Вы созданы для друг друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                } else if (text.equals("") && text2.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите  двe имени!", LENGTH_SHORT).show();

                } else if (text.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите первое имя!", LENGTH_SHORT).show();

                } else if (text2.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите второе имя!", LENGTH_SHORT).show();

                } else if (runNum < 50) {
                    Toast.makeText(MainActivity.this, "Процент вашей совместимости: " + runNum + "%   👎", Toast.LENGTH_LONG).show();
                    buttonSound.start();

                } else if (runNum > 50 && runNum < 80) {
                 Toast.makeText(MainActivity.this, "Процент вашей совместимости: " + runNum + "%" + "     Вы будете хорошей парой 💞", Toast.LENGTH_LONG).show();
                    buttonSound2.start();

                } else if (runNum > 80) {
                    Toast.makeText(MainActivity.this, "Процент вашей совместимости: " + runNum + "%" + "     Вы созданы друг для друга 💘", Toast.LENGTH_LONG).show();
                    buttonSound3.start();
                }
                if (text.equals("") && text2.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите  двe имени!", LENGTH_SHORT).show();
                } else if (text.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите первое имя!", LENGTH_SHORT).show();
                } else if (text2.equals("")) {
                    Toast.makeText(MainActivity.this, " Введите второе имя!", LENGTH_SHORT).show();
                } else if (text.equals("1") || text.equals("2 ") || text.equals("3") || text.equals("4") || text.equals("5") || text.equals("6") || text.equals("7") || text.equals("8") || text.equals("9") || text.equals("0")) {
                    Toast.makeText(MainActivity.this, "уберите цифры!", Toast.LENGTH_LONG).show();
                } else
                    new CountDownTimer(4000, 10) {
                        @Override
                        public void onTick(long l) {
                            button.setText("✔");
                            button.setBackgroundColor(getResources().getColor(R.color.green));
                            button.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            button.setText("получить прогноз");
                            button.setBackgroundColor(getResources().getColor(R.color.BLUE));
                            button.setEnabled(true);
                        }


                    }.start();


            }
        });

    }

}

