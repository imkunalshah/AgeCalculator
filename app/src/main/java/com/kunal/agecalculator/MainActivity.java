package com.kunal.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements AgeFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = findViewById(R.id.fragment_container);
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(),new AgeFragment()).commit();
        }
    }

    @Override
    public void onFragmentInteraction(int day, int month) {

    }
}
