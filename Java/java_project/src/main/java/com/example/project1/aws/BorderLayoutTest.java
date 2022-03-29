package com.example.project1.aws;

import java.awt.*;

public class BorderLayoutTest extends Frame {
    private Scrollbar s1, s2;

    public BorderLayoutTest() {
        super("BorderLayout");
        setSize(300, 300);
        setLayout(new BorderLayout(10, 10));
        Label eastLabel = new Label("EAST", Label.CENTER);
        eastLabel.setBackground(Color.red);


        Label westLabel = new Label("WEST", Label.CENTER);
        westLabel.setBackground(Color.blue);


        Label southLabel = new Label("SOUTH", Label.CENTER);
        southLabel.setBackground(Color.green);

        Label northLabel = new Label("NORTH", Label.CENTER);
        northLabel.setBackground(Color.yellow);

        Label centerLabel = new Label("CENTER", Label.CENTER);
        centerLabel.setBackground(Color.gray);

        add(eastLabel, BorderLayout.EAST);
        add(southLabel, BorderLayout.SOUTH);
        add(westLabel, BorderLayout.WEST);
        add(northLabel, BorderLayout.NORTH);
        add(centerLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Frame f = new BorderLayoutTest();
        f.setVisible(true);
    }
}
