package com.practice;

public class SecondMaxMin {

    public static void minNumber(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
        System.out.println("Second Minimum Value : " + array[1]);
    }

    public static void maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        System.out.println("Second Maximum Value : " + array[1]);
    }


    public static void main(String[] args) {

        int[] array = {25, 43, 96, 85, 24, 10, 65, 19, 12};
        minNumber(array);
        maxNumber(array);
    }
}