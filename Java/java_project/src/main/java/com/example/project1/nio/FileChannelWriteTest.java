package com.example.project1.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteTest {
    public static void main(String[] args) throws IOException {
        String[] data = {"안녕하세요", "안녕하세요", "안녕하세요", "안녕하세요"};
        Path path = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\file.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        Charset charset = Charset.defaultCharset();
        ByteBuffer buffer;
        int byteCount = 0;
        for (int i = 0; i < data.length; i++) {
            buffer = charset.encode(data[i]);
            byteCount = fileChannel.write(buffer);
        }

        System.out.println(byteCount);
        fileChannel.close();
    }
}
