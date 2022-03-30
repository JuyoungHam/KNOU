package com.example.project1.awsEvent;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckMenuListener implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.print(e.getItem() + "\t");

        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("SELECTED");
        } else {
            System.out.println("DESELECTED");
        }
    }
}
