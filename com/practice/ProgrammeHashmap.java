package com.practice;

import java.util.HashMap;

public class ProgrammeHashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> userdata = new HashMap<>();
        userdata.put(1,"darshan");
        userdata.put(2,"darsha");
        userdata.put(3,"darsh");
        userdata.put(4,"dars");
        userdata.put(5,"dar");
        userdata.put(6,"da");
        userdata.put(7,"d");
        System.out.println(userdata);

        userdata.put(1,"dimpal");
        System.out.println(userdata);

        System.out.println(userdata.get(1));
        System.out.println(userdata.size());
        System.out.println(userdata.isEmpty());
        userdata.replace(4,"dars","patil");
        System.out.println(userdata);
        userdata.remove(7);
        System.out.println(userdata);
    }
}
