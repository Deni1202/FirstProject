package com.company.lesson_09;

/*
 Заполнение массива из 10 чисел, числами от 1 до 10
*/
public class Task_01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
                array[i] = j;
                System.out.println(array[i]);
                j++;

        }

    }
}
