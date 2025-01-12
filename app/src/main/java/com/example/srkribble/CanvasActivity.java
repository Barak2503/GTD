package com.example.srkribble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    private BoardGame boardGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        boardGame = new BoardGame(this);
        setContentView(boardGame);

    }

    public void dataChange() {
        boardGame.dataChange();

    }
}