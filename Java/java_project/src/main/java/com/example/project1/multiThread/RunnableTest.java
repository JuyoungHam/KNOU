package com.example.project1.multiThread;

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread");
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
    }
}
