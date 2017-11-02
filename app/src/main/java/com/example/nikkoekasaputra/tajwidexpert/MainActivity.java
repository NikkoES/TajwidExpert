package com.example.nikkoekasaputra.tajwidexpert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuMateri(View view){
        Intent i = new Intent(MainActivity.this, com.example.nikkoekasaputra.tajwidexpert.Materi.class);
        startActivity(i);
    }

    public void menuQuiz(View view){
        Intent i = new Intent(MainActivity.this, com.example.nikkoekasaputra.tajwidexpert.Quiz.class);
        startActivity(i);
    }

    public void menuAbout(View view){
        Intent i = new Intent(MainActivity.this, About.class);
        startActivity(i);
    }

}
