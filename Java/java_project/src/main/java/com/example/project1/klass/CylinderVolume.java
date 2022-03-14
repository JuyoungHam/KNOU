package com.example.project1.klass;

public class CylinderVolume {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        int h = 8;
        Cylinder cy = new Cylinder(c, h);
        System.out.println(cy.getVolume());
    }
}
