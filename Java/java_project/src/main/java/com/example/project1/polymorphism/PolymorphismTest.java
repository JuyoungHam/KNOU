package com.example.project1.polymorphism;

class A {
    public void func() {
        System.out.println("a");
    }
}

class B extends A {
    @Override
    public void func() {
        System.out.println("b");
    }
}

class C extends B {
    @Override
    public void func() {
        System.out.println("c");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
//        A a = new B();
//        a.func();
//        a = new C();
//        a.func();

        PersonalComputer pc = new PersonalComputer();
        pc.powerOn();
    }
}
