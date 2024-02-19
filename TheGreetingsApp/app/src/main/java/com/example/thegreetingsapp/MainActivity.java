package com.example.thegreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editInput;
    Button button;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = findViewById(R.id.editInput);
        button = findViewById(R.id.button);
        title = findViewById(R.id.title);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = editInput.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        "Welcome " +inputName +", I already love you!!",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}