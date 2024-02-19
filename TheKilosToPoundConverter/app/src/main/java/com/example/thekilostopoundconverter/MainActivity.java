package com.example.thekilostopoundconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    Button converterButton;
    EditText kilosInput;
    TextView resultText;
    double poundToKilo = 2.20462;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kilosInput = findViewById(R.id.kilosInput);
        converterButton = findViewById(R.id.converterButton);resultText = findViewById(R.id.resultText);


        converterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = kilosInput.getText().toString();
                double kilos = Double.parseDouble(inputText);

                double pounds = handleConvert(kilos);

                resultText.setText(""+pounds);

            }
        });
    }

    public double handleConvert(double kilos) {
        return kilos * poundToKilo;
    }
}