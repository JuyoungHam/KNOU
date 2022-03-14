package com.example.project1.klass;

class MyClass2 {
    public static int sField = 0;
}

public class StaticTest1 {
    public static void main(String[] args) {
        MyClass2 o1 = new MyClass2();
        MyClass2 o2 = new MyClass2();

        o1.sField = 10;
        System.out.println(o2.sField);
        o2.sField += 10;
        System.out.println(o1.sField);
    }
}
