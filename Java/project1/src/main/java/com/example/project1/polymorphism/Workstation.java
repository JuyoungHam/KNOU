package com.example.project1.polymorphism;

public class Workstation implements Computer {
    @Override
    public void calculate(String order) {
        System.out.println("Workstation : " + order);
    }
}
