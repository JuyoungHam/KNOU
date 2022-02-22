package com.example.project1.anonymous;

class CSuper2 {
    public int a = 10;

    public void method1() {
        System.out.println("super1");
    }

    public void method2() {
        System.out.println("super2");
    }
}

public class AnonymousTest2 {
    public static void main(String[] args) {
        CSuper2 sub = new CSuper2() {
            public int b = 20;

            @Override
            public void method1() {
                System.out.println("sub1");
            }

            public void method3() {
                System.out.println("sub3");
            }
        };

        sub.method1();
        sub.method2();
        System.out.println(sub.a);

//        sub.method3();
//        System.out.println(sub.b);
    }
}
