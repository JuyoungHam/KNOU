package com.example.project1.awsEvent;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyListener3 implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
        String item = (String) e.getItem();
        System.out.print(item + "\t");
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("SELECTED");
        } else {
            System.out.println("DESELECTED");
        }
    }
}
