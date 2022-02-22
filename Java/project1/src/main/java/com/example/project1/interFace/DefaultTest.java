package com.example.project1.interFace;

public class DefaultTest {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10.5;
        p.y = 11.6;

        System.out.println(p.change_sign(p.x));
    }
}
