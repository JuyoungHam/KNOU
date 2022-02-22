package com.example.project1.interFace;

import com.example.project1.inheritance.TV;
import com.example.project1.klass.Electronics;

public class Test4 {
    public static void main(String[] args) {
        Electronics elec;
        TV tv = new TV();
        elec = tv;

//        elec.getSize();
        tv.getSize();
    }
}

