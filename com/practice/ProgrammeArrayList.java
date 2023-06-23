package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static java.util.stream.Collectors.*;

public class ProgrammeArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("darshan", "patil", "pune", "mumbai", "trekking", "civil", "pure"));

        List<String> stringList = list.stream().filter(s -> s.startsWith("p")).map(String::toUpperCase).collect(toList());
        System.out.println("String start with letter P : " + stringList);

        List<String> listString = list.stream().filter(l -> !l.startsWith("p")).map(String::toUpperCase).collect(toList());
        System.out.println("String not start with letter P :  " + listString);

        List<String> sortedList = list.stream().sorted().collect(toList());
        System.out.println("List with Sorted : " + sortedList);

        long countList = list.stream().filter(c -> c.startsWith("p")).count();
        System.out.println("Count for string start with T : " + countList);

        boolean exist = list.stream().anyMatch(d -> d.startsWith("x"));
        System.out.println("String exist with letter X " + exist);
    }
}
