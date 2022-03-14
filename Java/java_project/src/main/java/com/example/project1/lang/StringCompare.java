package com.example.project1.lang;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";

        if (s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("different");
        }

        String s3 = new String("test");
        if (s1 == s3) {
            System.out.println("equal");
        } else {
            System.out.println("different");
        }
    }
}
