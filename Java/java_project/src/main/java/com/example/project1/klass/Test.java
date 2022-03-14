package com.example.project1.klass;

class TV {
    private int nSize = 0;

    public TV() {
        nSize = 20;
    }

    public TV(int nNewSize) {
        this.nSize = nNewSize;
    }
}

public class Test {
    public static void main(String[] args) {
        TV tv1 = new TV(10);
        TV tv2 = new TV();
    }
}
