package com.practice;

public class CharacterCount {
    public static void main(String[] args) {

        String str = "Ramram";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'r') {
                count++;
            }
        }
        System.out.println("Count of R in string is : " + count);
    }
}
