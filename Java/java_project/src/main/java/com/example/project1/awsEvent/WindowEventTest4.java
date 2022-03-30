package com.example.project1.awsEvent;

import java.awt.*;

public class WindowEventTest4 extends Frame {
    public static void main(String[] args) {
        WindowEventTest4 f = new WindowEventTest4();
        f.addWindowListener(new MyListener2());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
