package com.example.project1.klass;

public class Cylinder {
    private Circle c;
    private int h;

    public Cylinder(Circle c, int h) {
        this.c = c;
        this.h = h;
    }

    public double getVolume() {
        return c.getArea() * h;
    }
}
