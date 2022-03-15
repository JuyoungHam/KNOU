package com.example.project1.stream;

import java.io.File;

public class MkDirTest {
    public static void main(String[] args) {
        File myFile = new File("C:\\aa\\bb");
        if (myFile.mkdirs()) {
            System.out.println("Directory was created");
        } else {
            System.out.println("Directory was not created");
        }
    }
}
