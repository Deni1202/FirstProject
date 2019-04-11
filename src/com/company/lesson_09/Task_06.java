package com.company.lesson_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Ввести 5 чисел с клавиатуры и записать их в массив
// Вывести содержимое массива в консоль

public class Task_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for(int i = 0; i<array.length;i++){
            int s = Integer.parseInt(reader.readLine());
            array[i] = s;
        }
        for(int j = 0; j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}
