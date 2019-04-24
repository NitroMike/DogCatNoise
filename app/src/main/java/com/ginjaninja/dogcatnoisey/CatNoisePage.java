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

    int random = new Random().nextInt(7) + 1; // [0, 6] => [1, 7]
    final MediaPlayer catMeowMP = MediaPlayer.create(this, R.raw.cat_meow);
    final MediaPlayer catHissMP = MediaPlayer.create(this, R.raw.cat_earrape);
    String backgroundname = "loud_cat";

    Button playCatMeow = this.findViewById(R.id.MeowCatButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_noise_page);

        int random = new Random().nextInt(7) + 1; // [0, 7] => [1, 8]

        final MediaPlayer catMeow = MediaPlayer.create(this, R.raw.cat_meow);

        final MediaPlayer catScream = MediaPlayer.create(this, R.raw.cat_earrape);

        Button MeowCatButton = this.findViewById(R.id.dogBark);
        random = new Random().nextInt(7) + 1;
        if (random == 7) {
            MeowCatButton.setBackgroundResource(R.drawable.angry_cat);

            MeowCatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    catScream.start();
                }
            });
        } else {
            MeowCatButton.setBackgroundResource(R.drawable.loud_cat);

            MeowCatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    catMeow.start();
                }
            });
        }
    }

    public void go_backwards(View view) {
        catMeowMP.stop();
        catHissMP.stop();
        Intent goBack = new Intent(getBaseContext(), CatQuietPage.class);
        startActivity(goBack);
    }

    public void goto_dog(View view) {
        catMeowMP.stop();
        catHissMP.stop();
        Intent goBack = new Intent(getBaseContext(), DogNoisePage.class);
        startActivity(goBack);
    }
}

