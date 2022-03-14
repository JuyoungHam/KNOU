package com.example.project1.lang;

public class SearchWord {
    public static void main(String[] args) {
        String s1 = "asdjekqjekjasdjfk asksljkasdfjksaj;l   d asdf as d";
        String fw, lw;

        fw = s1.substring(0, s1.indexOf(' '));
        lw = s1.substring(s1.lastIndexOf(' ') + 1, s1.length());

        System.out.println("first : " + fw);
        System.out.println("last : " + lw);
    }
}
