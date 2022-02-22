package com.example.project1.polymorphism;

public class Sales extends Employee {
    public Sales() {
        dept = "Sales";
    }

    @Override
    public void doJob() {
        System.out.println("Do Sales");
    }
}
