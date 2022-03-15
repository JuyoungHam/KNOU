package com.example.project1.stream;

import java.io.InputStreamReader;

public class ConsoleTest3 {
    public static void main(String[] args) {
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);

        try {
            while ((i = isr.read()) != '끝') {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
