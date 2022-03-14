package com.example.project1.polymorphism;

public class Development extends Employee {
    public Development() {
        dept = "Development";
    }

    @Override
    public void doJob() {
        System.out.println("Do development");
    }
}
