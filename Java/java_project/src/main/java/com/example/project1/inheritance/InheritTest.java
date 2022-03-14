package com.example.project1.inheritance;

public class InheritTest {
    public static void main(String[] args) {
        CSub sub = new CSub();

//        sub.f1 = 40;
        sub.f2 = 50;
//        sub.f3 = 60;
        sub.f4 = 70;

        sub.setPrivate();
        sub.setPublic();
//        sub.mPrivate();

    }
}
