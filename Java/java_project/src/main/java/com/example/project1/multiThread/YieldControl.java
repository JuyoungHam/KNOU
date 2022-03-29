package com.example.project1.multiThread;

class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String name = Thread.currentThread().getName();
            System.out.print(name + " ");
            if (name.equals("t1")) Thread.yield();
        }
    }
}

public class YieldControl {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread5(), "t1");
        Thread t2 = new Thread(new MyThread5(), "t2");

        t1.start();
        t2.start();
    }
}
