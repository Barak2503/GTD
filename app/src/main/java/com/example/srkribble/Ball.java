package com.example.srkribble;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Ball {
    private int x,y,r;
    private int color;

    // Empty constructor MUST for firebase
    public Ball() {
    }

    public Ball(int x, int y, int r, int color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void draw(Canvas canvas)
    {
        Paint p = new Paint();
        p.setColor(color);
        canvas.drawCircle(x,y,r,p);
    }

    public void setXandY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isCollision(Ball explodingBall) {
        return this.r + explodingBall.r >= Math.sqrt(Math.pow(x - explodingBall.x, 2) +
                Math.pow(y - explodingBall.y, 2));
    }

    public boolean isUserTouchMe(int xu, int yu) {
        double diss = Math.sqrt(Math.pow(xu - this.x, 2) +
                Math.pow(yu - this.y, 2));
        return diss < r;
    }
}
