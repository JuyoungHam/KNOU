package com.example.project1.aws;

import java.awt.*;

public class ListTest {
    public static void main(String[] args) {
        Frame f = new Frame("LIST");
        List l = new List();
        l.add("RED");
        l.add("GREEN");
        l.add("BLUE");
        l.add("YELLOW");
        l.add("CYAN");
        f.add(l);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
