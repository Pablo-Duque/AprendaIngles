package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void somAnimal(int audio) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(),
                audio);
        if (mediaPlayer != null)
            mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
    public void dog(View view){
        somAnimal(R.raw.dog);
    }

    public void cat(View view){
        somAnimal(R.raw.cat);
    }

    public void lion(View view){
        somAnimal(R.raw.lion);
    }

    public void monkey(View view){
        somAnimal(R.raw.monkey);
    }

    public void sheep(View view){
        somAnimal(R.raw.sheep);
    }

    public void cow(View view){
        somAnimal(R.raw.cow);
    }
}