package com.example.project1.generics;

public class Data<T> {
    private T t;

    public Data() {
        super();
    }

    public Data(T t) {
        this.t = t;
    }


    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
