package com.company.lesson_09;

// Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
// Посчитать сумму элементов массива и вывести её на экран.
public class Task_07 {
    public static void main(String[] args){
        int[] list = {2, 5, 7, 8, 12};
        int sum = 0;
        for(int q = 0;q<list.length;q++){
            sum =  list[q] + sum;

        }
        System.out.println(sum);

    }
}
