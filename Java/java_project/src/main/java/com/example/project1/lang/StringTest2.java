package com.example.project1.lang;

public class StringTest2 {
    public static void main(String[] args) {
        final String tmp = "abcd";
        long start;
        long end;
        int tryCnt = 100000;

        String str = new String();
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        start = System.nanoTime();
        for (int i = 0; i < tryCnt; i++) str = str + tmp;
        end = System.nanoTime();
        System.out.println("String : " + ((end - start) / 1000000.0) + " msecs");

        start = System.nanoTime();
        for (int i = 0; i < tryCnt; i++) sb.append(tmp);
        end = System.nanoTime();
        System.out.println("buffer : " + ((end - start) / 1000000.0) + " msecs");

        start = System.nanoTime();
        for (int i = 0; i < tryCnt; i++) sb2.append(tmp);
        end = System.nanoTime();
        System.out.println("builder : " + ((end - start) / 1000000.0) + " msecs");
    }
}
