package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ChoiceListener implements ItemListener {

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

public class ChoiceEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("Choice");
        Choice c = new Choice();
        c.add("RED");
        c.add("BLUE");
        c.add("GREEN");
        c.addItemListener(new ChoiceListener());

        f.add(c);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
