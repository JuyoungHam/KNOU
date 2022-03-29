package com.example.project1.aws;

import java.awt.*;

class MyFrame2 extends Frame {
    public MyFrame2(String title) {
        super(title);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello AWT", 150, 150);
    }
}

public class HelloAWT2 {
    public static void main(String[] args) {
        MyFrame2 myFrame = new MyFrame2("Hello AWT");
    }
}
