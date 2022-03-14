package com.example.project1.polymorphism;

//public class PersonalComputer implements Computer{
//    @Override
//    public void calculate(String order) {
//        System.out.println("PersonalComputer : " + order);
//    }
//}

public class PersonalComputer extends Computer2 implements Calculator {

    @Override
    public void calculate(String order) {
        System.out.println("PersonalComputer : " + order);
    }
}