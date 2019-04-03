package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//This is Michael's page
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onQDClick(View view) {
        Intent myIntent = new Intent(getBaseContext(),DogQuietPage.class);
        startActivity(myIntent);
    }

    public void onQCClick(View view) {
        Intent myIntent = new Intent(getBaseContext(), CatQuietPage.class);
        startActivity(myIntent);
    }
}
