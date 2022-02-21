package com.example.project1.inheritance;

class MyClass5 {
    double x = 10.0;

    public MyClass5() {
        x = 20.0;
    }

    public MyClass5(double x) {
        this();
        this.x = this.x + x;
    }
}

public class ThisTest {
    public static void main(String[] args) {
        MyClass5 mc = new MyClass5(10);
        System.out.println(mc.x);
    }
}
