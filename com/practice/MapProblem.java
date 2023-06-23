package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MapProblem {
    public static void main(String[] args) {

        String[] strings = {"darshan", "sanjay", "darshan", "patil", "pune", "patil"};

        Map<String, Integer> map = new HashMap<>();


        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
    }
}
