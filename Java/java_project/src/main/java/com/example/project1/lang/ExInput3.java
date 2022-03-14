package com.example.project1.lang;

import java.io.IOException;

public class ExInput3 {
    public static void main(String[] args) throws IOException {
        int input = 0;
        System.out.println("input an integer : ");
        input = System.in.read();
        input -= '0';
        System.out.println(input);
    }
}
