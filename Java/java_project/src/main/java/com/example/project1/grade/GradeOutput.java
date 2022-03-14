package com.example.project1.grade;

public class GradeOutput {
    public static void main(String[] args) {
        Grade g1, g2;
        g1 = new Grade();
        g2 = new Grade();

//        g1.eng = 90;
//        g1.mat = 85;
//        g2.eng = 80;
//        g2.mat = 80;

        g1.inputGrade(90, 85);
        g2.inputGrade(80, 80);

        g1.outputGrade();
        g2.outputGrade();
    }
}
