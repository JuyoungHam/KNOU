package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        Point p = e.getPoint();
        String btn = null;
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                btn = "Left Button";
                break;
            case MouseEvent.BUTTON2:
                btn = "Middle Button";
                break;
            case MouseEvent.BUTTON3:
                btn = "Right Button";
                break;
        }

        System.out.println("Mouse " + btn + " clicked : " + p);
    }
}

public class MouseEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent");
        MouseListener ml = new MyMouseListener();
        f.addMouseListener(ml);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
