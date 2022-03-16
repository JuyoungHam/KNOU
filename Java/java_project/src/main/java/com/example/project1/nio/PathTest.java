package com.example.project1.nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathTest {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\windows\\system32\\drivers\\etc\\hosts");
            System.out.println("name : " + path.getFileName());
            System.out.println(path.getParent().getFileName());
            System.out.println(path.getNameCount());

            for (int i = 0; i < path.getNameCount(); i++) {
                System.out.print(path.getName(i) + "\\");
            }

            Iterator<Path> it = path.iterator();
            while (it.hasNext()) {
                System.out.print(it.next().getFileName() + "\\");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
