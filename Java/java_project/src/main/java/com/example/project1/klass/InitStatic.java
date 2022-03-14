package com.example.project1.klass;

class MyClass3 {
    public static int f = 10;

    static void setF(int n) {
        f = n;
    }

    static int getF() {
        return f;
    }
}

public class InitStatic {
    public static void main(String[] args) {
        MyClass3 mc = new MyClass3();
        mc.setF(20);
        System.out.println(mc.getF());

        MyClass3.setF(30);
        System.out.println(MyClass3.getF());
    }
}
