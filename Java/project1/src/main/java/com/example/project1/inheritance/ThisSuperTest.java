package com.example.project1.inheritance;

class CSuper2 {
    public double x;
}

class CSub2 extends CSuper2 {
    public double x;

    public CSub2(double x) {
        this.x = x;
        super.x = x * 10;
    }

    public double getSuper() {
        return super.x;
    }

    public double getSub() {
        return this.x;
    }
}

public class ThisSuperTest {
    public static void main(String[] args) {
        CSub2 sub = new CSub2(10.1);

        System.out.println(sub.x);
        System.out.println(sub.getSuper());
        System.out.println(sub.getSub());
    }
}
