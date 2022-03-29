package com.example.project1.aws;

import java.awt.*;

class MyCanvas extends Canvas {
    Color color;

    public MyCanvas(Color color) {
        this.color = color;
        setBackground(color);
        setSize(60, 60);
    }

    @Override
    public void paint(Graphics g) {
        setBackground(color);
    }
}

public class CanvasTest {
    public static void main(String[] args) {
        Frame f = new Frame("Canvas");
        f.setLayout(new FlowLayout());
        f.add(new MyCanvas(Color.red));
        f.add(new MyCanvas(Color.green));
        f.add(new MyCanvas(Color.blue));
        f.add(new MyCanvas(Color.orange));
        f.add(new MyCanvas(Color.magenta));
        f.add(new MyCanvas(Color.pink));
        f.add(new MyCanvas(Color.yellow));
        f.add(new MyCanvas(Color.cyan));
        f.add(new MyCanvas(Color.black));
        f.add(new MyCanvas(Color.gray));
        f.setSize(350, 180);
        f.setVisible(true);
    }
}
