package com.uni.lu.mobiledevelopment.lab2_interaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText(String.format(Locale.ENGLISH, "%d", clickCount));
    }

    public void increment(View view) {
        textView.setText(String.format(Locale.ENGLISH, "%d", ++clickCount));
    }
}