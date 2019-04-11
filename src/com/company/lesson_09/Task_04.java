package com.company.lesson_09;

// Заполнение массива из 10 чисел, числами от 29 до 20
public class Task_04 {
    public static void main(String[] args){
        int[] array = new int[10];
        int s =29;
        for(int j =0; j<=array.length;j++){
            array[j] = s;
            System.out.println(array[j]);
            s--;
        }
    }
}
