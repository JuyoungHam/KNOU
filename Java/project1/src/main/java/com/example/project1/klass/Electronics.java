package com.example.project1.klass;

public class Electronics {
    private int nVoltage = 0;

    public void turnOn(int nVoltage) {
        this.nVoltage = nVoltage;
    }

    public int getVoltage() {
        return nVoltage;
    }

    public void turnOff() {
        nVoltage = 0;
    }
}
