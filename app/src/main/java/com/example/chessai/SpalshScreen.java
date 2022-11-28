package com.example.chessai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SpalshScreen extends AppCompatActivity {
    private MediaPlayer papaSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

//       papaSound = MediaPlayer.create(this, R.raw.soundhorse);
//       soundPlay(papaSound);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SpalshScreen.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
    public void soundPlay(MediaPlayer sound){
        //sound.start();

    }
}