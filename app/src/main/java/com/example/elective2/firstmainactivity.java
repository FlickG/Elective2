package com.example.elective2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstmainactivity extends AppCompatActivity {
    Button pa2, pa3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstmainactivity);
        pa2 = findViewById(R.id.button_PA2);
        pa3 = findViewById(R.id.button_PA3);
        pa2.setOnClickListener(view -> {
            Intent intent = new Intent(firstmainactivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        pa3.setOnClickListener(view -> {
            Intent intent = new Intent(firstmainactivity.this, profileBadge.class);
            startActivity(intent);
            finish();
        });
    }
}