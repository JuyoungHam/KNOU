package com.example.project1.enumeration;

public class EnumTest1 {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println(day);

        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println("Weekend");
        } else {
            System.out.println("WeekDay");
        }

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
