package com.example.project1.lang;

import java.io.IOException;

public class ExInput1 {
    public static void main(String[] args) throws IOException {
        char input = 0;
        System.out.println("input a character : ");

        input = (char) System.in.read();
        System.out.println(input);
        System.out.println(System.in.available());
    }
}
