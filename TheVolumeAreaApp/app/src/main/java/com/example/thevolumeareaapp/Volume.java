package com.example.thevolumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Volume extends AppCompatActivity {
    EditText volumeInput;
    TextView volumeTitle, resultText;
    Button resultButton;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        volumeInput = findViewById(R.id.volumeInput);
        volumeTitle = findViewById(R.id.volumeTitle);
        resultText = findViewById(R.id.resultText);
        resultButton = findViewById(R.id.resultButton);

        Intent intent = getIntent();
        name = intent.getStringExtra("Name");

        volumeTitle.setText(name);
    resultButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String volume = volumeInput.getText().toString();

        int v = Integer.parseInt(volume);

        switch (name){
            case "Cube":
                double resultText = Math.pow(v,3);
                break;
            case "Cylinder":
                resultText = Math.PI*Math.pow(v,2)*v;
                break;
            case "Prism":
                resultText = (double) v * v;
                break;
            case "Sphere":
                resultText = (4.0/3.0) * (Math.PI*Math.pow(v,3));
                break;
        }
        resultText.setText("Result is - " + resultText.toString());
            }
        });
    }
}
