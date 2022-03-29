package com.example.project1.aws;

import java.awt.*;

public class ChoiceTest {
    public static void main(String[] args) {
        Frame f = new Frame("Choice");
        Choice c = new Choice();

        c.add("RED");
        c.add("BLUE");
        c.add("GREEN");
        f.add(c);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
