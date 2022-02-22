package com.example.project1.interFace;

public class Triangle implements Figure {
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width * 0.5;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth() {
        return width;
    }
}
