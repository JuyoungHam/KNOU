package com.example.project1.stream;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File myFile = new File("C:\\windows\\notepad.exe");
        System.out.println(myFile.getName());
        System.out.println(myFile.getPath());
        System.out.println(myFile.length());
    }
}
