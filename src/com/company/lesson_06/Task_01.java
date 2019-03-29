package com.company.lesson_06;

/*
 * 1) Пользователь вводит число от 1 до 4
 * 2) Если число не входит в диапазон от 1 до 4 - выводим сообщение "Неверное число!"
 * 3) Иначе вызываем соответсвующий метод:
 *  - если пользователь ввел 1, то отрабатывает метод subt, который должен вычесть второе число из первого,
 *  числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 2, то отрабатывает метод sum, который должен найти сумму двух чисел,
 *  которые пользователь должен ввести дополнительно
 *  - если пользователь ввел 3, то отрабатывает метод multy, который должен  умножить первое число на второе,
 *  числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 4, то отрабатывает метод div, который должен поделить два числа,
 *  которые пользователь должен ввести дополнительно
 * 4) После того, как один из методов отработал, выводим пользователю результат
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());


        if (a > 1 && a < 4) {
            System.out.println("Число не верное");
        }
        if (a == 1) {
            System.out.println("Вводим два числа и производим вычитание: ");
            int c = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(subt(b,c));

        }
        if (a == 2) {
            System.out.println("Вводим два числа и производим вычитание: ");
            int c = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(sum(b,c));

        }
        if (a == 3) {
            System.out.println("Вводим два числа и производим умножение: ");
            int c = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(multi(b,c));
        }
        if (a == 4) {
            System.out.println("Вводим два числа и производим деление: ");
            int c = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(div(b,c));

        }
    }

    public static int subt(int b , int c) throws IOException {
        return b - c;
    }

    public static int sum(int b , int c) throws IOException {

        return b + c;
    }

    public static int multi(int b, int c) throws IOException {
        return b * c;
    }

    public static double div(double b, double c) throws IOException {
        return b / c;
    }
}