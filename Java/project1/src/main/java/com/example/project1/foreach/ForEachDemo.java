package com.example.project1.foreach;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};

        for (int el : arrayOfInts) {
            System.out.print(el + " ");
        }

        System.out.println();
    }
}
