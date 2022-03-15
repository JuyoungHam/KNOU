package com.example.project1.stream;

import java.io.*;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            File inFile, outFile;
            inFile = new File("c:\\Java\\FileInputStreamTest.java");
            outFile = new File("c:\\Java\\FileTemp.java");

            InputStream is = new FileInputStream(inFile);
            BufferedInputStream bis = new BufferedInputStream(is);

            OutputStream os = new FileOutputStream(outFile);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            int data;
            data = bis.read();

            while (data != -1) {
                bos.write(data);
                data = bis.read();
            }

            bis.close();
            bos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
