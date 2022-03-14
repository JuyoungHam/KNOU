package com.example.project1.lang;

public class StringCompare2 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";

        if (s1.equals("test")) {
            System.out.println("e");
        } else {
            System.out.println("d");
        }

        String s3 = new String("test");

        if (s1.compareTo(s3) == 0) {
            System.out.println("e");
        } else {
            System.out.println("d");
        }
    }
}
