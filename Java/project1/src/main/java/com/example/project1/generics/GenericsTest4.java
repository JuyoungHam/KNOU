package com.example.project1.generics;

public class GenericsTest4 {
    public static void main(String[] args) {
        Pair2<Integer, String> p1 = new Pair2<>(2, "apple");
        Pair2<Integer, String> p2 = new Pair2<>(2, "pear");

        boolean same = Util.compare(p1, p2);
        System.out.println(same);
    }
}
