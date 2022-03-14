package com.example.project1.lang;

public class StringSearch {
    public static void main(String[] args) {
        String s1 = "ddddddajfksdjfla sdflkasjdfkjasldfjals dljaskdjfalsjajfdflkjasdlf;j;as";

        int index = -1;

        do {
            index = s1.indexOf("ajf", index + 1);
            if (index >= 0) System.out.println(index + ",");
        } while (index >= 0);

        index = s1.length();

        do {
            index = s1.lastIndexOf("ajf", index - 1);
            if (index >= 0) System.out.println(index + ",");
        } while (index >= 0);
    }
}
