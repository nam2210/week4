package com.hnam.exerciseweek4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements AFragment.AFragmentListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick() {
        Log.e(TAG, "click>>>>");
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
