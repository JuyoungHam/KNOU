package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

//public class MyListener implements WindowListener {
//    @Override
//    public void windowOpened(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.exit(0);
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//
//    }
//}

//public class MyListener extends WindowAdapter {
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.exit(0);
//    }
//}

//public class MyListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (ButtonLabels.OK.equals(e.getActionCommand())) {
//            System.out.println("OK has been pressed!");
//        } else if (ButtonLabels.CANCEL.equals(e.getActionCommand())) {
//            System.out.println("Cancel has been pressed!");
//        }
//    }
//}

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}