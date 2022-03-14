package com.example.project1.lang;

public class AppendTest {
    public static void main(String[] args) {
        String s1 = "선발투수";
        StringBuffer sb = new StringBuffer(s1);
        sb.append(" ").append("박찬호");
        s1 = sb.toString();
        System.out.println(s1);
    }
}
