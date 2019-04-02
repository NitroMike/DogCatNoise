package com.ginjaninja.dogcatnoisey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//this is karim's page
public class DogQuietPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_quiet_page);
    }

    public Button Dog;
    public Button Back;

    public void GoForward() {
        Dog = (Button) findViewById(R.id.button);
        Dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent FindNoisePage = new Intent(DogQuietPage.this, DogNoisePage.class);

                startActivity(FindNoisePage);

            }
        });
    }

    public void GoBackwards() {
        Back = (Button) findViewById(R.id.button2);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent GoBack = new Intent(DogQuietPage.this, MainActivity.class);

                startActivity(GoBack);


            }
        });
    }
}



