package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Разделение списка на два — чётных и нечётных чисел
 Создать список чисел и заполнить его с консоли
 Разбить список на два других:
 - в первый список сохранять чётные числа
 - во второй список сохранять нечётные числа
 Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/

public class Task_1404 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> bigList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> notEvenList = new ArrayList<>();

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == 0) {
                break;
            }
            bigList.add(a);

        }
        for (int i = 0; i < bigList.size(); i++) {
            System.out.print(bigList.get(i));
        }
        for (int i = 0; i < bigList.size(); i++) {
            if ((bigList.get(i) % 2) == 0) {
                evenList.add(bigList.get(i));
            }
        }

        for (Integer integer : evenList) {
            System.out.println(integer);
        }
    }
}


