package com.example.project1.exceptions;

import java.io.IOException;

class CharInput {
    int input = 0;

    public char getInput() {
        try {
            this.input = System.in.read();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return (char) this.input;
    }
}

public class ExceptionTest3 {
    public static void main(String[] args) {
        CharInput charInput = new CharInput();
        System.out.println(charInput.getInput());
    }
}
