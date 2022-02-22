package com.example.project1.generics;

public class MyPair implements Pair<String, Integer> {
    private String key;
    private Integer value;

    public MyPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
