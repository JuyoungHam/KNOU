package com.example.project1.inheritance;

class CSuper4 {
    public CSuper4() {
        System.out.println("super non-arg");
    }

    public CSuper4(int a) {
        System.out.println("suer arg : " + a);
    }
}

class CSub4 extends CSuper4 {
    public CSub4() {
        System.out.println("sub non-arg");
    }

    public CSub4(int a) {
        System.out.println("sub arg : " + a);
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        CSub4 sub1 = new CSub4();
        CSub4 sub2 = new CSub4(10);
    }
}
