package com.example.project1.inheritance;

class CSuper3 {
    public double x;

    public CSuper3(double x) {
        this.x = x * 10;
    }
}

class CSub3 extends CSuper3 {
    double x;

    public CSub3(double x) {
        super(x);
        this.x = x;
    }

    public double getSuper() {
        return super.x;
    }

    public double getSub() {
        return this.x;
    }
}

public class ThisSuperTest2 {
    public static void main(String[] args) {
        CSub3 sub = new CSub3(10.1);

        System.out.println(sub.x);
        System.out.println(sub.getSuper());
        System.out.println(sub.getSub());
    }
}
