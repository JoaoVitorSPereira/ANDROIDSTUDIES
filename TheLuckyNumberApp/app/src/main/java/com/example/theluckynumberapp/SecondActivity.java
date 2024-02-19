package com.example.theluckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    TextView titleText, luckyNumberText;
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        titleText = findViewById(R.id.titleText);
        luckyNumberText = findViewById(R.id.luckyNumberText);
        shareButton = findViewById(R.id.shareButton);

        // Receive data from previous activity
        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");

        // Generate random numbers
        int randomNumber = generateRandomNumber();
        luckyNumberText.setText("" + randomNumber);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, randomNumber);
            }
        });
    }
    
    public int generateRandomNumber() {
        Random random = new Random();
        int limit = 1000;

        int randomNumber = random.nextInt(limit);
        return randomNumber;
    }

    public void shareData(String userName, int randomNumber) {
        // Implicit Intent
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        // Additional Info
        intent.putExtra(Intent.EXTRA_SUBJECT, userName + " got lucky today!");
        intent.putExtra(Intent.EXTRA_TEXT, "His lucky number is: " + randomNumber);

        startActivity(Intent.createChooser(intent, "Choose a Platform"));
    }
}