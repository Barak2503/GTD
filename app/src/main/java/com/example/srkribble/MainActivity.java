package com.example.srkribble;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button setting,start,instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setting=findViewById(R.id.btnSettings);
        start=findViewById(R.id.btnStart);
        instructions=findViewById(R.id.btnInstructions);



        setting.setOnClickListener(this);
        start.setOnClickListener(this);
        instructions.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==instructions)
        {
            Intent intent=new Intent(this, InstructionsActivity.class);
            startActivity(intent);
        }
        if(v==start)
        {
            DialogChooseName dialogChooseName=new DialogChooseName(this);
            dialogChooseName.show();
        }

    }
}