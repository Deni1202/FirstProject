package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
public class Task_1001 {
    public static void main(String[] args) throws IOException {
        System.out.println(max(nitializeArray()));
    }
    public static int[] nitializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = Integer.parseInt(reader.readLine());

        }
        return numbers;
    }

    public static int max(int[] array) throws IOException {
        int max = array[0];
        for(int a = 0;a<array.length;a++){
            if(max<array[a]){
                max = array[a];
            }
        }
        return max;
    }

}

