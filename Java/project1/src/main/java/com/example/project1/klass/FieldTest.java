package com.example.project1.klass;

class MyClass {
    private int nMyField = 0;

    public int getnMyField() {
        return nMyField;
    }

    public void setnMyField(int nMyField) {
        this.nMyField = nMyField;
    }
}

public class FieldTest {
    public static void main(String[] args) {
        MyClass myObject1 = new MyClass();
        MyClass myObject2 = new MyClass();

        myObject1.setnMyField(10);
        myObject2.setnMyField(20);

        System.out.println(myObject1.getnMyField());
        System.out.println(myObject2.getnMyField());
    }
}
