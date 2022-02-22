package com.example.project1.anonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        CSub sub = new CSub();
        sub.method1();
        sub.method2();
        sub.method3();

        System.out.println(sub.a);
        System.out.println(sub.b);
    }
}
