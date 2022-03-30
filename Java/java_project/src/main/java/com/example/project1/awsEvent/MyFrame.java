package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title);
        this.setSize(400, 300);
        this.setVisible(true);
//        this.addWindowListener(new MyListener());

        WindowListener listener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        this.addWindowListener(listener);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello AWT", 150, 150);
    }
}
