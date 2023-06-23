package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add("E");
        list.add("E");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
        list1.removeAll(Arrays.asList("B","D"));
        System.out.println(list1);
    }
}
