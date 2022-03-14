package com.example.project1.polymorphism;

public class Company1 {
    public static void main(String[] args) {
        Employee emp1 = new Sales();
        Employee emp2 = new Development();
        emp1.doJob();
        emp2.doJob();
    }
}
