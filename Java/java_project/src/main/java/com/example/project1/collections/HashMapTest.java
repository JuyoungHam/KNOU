package com.example.project1.collections;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//
//        map.put("mon", "monday");
//        map.put("tue", "tuesday");
//

        List<String> names = new ArrayList<>();
        Map<String, Integer> lectures;
        Map<String, Map> scores = new HashMap<>();

        names.add("kcs");
        names.add("lmh");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("kcs")) {
                lectures = new HashMap<>();
                lectures.put("kor", 100);
                lectures.put("eng", 95);
                lectures.put("mat", 80);
                scores.put(name, lectures);
            } else if (name.equals("lmh")) {
                lectures = new HashMap<>();
                lectures.put("kor", 90);
                lectures.put("eng", 95);
                lectures.put("mat", 95);
                scores.put(name, lectures);
            }
        }

        Iterator<String> it2 = names.iterator();
        while (it2.hasNext()) {
            String name = it2.next();
            System.out.println(name);
            System.out.println("kor : " + scores.get(name).get("kor"));
            System.out.println("eng : " + scores.get(name).get("eng"));
            System.out.println("mat : " + scores.get(name).get("mat"));
        }
    }
}
