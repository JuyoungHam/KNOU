package com.example.project1.interFace;

public class InterfaceTest {
    public static void main(String[] args) {
//        Triangle t = new Triangle(3.0, 4.0);
//        System.out.println(t.getArea());

//        Figure figure1 = new Triangle(3.0, 4.0);
//        System.out.println(figure1.getArea());
//
//        Figure figure2 = new Box(3.0, 4.0);
//        System.out.println(figure2.getArea());
//
//        Figure figure3 = new Circle(3.0);
//        System.out.println(figure3.getArea());


        Triangle t = new Triangle(3.0, 4.0);
        System.out.println(t.getArea());

        Figure f = new Triangle(4.0, 5.0);
        System.out.println(f.getArea());

        System.out.println(t.getHeight());
//        System.out.println(f.getHeight());
    }
}
