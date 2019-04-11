package com.company.lesson_09;

// Заполнение массива из 10 чисел, числами от 10 до 1
public class Task_02 {
    public static void main(String[] args){
        int[]array = new int[10];
        int j = 10;
        for(int i = 0;i<array.length;i++){
           array[i] =j;
           System.out.println(array[i]);
          j--;
        }
    }
}
