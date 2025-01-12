package com.example.srkribble;

import android.graphics.Canvas;
import android.graphics.Paint;

public class PressButton {
    private int x,y ,color;
    private Paint p;

    public PressButton(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
        p = new Paint();
        p.setColor(color);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(x,y,x+200,y+100,p);
    }

    public boolean isUserTouchMe(int xu, int yu) {
        return xu>x && xu < x+200 && yu > y && yu < y+100;
    }
}
