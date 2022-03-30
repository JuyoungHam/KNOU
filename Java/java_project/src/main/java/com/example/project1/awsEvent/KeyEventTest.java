package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyKeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println(KeyEvent.getKeyText(keyCode));
    }
}

public class KeyEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("KeyEvent");
        KeyListener kl = new MyKeyListener();
        f.addKeyListener(kl);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
