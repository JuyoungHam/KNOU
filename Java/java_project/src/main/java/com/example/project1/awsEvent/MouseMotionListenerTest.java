package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

class MyMouseMotionListener extends MouseMotionAdapter {
    @Override
    public void mouseMoved(MouseEvent e) {
        Point p = e.getPoint();
        System.out.println("Mouse is : " + p);
    }
}

public class MouseMotionListenerTest {
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent");
        MouseMotionListener ml = new MyMouseMotionListener();
        f.addMouseMotionListener(ml);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
