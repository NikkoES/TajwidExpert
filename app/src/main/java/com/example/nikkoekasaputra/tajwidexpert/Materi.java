package com.example.nikkoekasaputra.tajwidexpert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
    }

    public void menuMateri1(View v){
        //ngirim trigger untuk pengecekan di MateriView class
        //boleh angka atau karakter
        Intent i = new Intent(Materi.this, MateriView.class);
        startActivity(i);
    }

}