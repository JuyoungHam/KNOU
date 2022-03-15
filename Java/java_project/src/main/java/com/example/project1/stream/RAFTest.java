package com.example.project1.stream;

import java.io.RandomAccessFile;

public class RAFTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf;
            raf = new RandomAccessFile("C:\\Java\\test.txt", "rw");
            for (int i = 0; i < 10; i++) raf.write(i);

            for (int i = 9; i >= 0; i--) {
                raf.seek(i);
                System.out.print(raf.read());
            }

            raf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
