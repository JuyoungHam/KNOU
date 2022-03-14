package com.example.project1.lambda;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Student student = new Student("Kim", 2);

        Function<Student, String> function1 = s -> {
            return s.getName();
        };

        Function<Student, Integer> function2 = s -> {
            return s.getYear();
        };

        System.out.println(function1.apply(student));
        System.out.println(function2.apply(student));
    }
}
