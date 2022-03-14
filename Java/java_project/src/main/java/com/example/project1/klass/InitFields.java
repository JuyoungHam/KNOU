package com.example.project1.klass;

class InitTest {
    int nNormal1 = 10;
    int nNormal2 = 20;
    static int nStatic1 = 50;
    static int nStatic2 = 60;

    {
        nNormal1 = 30;
        nNormal2 = 40;
    }

    static {
        nStatic1 = 70;
        nStatic2 = 80;
    }

    public InitTest() {
        nNormal1 = 100;
        nNormal2 = 200;
        nStatic1 = 300;
        nStatic2 = 400;
    }
}

public class InitFields {
    public static void main(String[] args) {
        InitTest it = new InitTest();
    }
}
