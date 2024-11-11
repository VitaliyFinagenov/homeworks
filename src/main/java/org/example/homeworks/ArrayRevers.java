package org.example.homeworks;

import java.util.Arrays;

public class ArrayRevers {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] reverseNumbers = new int[numbers.length];
        for (int i = numbers.length-1, j = 0; i >= 0;i--, j++) {
                reverseNumbers[j] = numbers[i];
            }
        System.out.println(Arrays.toString(reverseNumbers));

//        for (int i = 0; i < numbers.length / 2; i++) {
//            int tmp = numbers[i];
//            numbers[i] = numbers[numbers.length - i - 1];
//            numbers[numbers.length - i - 1] = tmp;
//        }
//        System.out.println(Arrays.toString(numbers));

    }
}
