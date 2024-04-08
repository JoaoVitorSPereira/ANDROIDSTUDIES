package com.example.theviewpagerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    MyViewPageAdapter myViewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myViewPageAdapter = new MyViewPageAdapter(
                getSupportFragmentManager(),
                getLifecycle()
        );

        // Adding Fragments to the list in the Adapter Class
        myViewPageAdapter.addFragment(new Fragment1());
        myViewPageAdapter.addFragment(new Fragment2());
        myViewPageAdapter.addFragment(new Fragment3());

        // Set the orientation in ViewPager2
        viewPager = findViewById(R.id.viewPager);
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        // Connecting the Adapter with ViewPager2
        viewPager.setAdapter(myViewPageAdapter);


    }
}