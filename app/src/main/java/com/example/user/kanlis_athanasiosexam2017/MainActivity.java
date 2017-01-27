package com.example.user.kanlis_athanasiosexam2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.user.kanlis_athanasiosexam2017.R.id.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState== null){
            int commit = getSupportFragmentManager().beginTransaction().add(activity_main, new MerchantFragment()).commit();
        }
    }
}
