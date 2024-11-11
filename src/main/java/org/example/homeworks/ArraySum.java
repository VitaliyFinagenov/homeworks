package org.example.homeworks;

import java.util.stream.IntStream;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5,2,54,12,87,454,-3,-67,0,1,-4};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];    // почемуНе result +=i
        } System.out.println(result);

        int total = IntStream.of(numbers).sum();
        System.out.println(total);
    }
}
