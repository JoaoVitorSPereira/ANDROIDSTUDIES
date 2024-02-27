package com.example.thevolumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sphere extends AppCompatActivity {
    EditText radiusInput;
    TextView sphereVolumeTitle, resultText;
    Button resultButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        radiusInput = findViewById(R.id.radiusInput);
        sphereVolumeTitle = findViewById(R.id.sphereVolumeTitle);
        resultText = findViewById(R.id.resultText);
        resultButton = findViewById(R.id.resultButton);

    resultButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String radius = radiusInput.getText().toString();

        int r = Integer.parseInt(radius);

        // V = (4/3) * pi * r^3

        double volume = (4/3) * 3.14159 * r * r * r;
        resultText.setText("V = "+volume+" m^3");
    }
});
    }
}
