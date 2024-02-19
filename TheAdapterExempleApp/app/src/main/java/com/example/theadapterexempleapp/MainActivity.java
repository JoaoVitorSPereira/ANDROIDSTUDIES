package com.example.theadapterexempleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Adapter View: ListView
        listView = findViewById(R.id.listView);

        // 2 - Data source: String Array
        String[] countries = {"USA", "Germany", "Saudi Arabia", "France"};

        // 3 - Adapter: bridge between data source and adapterView;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, countries);

        // Link listview  with the adapter
        listView.setAdapter(adapter);
    }
}