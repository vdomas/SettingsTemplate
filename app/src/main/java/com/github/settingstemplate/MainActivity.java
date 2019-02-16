package com.github.settingstemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import static com.github.settingstemplate.Constants.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + MainActivity.class.getSimpleName());
    }


    //Skipping onStart lifecycle method


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + MainActivity.class.getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + MainActivity.class.getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + MainActivity.class.getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + MainActivity.class.getSimpleName());
    }
}
