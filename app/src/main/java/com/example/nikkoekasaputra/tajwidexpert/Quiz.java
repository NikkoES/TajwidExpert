package com.example.nikkoekasaputra.tajwidexpert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    char pilihan = '0';

    public void menuMateri(View view){
        pilihan = '1';
        pilihMenu(pilihan);
    }

    public void menuQuiz(View view){
        pilihan = '2';
        pilihMenu(pilihan);
    }

    public void menuAbout(View view){
        pilihan = '3';
        pilihMenu(pilihan);
    }

    private void pilihMenu(char pilihan){
        TextView hasil = (TextView) findViewById(R.id.hasil);
        switch (pilihan){
            case '1' : {
                hasil.setText("Menu Materi");
                break;
            }

            case '2' : {
                hasil.setText("Menu Quiz");
                break;
            }

            case '3' : {
                hasil.setText("Menu About");
                break;
            }
        }
    }

}
