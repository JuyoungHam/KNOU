package com.example.project1.lang;

public class StringTest {
    public static void main(String[] args) {
        final String value = "abcde";
        String str = new String();
        for (int i = 0; i < 10000; i++) {
            str = str + value;
        }

        System.out.println(str);

    }
}
