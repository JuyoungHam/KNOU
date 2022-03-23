package com.example.project1.collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        try {
            while (true) System.out.println(stack.pop());
        } catch (NoSuchElementException e) {
            System.out.println("stack empty");
        }
    }
}
