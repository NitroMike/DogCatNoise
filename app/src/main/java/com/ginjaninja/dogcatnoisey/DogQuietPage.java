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
    public Button clickbutton1;
    public void init(){
        clickbutton1= (Button)findViewById(R.id.button);
        clickbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent click = new Intent(DogQuietPage.this, DogNoisePage.class);

                startActivity(click);

            }
        });
    }
}