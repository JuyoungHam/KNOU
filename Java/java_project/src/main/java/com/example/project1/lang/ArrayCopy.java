package com.example.project1.lang;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int src[] = {1, 2, 3, 4, 5};
        int tar[] = new int[src.length];
        System.arraycopy(src, 0, tar, 0, src.length);
        Arrays.stream(tar).forEach(o -> {
            System.out.println(o);
        });
    }
}
