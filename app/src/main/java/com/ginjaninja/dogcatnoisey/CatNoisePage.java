package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

//Logan's responsibility
public class CatNoisePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);

        final int random = new Random().nextInt(7) + 1; // [0, 7] => [1, 8]
        final MediaPlayer catMeowMP = MediaPlayer.create(this, R.raw.cat_meow);
        final MediaPlayer catHissMP = MediaPlayer.create(this, R.raw.cat_earrape);

        Button playCatMeow = this.findViewById(R.id.MeowCatButton);
        Button backArrow = this.findViewById(R.id.backbutton);
        Button toLoudDog = this.findViewById(R.id.meow_woof_btn);

        if (random == 7) {
            playCatMeow.setBackgroundResource(R.drawable.angry_cat);

            playCatMeow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    catHissMP.start();
                }
            });
        }
        else {
            playCatMeow.setBackgroundResource(R.drawable.loud_cat);

            playCatMeow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    catMeowMP.start();
                }
            });
        }
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catMeowMP.stop();
                catHissMP.stop();
                Intent goBack = new Intent(getBaseContext(), CatQuietPage.class);
                startActivity(goBack);
            }
        });
        toLoudDog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                catMeowMP.stop();
                catHissMP.stop();
                Intent goBack = new Intent(getBaseContext(), DogNoisePage.class);
                startActivity(goBack);
            }
        });

    }
}

