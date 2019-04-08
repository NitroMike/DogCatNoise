package com.ginjaninja.dogcatnoisey;
//Logan

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class CatNoisePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);

        final int random = new Random().nextInt(7) + 1; // [0, 7] => [1, 8]

        final MediaPlayer cat_Meow = MediaPlayer.create(this, R.raw.dogbark);

        final MediaPlayer cat_earrape = MediaPlayer.create(this, R.raw.cat_earrape);

        Button MeowCatButton = this.findViewById(R.id.dogBark);

        if (random == 7)
        {
            MeowCatButton.setBackgroundResource(R.drawable.alphamalewolf);

            MeowCatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cat_earrape.start();
                }
            });
        }
        else
        {
            MeowCatButton.setBackgroundResource(R.drawable.loud_dog);

            MeowCatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cat_Meow.start();
                }
            });
        }
    }

}

