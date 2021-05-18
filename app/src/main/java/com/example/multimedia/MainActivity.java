package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton btngato, btnperro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btngato = (ImageButton) findViewById(R.id.btngato);
        btnperro = (ImageButton) findViewById(R.id.btnperro);

        // Reproducir el Mp3
        btngato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Maullar();
            }
        });

        btnperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ladrar();
            }
        });

    }

    private void Ladrar() {
        MediaPlayer mpPerro = MediaPlayer.create(MainActivity.this,R.raw.ladra);
        mpPerro.start();
    }

    private void Maullar() {
        MediaPlayer mpGato = MediaPlayer.create(MainActivity.this,R.raw.miau);
        mpGato.start();
    }


}