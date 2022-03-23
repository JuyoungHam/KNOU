package com.example.project1.collections;

import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

        String s = queue.poll();
        while (s != null) {
            System.out.println(s);
            s = queue.poll();
        }
    }
}
