package com.example.project1.lang;

import java.io.IOException;

public class ExInput2 {
    public static void main(String[] args) throws IOException {
        char input = 0;
        System.out.print("input characters : ");
        while (true) {
            input = (char) System.in.read();

            if (input == 13 || input == 10) continue;
            if (input == 'q') break;
            System.out.println(input);
            System.out.print("input characters : ");
        }
    }
}
