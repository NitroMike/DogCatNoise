package com.ginjaninja.dogcatnoisey;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//This is Joe's page
public class DogNoisePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_noise_page);

        final MediaPlayer dogBarkMP = MediaPlayer.create(this, res.aud.dogBark);

        Button playDogBark = (Button) this.findViewById(R.id.dogBark);

        playDogBark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogBarkMP.start();
            }
        });
    }
}
