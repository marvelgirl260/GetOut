package com.example.sophie.getout;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {


    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);


            view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.color.colorSecondPrimary);

            Button button = (Button) findViewById(R.id.power);
            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    //Automatically connect to WiFi
                    view.setBackgroundResource(R.color.colorSecondPrimary);
                }

            });

            Button button2 = (Button) findViewById(R.id.setscreen);
            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    startActivity(new Intent(home.this, SettingsOptions.class));

                }

            });


        }

    }
}


