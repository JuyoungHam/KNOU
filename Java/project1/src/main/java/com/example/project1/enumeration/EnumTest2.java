package com.example.project1.enumeration;

public class EnumTest2 {
    public static void main(String[] args) {
        BaseballTeam bt = BaseballTeam.LG;

        System.out.println(bt.win());
        System.out.println(bt.lose());
        System.out.println(bt.winsRate());
    }
}
