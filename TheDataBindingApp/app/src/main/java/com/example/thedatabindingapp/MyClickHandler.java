package com.example.thedatabindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButtonOneClicked(View view) {
        Toast.makeText(context, "First Button is Clicked", Toast.LENGTH_SHORT).show();
    }
}
