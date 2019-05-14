package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//this is Karim's page
public class DogQuietPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_quiet_page);
    }

//    public void onQFClick(View view) {
//        Intent findDogNoise = new Intent(getBaseContext(),DogNoisePage.class);
//        startActivity(findDogNoise);
//    }

    public void onQWClick(View view) {
        Intent goToTheNoise = new Intent(getBaseContext(), DogNoisePage.class);
        startActivity(goToTheNoise);
    }
    public void onQCClick(View view) {
        Intent goBackHome = new Intent(getBaseContext(), MainActivity.class);
        startActivity(goBackHome);
    }
    public void onQEClick(View view) {
        Intent goFindCat = new Intent(getBaseContext(), CatQuietPage.class);
        startActivity(goFindCat);
    }
}
