package com.example.project1.inheritance;

import com.example.project1.klass.Electronics;

public class TV extends Electronics {
    private int nSize = 0;

    public void setSize(int new_size) {
        this.nSize = new_size;
    }

    public int getSize() {
        return nSize;
    }
}
