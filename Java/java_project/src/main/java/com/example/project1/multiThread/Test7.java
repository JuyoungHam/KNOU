package com.example.project1.multiThread;

class MyThread7 extends Thread {
    Thread next = null;

    public MyThread7(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                System.out.println(getName() + "");
                if (this.next.isAlive()) this.next.interrupt();
            }
        }
    }

    public void setNextThread(Thread next) {
        this.next = next;
    }
}

public class Test7 {
    public static void main(String[] args) {
        MyThread7 t1 = new MyThread7("t1");
        MyThread7 t2 = new MyThread7("t2");
        MyThread7 t3 = new MyThread7("t3");

        t1.setNextThread(t2);
        t2.setNextThread(t3);
        t3.setNextThread(t1);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.interrupt();
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("main");
    }
}
