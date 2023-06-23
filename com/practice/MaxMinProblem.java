package com.practice;

public class MaxMinProblem {
    public static void main(String[] args) {

        int[] array = {25, 75, 96, 31, 24, 78, 69};
        int max = array[0];
        int min = array[0];

        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("Maximum Value in Array : " + max);

        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Minimum Value in Array : " + min);
    }
}
