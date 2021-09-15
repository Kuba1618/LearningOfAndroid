package com.example.mysimpleaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnHello:
                System.out.println("Hello");
                break;
            default:
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }



//    public void onHelloBtnClicked(View view) {
//        TextView txtWelcome = findViewById(R.id.txtWelcome);
//        txtWelcome.setText("Hi there");
//
//    }
}