package com.example.srkribble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BoardGame extends View {
    private Paint p;
    private ArrayList<Ball> arr;
    PressButton pbRed, pbGreen;
    private int color = Color.BLACK;
    private FbModule fbModule;

    public BoardGame(Context context) {
        super(context);

        p = new Paint();
        p.setTextSize(100);
        arr = new ArrayList<>();
        pbRed = new PressButton(100,100,Color.RED);
        pbGreen = new PressButton(500,100,Color.GREEN);
        fbModule = new FbModule(context,arr);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        pbRed.draw(canvas);
        pbGreen.draw(canvas);
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).draw(canvas);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            if(pbRed.isUserTouchMe(x,y))
            {
                color = Color.RED;
            }
            if(pbGreen.isUserTouchMe(x,y))
            {
                color = Color.GREEN;
            }
        }

        if(event.getAction() == MotionEvent.ACTION_MOVE)
        {
            fbModule.setBall(x,y,40,color);
        }

        if(event.getAction() == MotionEvent.ACTION_UP)
        {
        }

        //return super.onTouchEvent(event);
        return true;
    }

    public void dataChange() {
        invalidate();
    }
}
