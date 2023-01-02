package com.example.twoactivitiesproject;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mMassageEditText;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMassageEditText = findViewById(R.id.editText_main);
    }

    public static final String EXTRA_MESSAGE =
            "com.example.android.two activities.extra.MESSAGE";
    public void launchSecondlyActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        String message = mMassageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);}
}