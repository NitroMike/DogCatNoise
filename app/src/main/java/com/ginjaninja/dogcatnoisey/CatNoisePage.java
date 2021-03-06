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

        final MediaPlayer catmeow = MediaPlayer.create(this, R.raw.cat_meow);

        final MediaPlayer cathiss = MediaPlayer.create(this, R.raw.cat_earrape);

        Button playcatmeow = this.findViewById(R.id.MeowCatButton);
        Button backArrow = this.findViewById(R.id.backbutton);
        Button dogbutton = this.findViewById(R.id.meow_woof_btn);

        if (random == 7) {
            playcatmeow.setBackgroundResource(R.drawable.angry_cat);

            playcatmeow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cathiss.start();
                }
            });
        } else {
            playcatmeow.setBackgroundResource(R.drawable.cat_photo);

            playcatmeow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    catmeow.start();
                }
            });
        }
        backArrow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                catmeow.stop();
                cathiss.stop();
                startActivity(new Intent(CatNoisePage.this, CatQuietPage.class));
                finish();
            }
        });
        dogbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                catmeow.stop();
                cathiss.stop();
                startActivity(new Intent(CatNoisePage.this, DogNoisePage.class));
                finish();
            }
        });
    }
}
