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
    }
}

/*public class CatNoisePage extends AppCompatActivity {

    final MediaPlayer cat_Meow = MediaPlayer.create(this, R.raw.dogbark);

    final MediaPlayer cat_earrape = MediaPlayer.create(this, R.raw.cat_earrape);

    Button backArrow = this.findViewById(R.id.backbutton);

    Button MeowCatButton = this.findViewById(R.id.MeowCatButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);
    }

    public void Cat_Button_Clicking(View view) {
        final int random = new Random().nextInt(7) + 1; // [0, 7] => [1, 8]

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
        if (random != 7)
        {
            MeowCatButton.setBackgroundResource(R.drawable.angry_cat);

            MeowCatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cat_Meow.start();
                }
            });
        }
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat_Meow.stop();
                cat_earrape.stop();
                Intent goBack = new Intent(getBaseContext(), DogQuietPage.class);
                startActivity(goBack);
            }
        });
    }
}
*/
