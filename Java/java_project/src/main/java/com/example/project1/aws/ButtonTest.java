package com.example.project1.aws;

import java.awt.*;

public class ButtonTest extends Frame {
    public ButtonTest(String title) {
        super(title);
        this.setSize(400, 300);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonTest bt = new ButtonTest("Buttons");
        bt.setLayout(null);

        Button okBtn = new Button("OK");
        okBtn.setBounds(10, 240, 50, 50);
        okBtn.setVisible(true);
        bt.add(okBtn);

        Button cancelBtn = new Button("CANCEL");
        cancelBtn.setBounds(70, 240, 50, 50);
        cancelBtn.setVisible(true);
        cancelBtn.setEnabled(false);
        bt.add(cancelBtn);
    }
}
