package com.example.project1.multiThread;

class MyThread6 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(Thread.currentThread().getName() + " ");
            Thread.yield();
        }
    }
}

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread6(), "t1");
        Thread t2 = new Thread(new MyThread6(), "t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("main");
    }
}
