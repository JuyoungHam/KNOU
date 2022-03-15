package com.example.project1.stream;

import java.io.*;

public class ReaderWriterTest {
    public static void main(String[] args) {
        try {
            File inFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\ReaderWriterTest.java");
            File outFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\FileTemp.txt");

            Reader rd = new FileReader(inFile);
            Writer wd = new FileWriter(outFile);
            int data = rd.read();

            while (data != -1) {
                wd.write(data);
                data = rd.read();
            }

            wd.close();
            rd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
