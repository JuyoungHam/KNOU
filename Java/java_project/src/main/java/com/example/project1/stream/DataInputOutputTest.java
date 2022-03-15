package com.example.project1.stream;

import java.io.*;

public class DataInputOutputTest {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\data.txt");
            DataOutputStream dos = new DataOutputStream(os);

            dos.writeUTF("Hello");
            dos.writeInt(100);
            dos.writeDouble(3.14);
            dos.flush();
            dos.close();

            InputStream is = new FileInputStream("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\stream\\data.txt");
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            dis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
