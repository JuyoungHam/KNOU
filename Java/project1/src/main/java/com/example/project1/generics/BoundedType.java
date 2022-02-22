package com.example.project1.generics;

public class BoundedType {
    public static void main(String[] args) {
        NumberData<Integer> data = new NumberData<>(20);
        System.out.println(data.get());
    }
}
