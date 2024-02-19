package com.example.thefrenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackButton, yellowButton, redButton, purpleButton, greenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton = findViewById(R.id.blackButton);
        redButton = findViewById(R.id.redButton);
        yellowButton = findViewById(R.id.yellowButton);
        purpleButton = findViewById(R.id.purpleButton);
        greenButton = findViewById(R.id.greenButton);

        blackButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        // Find the button by ID and play the correct sound
        int clickedBtnId = view.getId();

        if (clickedBtnId == R.id.blackButton) {
            playSound(R.raw.black);
        } else if (clickedBtnId == R.id.greenButton) {
            playSound(R.raw.green);
        } else if (clickedBtnId == R.id.purpleButton) {
            playSound(R.raw.purple);
        } else if (clickedBtnId == R.id.redButton) {
            playSound(R.raw.red);
        } else if (clickedBtnId == R.id.yellowButton) {
            playSound(R.raw.yellow);
        }

    }

    public void playSound(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create( this, id);
        mediaPlayer.start();
    }
}