package com.practice;

public class PrimeNumber {
    public static void main(String[] args) {

        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
