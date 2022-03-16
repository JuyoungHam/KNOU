package com.example.project1.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest1 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\FilesTest1.java");
        System.out.println("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\FilesTest1.java");

        if (Files.isDirectory(path)) System.out.println("directory");
        if (Files.isRegularFile(path)) System.out.println("usual file");

        System.out.println("size : " + Files.size(path));
        System.out.println("owner : " + Files.getOwner(path).getName());

        if (Files.isHidden(path)) System.out.println("hidden");
        if (Files.isReadable(path)) System.out.println("readable");
        if (Files.isWritable(path)) System.out.println("writable");

        System.out.println("last modify time : " + Files.getLastModifiedTime(path));
    }
}
