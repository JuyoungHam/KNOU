package com.example.project1.anonymous;

interface MyInterface {
    public void method();
}

public class AnonymousTest3 {
    public static void main(String[] args) {
        MyInterface sub = new MyInterface() {
            @Override
            public void method() {
                System.out.println("sub1");
            }
        };

        sub.method();
    }
}
