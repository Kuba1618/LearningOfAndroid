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

    private ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Jędrzejów");
        cities.add("Kielce");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Cracow");
        cities.add("Warsaw");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this ,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

    }


}