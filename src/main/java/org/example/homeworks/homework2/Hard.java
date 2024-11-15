package org.example.homeworks.homework2;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        deposit();
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float money = sc.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int month = sc.nextInt();
        float resultMoney = money;
        for (int i = 0; i < month; i++) {
            resultMoney = (float) (resultMoney + (resultMoney * 0.07));
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", month, resultMoney);
    }
}

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.

Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

Пример работы программы:

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,000000
 */