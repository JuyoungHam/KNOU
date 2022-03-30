package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.WindowEvent;

public class MyListener2 extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        Window w = e.getWindow();
        w.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Deactivated");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }
}
