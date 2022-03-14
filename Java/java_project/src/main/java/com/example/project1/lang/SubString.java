package com.example.project1.lang;

public class SubString {
    public static void main(String[] args) {
        String s1 = "ahlkasjl;fjdlsajdkljfalks ejkfjaskljdflkas sadljdfklasjdlfkjaskljfdklasjdlfkjals;jdfklajsdlkfjaslkjdfklasjdkljk;lskjdkjfl";


        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == ' ') System.out.print("_");
            else System.out.print(ch);
        }
    }
}
