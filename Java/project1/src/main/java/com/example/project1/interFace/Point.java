package com.example.project1.interFace;

interface Movable {
    void add(double x, double y);

    void sub(double x, double y);

    default double change_sign(double v) {
        return v * (-1.0);
    }
}

interface Scalable {
    void mul(double s);

    void div(double s);
}

public class Point implements Movable, Scalable {
    double x;
    double y;

    @Override
    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void sub(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    @Override
    public void mul(double s) {
        this.x *= s;
        this.y *= s;
    }

    @Override
    public void div(double s) {
        this.x /= s;
        this.y /= s;
    }
}
