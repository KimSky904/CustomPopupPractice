package com.example.custompopuppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.custompopuppractice.TransScrollPopup.TransparentScrollPopupActivity;

public class MainActivity extends AppCompatActivity {

    Button transparent_popup;
    Button basic_popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basic_popup = findViewById(R.id.basic_popup);
        transparent_popup = findViewById(R.id.transparent_popup);

        basic_popup.setOnClickListener(v -> {
            Intent intent = new Intent(this,BasicAlertPopup.class);
            startActivity(intent);
        });

        transparent_popup.setOnClickListener(v -> {
            Intent intent = new Intent(this, TransparentScrollPopupActivity.class);
            startActivity(intent);
        });
    }
}