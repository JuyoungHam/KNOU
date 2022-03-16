package com.example.project1.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest3 {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\FilesTest3.java");

        Path target = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\FilesTest3Copy.txt");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}