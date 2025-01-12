package com.example.srkribble;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class DialogChooseName extends Dialog implements View.OnClickListener {
    Button btnChoosename;
    EditText etChoosename;
    Context context;
    String name;
    int count=0;

    public DialogChooseName(@NonNull Context context) {
        super(context);

        setContentView(R.layout.dialogchoosename);
        this.context=context;

        btnChoosename=findViewById(R.id.btnNameChosen);
        etChoosename=findViewById(R.id.etChooseName);

        btnChoosename.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v==btnChoosename)
        {
            name= String.valueOf(etChoosename.getText());
            count++;

            Intent i = new Intent(context, LobbyActivity.class);
            i.putExtra("name",name);
            i.putExtra("count",count);
            ((MainActivity)context).startActivity(i);

        }


    }
}
