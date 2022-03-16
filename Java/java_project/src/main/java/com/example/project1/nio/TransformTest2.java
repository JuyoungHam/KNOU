package com.example.project1.nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class TransformTest2 {
    public static void main(String[] args) {
        String[] data = {"한국어 한국어", "한국어 한국어", "한국어 한국어", "한국어 한국어", "한국어 한국어"};

        Charset cs = Charset.defaultCharset();
        ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);

        for (int i = 0; i < data.length; i++) {
            ByteBuffer tmp = cs.encode(data[i]);
            buffer = buffer.put(tmp);
        }

        byte[] b_total = new byte[buffer.flip().limit()];
        int index = 0;

        while (buffer.position() < buffer.limit()) {
            byte b = buffer.get();
            Arrays.fill(b_total, index, index + 1, b);
            index++;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(cs.decode(ByteBuffer.wrap(b_total)));
        System.out.println(sb);
    }
}
