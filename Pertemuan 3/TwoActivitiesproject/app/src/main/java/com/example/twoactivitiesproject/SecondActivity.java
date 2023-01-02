package com.example.twoactivitiesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.editText_message);
        textView.setText(message);
    }

    public void returnReplay(View view) {
        String reply = mReply.getText().toString();
        Intent replayIntent = new Intent();
        replayIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replayIntent);
        finish();
    }
}