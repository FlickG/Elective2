package com.example.elective2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profileBadge extends AppCompatActivity {
    Button prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_badge);
        prev = findViewById(R.id.btnPrev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileBadge.this, firstmainactivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void doSometing(View view) {
        switch (view.getId()){

            case R.id.button:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(i1);
                break;

            case R.id.btnBack:
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ph.linkedin.com/"));
                startActivity(i2);
                break;

            case R.id.button3:
                Intent i3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/gconsolacion1/"));
                startActivity(i3);
                break;

            case R.id.button4:
                Intent i4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/"));
                startActivity(i4);
                break;
        }
    }
}