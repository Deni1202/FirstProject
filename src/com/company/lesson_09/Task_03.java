package com.company.lesson_09;

// Заполнение массива из 10 чисел, числами от 10 до 19
public class Task_03 {
    public static void main(String[] args){
        int[] array = new int[10];
        int a = 10;
        for(int i =0;i<array.length;i++){
            array[i]=a;
            System.out.println(array[i]);
            a++;
        }
    }
}
