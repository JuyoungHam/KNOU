package com.example.project1.nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class TransformTest {
    public static void main(String[] args) {
        String[] data = {"안녕하세요, 여러분,", "ㅁㄴㅇㄻㄴㅇㄻㄴㅇ"};
        Charset cs = Charset.defaultCharset();
        ByteBuffer buffer;

        for (int i = 0; i < data.length; i++) {
            buffer = cs.encode(data[i]);
            System.out.println(cs.decode(buffer));
        }
    }
}
