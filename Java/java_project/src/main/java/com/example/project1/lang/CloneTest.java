package com.example.project1.lang;

class Box implements Cloneable {
    private int width, height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class CloneTest {
    public static void main(String[] args) {
        Box b1 = new Box(20, 30);
        Box b2 = (Box) b1.clone();

        System.out.println(b2.getWidth());
        System.out.println(b2.getHeight());
    }
}
