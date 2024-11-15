package org.example.homeworks.homework2;

public class Medium {
    public static void main(String[] args) {
//        fibonacci();
        for (int i = 1; i < 13; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static void fibonacci() {
        int num0 = 0;
        int num1 = 1;
        int num;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i < 12; i++) {
            num = num0 + num1;
            System.out.print(num + " ");

            num0 = num1;
            num1 = num;
        }
    }

    public static int fibonacciRecursion(int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
        }
    }
}
/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:

первый и второй члены последовательности равны единицам
а каждый следующий — сумме двух предыдущих
То есть числа Фибоначчи - это 0 1  1  2  3  5  8  13  21  34  55  89  и т.д.
 */
