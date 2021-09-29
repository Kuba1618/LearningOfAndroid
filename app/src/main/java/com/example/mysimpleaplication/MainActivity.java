package com.example.mysimpleaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesListJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesListJava = findViewById(R.id.citiesListXML);

        ArrayList<String> citiestArrayList = new ArrayList<>();
        citiestArrayList.add("Kraków");
        citiestArrayList.add("Katowice");
        citiestArrayList.add("Kielce");
        citiestArrayList.add("Poznań");
        citiestArrayList.add("Śródmorze");
        citiestArrayList.add("Bieliny");


        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citiestArrayList
        );

        citiesListJava.setAdapter(citiesAdapter);

    }


}