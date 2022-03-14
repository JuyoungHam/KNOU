package com.example.project1.exceptions;

class MyClass {
    public void testFunc(int x) throws MyException {
        if (x > 10) throw new MyException();
    }
}

public class MyExceptionTest {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        try {
            mc.testFunc(20);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
