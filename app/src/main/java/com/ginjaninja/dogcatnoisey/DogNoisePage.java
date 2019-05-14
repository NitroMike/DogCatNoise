package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

//This is Joe's page
public class DogNoisePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_noise_page);

        final int random = new Random().nextInt(7) + 1; // [0, 7] => [1, 8]

        final MediaPlayer dogBarkMP = MediaPlayer.create(this, R.raw.dogbark);

        final MediaPlayer wolfhowlMP = MediaPlayer.create(this, R.raw.wolfhowling);

        Button playDogBark = this.findViewById(R.id.dogBark);
        Button backArrow =  this.findViewById(R.id.backArrow);
        Button gotocat =  this.findViewById(R.id.gotocat);
//      Button backArrow = (Button) findViewById(R.id.backArrow); This also works.

        if (random == 7) {
            playDogBark.setBackgroundResource(R.drawable.alphamalewolf);

            playDogBark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    wolfhowlMP.start();
                }
            });
        } else {
            playDogBark.setBackgroundResource(R.drawable.loud_dog);

            playDogBark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dogBarkMP.start();
                }
            });
        }
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogBarkMP.stop();
                wolfhowlMP.stop();
                Intent goBack = new Intent(getBaseContext(), DogQuietPage.class);
                startActivity(goBack);
            }
        });

        gotocat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCat = new Intent(getBaseContext(), CatNoisePage.class);
                startActivity(goCat);
            }
        });
    }
}
