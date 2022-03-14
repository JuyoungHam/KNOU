package com.example.project1.lambda;

public class RunnableTest {
    public static void main(String[] args) {
//        Thread thd = new Thread(new MyThread());
//        thd.start();

//        Runnable runnable = () -> {
//            System.out.println("my thread");
//        };
//
//        Thread thd = new Thread(runnable);
//
//        thd.start();

        Thread thd = new Thread(() -> System.out.println("my thread"));
        thd.start();
    }
}
