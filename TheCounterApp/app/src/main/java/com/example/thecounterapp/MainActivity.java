package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textTile;
    Button countButton;
    TextView counterText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTile = findViewById(R.id.titleText);
        countButton = findViewById(R.id.buttonCount);
        counterText = findViewById(R.id.counterText);


        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterText.setText("" + increaseCounter());
            }
        });
    }

    public int increaseCounter() {
       return ++counter;
    }
}