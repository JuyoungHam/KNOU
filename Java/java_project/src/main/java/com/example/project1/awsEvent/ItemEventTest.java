package com.example.project1.awsEvent;

import java.awt.*;

public class ItemEventTest extends Frame {
    public static void main(String[] args) {
        ItemEventTest f = new ItemEventTest();

        MyListener3 myListener3 = new MyListener3();
        f.setLayout(new FlowLayout());
        f.setSize(300, 80);

        Checkbox cb1 = new Checkbox("Whiskey");
        cb1.addItemListener(myListener3);

        Checkbox cb2 = new Checkbox("Beer");
        cb2.addItemListener(myListener3);

        f.add(cb1);
        f.add(cb2);

        CheckboxGroup group = new CheckboxGroup();
        Checkbox cb3 = new Checkbox("Yest", false, group);
        cb3.addItemListener(myListener3);
        Checkbox cb4 = new Checkbox("No", true, group);
        cb4.addItemListener(myListener3);

        f.add(cb3);
        f.add(cb4);
        f.setVisible(true);
    }
}
