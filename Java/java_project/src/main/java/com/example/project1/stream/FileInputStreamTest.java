package com.example.project1.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\FileInputStreamTest.java");
            InputStream is = new FileInputStream(file);
            int data = is.read();

            while (data != -1) {
                System.out.write(data);
                data = is.read();
            }

            is.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
