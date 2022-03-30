package com.example.project1.awsEvent;

import java.awt.*;

public class ButtonTest extends Frame {
    public ButtonTest(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.setSize(400, 100);
    }

    public static void main(String[] args) {
        ButtonTest bt = new ButtonTest("ActionEvent");
        Button okBtn = new Button(ButtonLabels.OK);
        Button cancelBtn = new Button(ButtonLabels.CANCEL);
        MyListener ml = new MyListener();
        okBtn.addActionListener(ml);
        cancelBtn.addActionListener(ml);

        bt.add(okBtn);
        bt.add(cancelBtn);
        bt.setVisible(true);
    }
}
