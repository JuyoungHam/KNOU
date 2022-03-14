package com.example.project1.lang;

public class ChangeWord {
    public static void main(String[] args) {
        String s1 = " His stuff was terrific today.";

        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
        System.out.println("HELP".toLowerCase());
        System.out.println("Helf me".replace('f', 'p'));
    }
}
