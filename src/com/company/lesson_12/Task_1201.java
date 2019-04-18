package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в убывающем порядке.
*/
public class Task_1201 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private static void sort(int[] arr){
        for(int c = 0; c<arr.length;c++){
            for(int b = 0; b<arr.length - 1 - c;b++){
                if(arr[b]<arr[b+1]) {
                    int num = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = num;
                }
            }
        }
    }


      }
