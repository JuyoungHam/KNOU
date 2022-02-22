package com.example.project1.interFace;

public class MovablePoint implements Movable {
    double x;
    double y;

    @Override
    public double change_sign(double v) {
        return Movable.super.change_sign(v);
    }

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
}
