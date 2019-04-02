package com.ginjaninja.dogcatnoisey;
//Logan

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CatNoisePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);

        MediaPlayer mp = MediaPlayer.create(CatNoisePage.this, R.raw.cat_meow);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {

                mp.release();
            }

        });
        mp.start();

        }
    }

