package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//This is Chris's Page
public class CatQuietPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_quiet_page);



    }

    public void To_Dog_Page(View view) {

        Intent dog = new Intent(getBaseContext(),DogQuietPage.class);

        startActivity(dog);
    }

    public void To_Cat_Page(View view) {

        Intent cat = new Intent(getBaseContext(),CatNoisePage.class);

        startActivity(cat);


    }
}