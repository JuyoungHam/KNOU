package com.example.project1.generics;

public class NumberData<T extends Number> {
    private T t;

    public NumberData(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
