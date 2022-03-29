package com.example.project1.multiThread;

class SharedResource {
    int res = 0;

    public synchronized void increaseRes(String name) {
        try {
            Thread.sleep(2);
        } catch (Exception e) {
            System.out.println(e);
        }

        res++;
        System.out.println("[" + name + " " + res + "]");
    }
}

class MyThread8 extends Thread {
    static SharedResource sr;
    String name;

    public MyThread8(String name, SharedResource sr) {
        super(name);
        this.name = name;
        this.sr = sr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sr.increaseRes(this.name);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
        MyThread8[] threads = new MyThread8[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread8("t" + (i + 1), sr);
            threads[i].start();
        }
    }
}
