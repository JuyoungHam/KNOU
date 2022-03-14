package com.example.project1.exceptions;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

//        System.out.println(i);

        int[] a = new int[5];
        try {
            a[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
