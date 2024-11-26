package org.example.homeworks.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        System.out.println("--------------- task 1 ----------------");
        int max = maxInArray();
        System.out.println(max);
        System.out.println("---------------------------------------");
        System.out.println("--------------- task 2 ----------------");
        String avg = avg();
        System.out.println(avg);
        System.out.println("---------------------------------------");
        System.out.println("--------------- task 3 ----------------");
        int countWords = countWords();
        System.out.println(countWords);
        System.out.println("---------------------------------------");

    }

    public static int maxInArray() {
        int bigVariable = Integer.MIN_VALUE;
        int[] numbers = new int[12];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) (Math.random() * 31) - 15;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            if (bigVariable < numbers[i]) {
                bigVariable = numbers[i];
            }
        }
        return bigVariable;
    }


    public static String avg() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double average1 = 0;
        double average2 = 0;
        for (int j = 0; j < array1.length; j++) {
            array1[j] = (int) (Math.random() * 6);
            average1 += (double) array1[j] / 5;
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = (int) (Math.random() * 6);
            average2 += (double) array2[j] / 5;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if (average1 > average2) {
            return "average array1 grater";
        } else if (average1 < average2) {
            return "average array2 grater";
        } else {
            return "equal";
        }
    }

    public static int countWords() {
        try(Scanner sc = new Scanner(System.in)) {
            String words = sc.nextLine();
            return words.split(" ").length;
        }
    }
}

/*
1.
Найти максимальный элемент в массиве из сгенерированных чисел

Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

2.
Среднее арифметическое элементов массива

    2.1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый

    2.2. Выведите массивы на экран в двух отдельных строках

    2.3. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
    для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

3.
Определить количество слов в веденной строке.

 */
