package com.example.project1.inheritance;

public class CSuper {
    private int f1;
    public int f2;

    public void setPrivate() {
        f1 = 10;
    }

    public void setPublic() {
        f2 = 20;
    }

    private void mPrivate() {
        f1 = 30;
    }
}

class CSub extends CSuper {
    private int f3;
    public int f4;
}