package com.example.project1.interFace;

public class Test5 {
    public static void main(String[] args) {
        Movable movable;
        Scalable scalable;

        Point point = new Point();
        movable = point;
//        movable.mul(3.0);

        scalable = point;
//        scalable.add(3.0, 3.0);
        point.mul(3.0);
        point.add(3.0, 3.0);
    }
}
