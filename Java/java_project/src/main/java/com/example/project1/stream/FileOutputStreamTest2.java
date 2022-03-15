package com.example.project1.stream;

import java.io.*;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        try {
            File inFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\FileOutputStreamTest2.java");

            File outFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\FileTemp.txt");

            InputStream is = new FileInputStream(inFile);
            OutputStream os = new FileOutputStream(outFile);

            int data;
            data = is.read();

            while (data != -1) {
                os.write(data);
                data = is.read();
            }

            is.close();
            os.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
