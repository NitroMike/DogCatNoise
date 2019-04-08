package com.ginjaninja.dogcatnoisey;
//Logan

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CatNoisePage extends AppCompatActivity {

    public Button change_page;
    public void changing_now() {
        change_page = findViewById(R.id.MeowCatButton);
        change_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switch_now = new Intent(CatNoisePage.this, MainActivity.class);
                startActivity(switch_now);
            }
        });
    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_noise_page);

        final MediaPlayer cat_meow = MediaPlayer.create(this, R.raw.cat_meow);

        Button MeowCatButton = this.findViewById(R.id.MeowCatButton);

        MeowCatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat_meow.start();
            }
        });

        changing_now();


    }

}

