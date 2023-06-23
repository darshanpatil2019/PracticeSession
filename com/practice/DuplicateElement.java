package com.practice;

public class DuplicateElement {
    public static void main(String[] args) {

        String string =("MUMBAI");

        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1 ; j < string.length(); j++) {
                if (string.charAt(j) == string.charAt(i)){
                    System.out.println("Repeated Element in String : " + string.charAt(j));
                }
            }
        }
    }
}
