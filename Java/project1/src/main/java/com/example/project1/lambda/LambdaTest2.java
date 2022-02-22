package com.example.project1.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {
        MyInterface f1 = (a, b) -> {
            return a + b;
        };
        System.out.println(f1.method(3, 4));

        MyInterface f2 = (a, b) -> a + b;
        System.out.println(f2.method(5, 6));
    }
}
