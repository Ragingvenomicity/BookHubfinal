package com.mapp.bookhub;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    BottomNavigationFragment bottomNavigationFragment = new BottomNavigationFragment();
    BottomAppBar bottomAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
         bottomAppBar = findViewById(R.id.bottom_app_bar);
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomNavigationFragment.show(getSupportFragmentManager(),bottomNavigationFragment.getTag());
            }
        });
    }

}
