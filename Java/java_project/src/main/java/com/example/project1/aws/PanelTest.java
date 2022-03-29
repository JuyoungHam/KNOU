package com.example.project1.aws;

import java.awt.*;

public class PanelTest extends Frame {
    Label msg = null;
    Panel msgPanel = null;
    Panel commandPanel = null;

    Button yesButton = null;
    Button noButton = null;
    Button cancelButton = null;

    public PanelTest() {
        setTitle("Panel Test");
        msgPanel = new Panel();
        commandPanel = new Panel();

        msg = new Label("Hello?");
        msg.setEnabled(false);
        msgPanel.add(msg);

        yesButton = new Button("yes");
        noButton = new Button("no");
        cancelButton = new Button("cancel");

        commandPanel.add(yesButton);
        commandPanel.add(noButton);
        commandPanel.add(cancelButton);

        add("Center", msgPanel);
        add("South", commandPanel);

        setSize(300, 100);
    }

    public static void main(String[] args) {
        PanelTest pt = new PanelTest();
        pt.setVisible(true);
    }
}
