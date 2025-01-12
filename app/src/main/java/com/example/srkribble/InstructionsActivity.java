package com.example.srkribble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstructionsActivity extends AppCompatActivity implements View.OnClickListener {
     TextView tvInstructions;
     Button btnInstGuesser,btnInstDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        tvInstructions=findViewById(R.id.tvInsturctions);
        btnInstDrawer=findViewById(R.id.InstructionDrawer);
        btnInstGuesser=findViewById(R.id.InstructionGusser);

        btnInstGuesser.setOnClickListener(this);
        btnInstDrawer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnInstDrawer)
        {
            tvInstructions.setText("your role is the drawer. as the drawer, you need to draw your chosen word. to your need, there are shapes and brushes. you goal is to draw your chosen word in the best way");
        }
        if(v==btnInstGuesser)
        {
            tvInstructions.setText("Your role is the guesser. as the guesser you need to guess the drawer's painting. when you think you are correct, type your answer to see if you are right");
        }

    }
}