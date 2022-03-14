package com.example.project1.lang;

class MyClass1 {

}

class MyClass2 extends Object {
    @Override
    public String toString() {
        return "This MyClass2 class";
    }
}

public class MyClass3 {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();
        System.out.println(myClass1.toString());
        System.out.println(myClass2.toString());
        System.out.println(myClass1);
        System.out.println(myClass2);
    }
}
