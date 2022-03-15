package com.example.project1.stream;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberTest {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\LineNumberTest.java");
            FileReader fr = new FileReader(file);
            LineNumberReader rd = new LineNumberReader(fr);

            String line;

            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
