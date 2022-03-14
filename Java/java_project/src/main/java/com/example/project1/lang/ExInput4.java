package com.example.project1.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExInput4 {
    public static void main(String[] args) throws IOException {
        String inputLine;
        int value;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader is = new BufferedReader(isr);
        inputLine = is.readLine();
        value = Integer.parseInt(inputLine);
        System.out.println(value);
        is.close();
    }
}
