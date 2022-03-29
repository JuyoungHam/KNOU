package com.example.project1.multiThread;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
