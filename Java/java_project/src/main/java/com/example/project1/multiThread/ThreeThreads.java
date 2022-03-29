package com.example.project1.multiThread;

class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(getName() + " ");
        }
    }
}

public class ThreeThreads {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        MyThread3 t3 = new MyThread3("t3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("main");
    }
}
