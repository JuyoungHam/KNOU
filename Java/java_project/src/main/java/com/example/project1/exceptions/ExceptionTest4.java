package com.example.project1.exceptions;

import java.io.IOException;

class CharInput2 {
    int input = 0;

    public char getInput() throws IOException {
        this.input = System.in.read();
        return (char) this.input;
    }
}

public class ExceptionTest4 {
    public static void main(String[] args) {
        CharInput2 charInput = new CharInput2();
        try {
            System.out.println(charInput.getInput());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
