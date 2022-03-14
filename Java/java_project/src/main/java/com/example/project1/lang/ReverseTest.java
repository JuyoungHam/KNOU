package com.example.project1.lang;

public class ReverseTest {
    public static void main(String[] args) {
        String s1 = "test string";
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        s1 = sb.toString();
        System.out.println(s1);
    }
}
