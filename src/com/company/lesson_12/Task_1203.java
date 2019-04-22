package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1203 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        ArraySorting(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void ArraySorting(int[] array) {
        for (int a = 0; a < array.length; a++) {
            int min = array[a];
            int minA = a;
            for (int b = a + 1; b < array.length; b++) {
                if (array[b] < min) {
                    min = array[b];
                    minA = b;
                }
            }
            if (a != minA) {
                int change = array[a];
                array[a] = array[minA];
                array[minA] = change;
            }
        }

    }
}
