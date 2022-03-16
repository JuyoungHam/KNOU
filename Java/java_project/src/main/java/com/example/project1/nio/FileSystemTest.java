package com.example.project1.nio;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class FileSystemTest {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystems.getDefault();

        for (FileStore store : fs.getFileStores()) {
            System.out.println("driver's name : " + store.name());
            System.out.println("file system : " + store.type());

            long total = store.getTotalSpace();
            long free = store.getUnallocatedSpace();
            System.out.println("total storage : " + total + " bytes");
            System.out.println("used storage  : " + (total - free) + " bytes");
            System.out.println("available storage : " + free + " bytes");
            System.out.println();
        }
    }
}
