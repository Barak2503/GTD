package com.example.srkribble;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class LobbyActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnP1,btnP2,btnP3,btnP4,btnReady;
    Spinner spinner;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);


        btnP1 = findViewById(R.id.btnP1);
        btnP2 = findViewById(R.id.btnP2);
        btnP3 = findViewById(R.id.btnP3);
        btnP4 = findViewById(R.id.btnP4);
        btnReady=findViewById(R.id.btnReady);
        spinner=findViewById(R.id.TopicSpinner);

        btnP1.setOnClickListener(this);
        btnP2.setOnClickListener(this);
        btnP3.setOnClickListener(this);
        btnP4.setOnClickListener(this);
        Intent i = getIntent();
        name = i.getStringExtra("name");


    }

    @Override
    public void onClick(View v)
    {
        if(v==btnP1)
        {
            btnP1.setText(name);
            btnP2.setClickable(false);
            btnP3.setClickable(false);
            btnP4.setClickable(false);
        }
        if(v==btnP2)*//
        {
            btnP2.setText(name);
            btnP1.setClickable(false);
            btnP3.setClickable(false);
            btnP4.setClickable(false);//
        }
        if(v==btnP3)
        {
            btnP3.setText(name);
            btnP2.setClickable(false);
            btnP1.setClickable(false);
            btnP4.setClickable(false);
        }
        if(v==btnP4)
        {
            btnP4.setText(name);
            btnP2.setClickable(false);
            btnP3.setClickable(false);
            btnP1.setClickable(false);
        }
    }

}

