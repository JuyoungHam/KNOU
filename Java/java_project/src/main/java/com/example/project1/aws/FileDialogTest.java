package com.example.project1.aws;

import java.awt.*;

class MyFrame3 extends Frame {
    private FileDialog fileDialog = null;

    public MyFrame3(String title) {
        super(title);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (this.fileDialog != null) putMsg(g);
    }

    @Override
    public void update(Graphics g) {
        putMsg(g);
    }

    public void setFileDialog(FileDialog fileDialog) {
        this.fileDialog = fileDialog;
    }

    private void putMsg(Graphics g) {
        g.drawString("Directory : " + fileDialog.getDirectory(), 10, 50);
        g.drawString("File : " + fileDialog.getFile(), 10, 100);
    }
}

public class FileDialogTest {
    public static void main(String[] args) {
        MyFrame3 myFrame = new MyFrame3("FileDialogTest");

        FileDialog f = new FileDialog(myFrame, "Open", FileDialog.LOAD);
        f.setVisible(true);
        myFrame.setFileDialog(f);

        myFrame.repaint();
    }
}
