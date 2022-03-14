package com.example.project1.interFace;

public class Box implements Figure {
    private double height;
    private double width;

    public Box(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
