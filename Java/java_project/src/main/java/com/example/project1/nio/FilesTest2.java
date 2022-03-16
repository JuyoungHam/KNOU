package com.example.project1.nio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1");

        DirectoryStream<Path> ds = Files.newDirectoryStream(path);

        for (Path p : ds) {
            if (Files.isDirectory(p)) {
                System.out.println("[directory] " + p.getFileName());
            } else {
                System.out.print("[file] " + p.getFileName());
                System.out.println("\t(" + Files.size(p) + ")");
            }
        }
    }
}
