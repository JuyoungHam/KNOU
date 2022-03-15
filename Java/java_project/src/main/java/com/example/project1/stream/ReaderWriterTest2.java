package com.example.project1.stream;

import java.io.*;

public class ReaderWriterTest2 {
    public static void main(String[] args) {
        try {
            File inFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\ReaderWriterTest2.java");
            File outFile = new File("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\FileTemp.txt");

            Reader rd = new FileReader(inFile);
            BufferedReader br = new BufferedReader(rd);

            Writer wd = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(wd);

            int data = br.read();

            while (data != -1) {
                bw.write(data);
                data = br.read();
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
