package com.example.project1.generics;

public class GenericsTest3 {
    public static void main(String[] args) {
//        Data<String> data = new Data<>();
//        String s1 = new String("Hello");
//        data.set(s1);
//        String s2 = data.get();

        Data data = new Data("hello");
        System.out.println(data.get());
    }
}
