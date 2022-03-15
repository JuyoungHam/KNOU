package com.example.project1.stream;

import java.io.File;

public class ListDirectory1 {
    public static void main(String[] args) {
        File file = new File("C:\\windows");
        String[] files = file.list();
        int i = 0;
        while (i < files.length) {
            System.out.println(files[i]);
            i++;
        }
    }
}
