package org.example.homeworks.homework2;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        System.out.println("------------- Задача 1 -------------");
        multiplyTable();
        System.out.println("------------------------------------");
        System.out.println("\n------------- Задача 2 -------------");
        sumNumbers();
        System.out.println("------------------------------------");
        System.out.println("\n------------- Задача 3 -------------");
        subsequence();
        System.out.println("------------------------------------");


    }

    public static void multiplyTable() {
//        int b = 0;
//        int result = 0;
//        for (int i = 1, j = 1; j < 10; i++) {
//            b = i;
//            result = j * b;
//            if (i > 9) {
//                j++;
//                i = 1;
//                continue;
//            }
//            System.out.println(j + " * " + b + " = " + result);
//        }

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }

    public static void sumNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        System.out.println(a);
    }

    public static void subsequence() {
        int a = 1;
        while (a != 256) {
            a = a * 2;
            System.out.print(a + " ");
        }
    }
}


/*
задача 1: (цикл for)
вывести на экран таблицу умножения в виде:
1 * 1 = 1
1 * 2 = 2
. . . . .
9 * 8 = 72
9 * 9 = 81
-----------------------------------------------------
задача 2: (цикл for)
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.

Например:

если пользователь введет число 3.
Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.

если пользователь введет число 5.
Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.
------------------------------------------------------

задача 3: (цикл while)
Необходимо, чтоб программа выводила на экран вот такую последовательность:

1 2 4 8 16 32 64 128 256 512
---------------------------------------------------------
 */