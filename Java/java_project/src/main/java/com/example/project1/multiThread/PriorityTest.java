package com.example.project1.multiThread;

class MyThread4 extends Thread {

    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String num = String.valueOf(i);
            if (i < 10) num = "0" + String.valueOf(i);

            System.out.println(getName() + "(" + num + ")");
        }
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4("t1");
        MyThread4 t2 = new MyThread4("t2");
        MyThread4 t3 = new MyThread4("t3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
