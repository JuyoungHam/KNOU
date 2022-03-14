package com.example.project1.inheritance;

class Shape {
    public double getArea(double height, double width) {
        return height * width;
    }
}

class Triangle extends Shape {
    @Override
    public double getArea(double height, double width) {
        return height * width * 0.5;
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.getArea(3, 4));
    }
}
