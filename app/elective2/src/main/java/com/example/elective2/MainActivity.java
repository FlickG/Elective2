package com.example.elective2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName,LastName,houseNo, streetName, subdivision, city, country, notes;
    String fullName, homeAddress;
    String comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.firstnameEditText);
        LastName = findViewById(R.id.lastnameEditText);
        houseNo = findViewById(R.id.houseNoEditText);
        streetName = findViewById(R.id.streetnameEditText);
        subdivision = findViewById(R.id.subdivisionEditText);
        city = findViewById(R.id.cityEditText);
        country = findViewById(R.id.countryEditText);
        notes = findViewById(R.id.notesEditText);

    }

    public void saveInput(View view) {
        Context context =getApplicationContext();
        fullName = firstName.toString() + " " + LastName.toString();
        homeAddress = houseNo.toString() + " " + streetName.toString() + " " + subdivision.toString() + " " + city.toString() + "," + country;
        comments = notes.toString();

        Toast.makeText(this,"Personal Information Saved!!", Toast.LENGTH_SHORT).show();

    }

    public void clearInput(View view) {
        firstName.setText("");
        LastName.setText("");
        houseNo.setText("");
        streetName.setText("");
        subdivision.setText("");
        city.setText("");
        country.setText("");
        notes.setText("");
    }
}