package com.example.project1.stream;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws IOException {
        CharArrayWriter dest = new CharArrayWriter();
        PrintWriter pw = new PrintWriter(dest);
        pw.print(10);
        pw.print('+');
        pw.print(2.0);
        pw.print('=');
        pw.print(10 + 2.0);
        pw.println();
        pw.flush();
        System.out.println(dest.toString());
        pw.close();
    }
}
