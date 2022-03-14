package com.example.project1.exceptions;

public class MyException extends Exception {
    public MyException() {
        super();
    }

    @Override
    public String toString() {
        return "MyException";
    }
}
