package com.example.project1.generics;

public class MultipleType {
    public static void main(String[] args) {
//        Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
//        Pair<String, String> p2 = new OrderedPair<>("hello", "java");
//
//        System.out.println(p1.getKey());
//        System.out.println(p1.getValue());
//        System.out.println(p2.getKey());
//        System.out.println(p2.getValue());

        Pair<String, Data<Integer>> p1 = new OrderedPair<>("Even", new Data<>(8));

        System.out.println(p1.getKey());
        System.out.println(p1.getValue().get());
    }
}
