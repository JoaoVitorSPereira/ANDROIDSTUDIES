package com.example.theluckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titleText;
    EditText editText;
    Button luckyButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        luckyButton = findViewById(R.id.luckyButton);
        titleText = findViewById(R.id.titleText);

        luckyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = editText.getText().toString();

                //Explicit Intent
                Intent intent = new Intent(
                        getApplicationContext(),
                        SecondActivity.class
                );

                // Passing params to second activity

                intent.putExtra("name", userName);

                startActivity(intent);
            }
        });
    }
}