package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//This is Chris's Page
public class CatQuietPage extends AppCompatActivity {

    public Button cat_button;
    public Button cat_back;


    public void init() {
        cat_button = (Button) findViewById(R.id.cat_button);

        cat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent toy = new Intent(CatQuietPage.this,CatNoisePage.class);

                    startActivity(toy);
            }
        });
         cat_back = (Button) findViewById(R.id.backArrow);

         cat_back.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {

                    Intent toy = new Intent(CatQuietPage.this,CatNoisePage.class);

                    startActivity(toy);
             }
         });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_quiet_page);

        init();

    }
}