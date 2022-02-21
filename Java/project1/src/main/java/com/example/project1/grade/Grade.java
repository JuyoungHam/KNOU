package com.example.project1.grade;

public class Grade {
    int eng;
    int mat;

    void inputGrade(int eng, int mat) {
        this.eng = eng;
        this.mat = mat;
    }

    void outputGrade() {
        System.out.println(eng + mat);
    }
}
