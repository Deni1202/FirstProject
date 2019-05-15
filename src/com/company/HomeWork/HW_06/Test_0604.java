package com.company.HomeWork.HW_06;

/*
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_0604 {
    public static void main(String[] args) throws IOException {
        result(sorting(allNumbers()));
    }
    private static int[]allNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] allNumbers = new int[10];
        for(int i = 0; i<allNumbers.length;i++){
            allNumbers[i]= Integer.parseInt(reader.readLine());
        }
        return allNumbers;
    }
    private static int[]sorting(int[]allNumbers){
        int a = 0;
        for(int b = 0;b<allNumbers.length;b++){
            for(int d = 0;d<allNumbers.length -1-b;d++) {
                if (allNumbers[d] < allNumbers[d + 1]) {
                    a = allNumbers[d];
                    allNumbers[d] = allNumbers[d + 1];
                    allNumbers[d + 1] = a;
                }
            }
        }
        return allNumbers;
    }
    private static void result(int[] allNumbers){
        for(int c = 0;c<5;c++){
            System.out.println(allNumbers[c]);
        }
    }
}