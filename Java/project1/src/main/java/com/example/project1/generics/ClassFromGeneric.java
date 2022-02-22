package com.example.project1.generics;

public class ClassFromGeneric {
    public static void main(String[] args) {
//        MyPair mp = new MyPair("test", 1);
//        System.out.println(mp.getKey());
//        System.out.println(mp.getValue());

        MyData md = new MyData(10);
        System.out.println(md.get());
    }
}
