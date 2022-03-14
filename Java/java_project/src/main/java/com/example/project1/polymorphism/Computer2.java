package com.example.project1.polymorphism;

public class Computer2 {
    int memoryCapacity;
    int hddcCapacity;
    boolean isPowered = false;
    void powerOn(){
        this.isPowered = true;
    }

    void powerOff(){
        this.isPowered = false;
    }
}
