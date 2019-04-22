package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        for (int c = 0; c < arr.length; c++) {
            for (int b = 0; b < arr.length - 1; b++) {
                if (arr[b] < arr[b + 1]) {
                    int d = arr[b];
                    arr[b] = d;
                    b++;


                }
            }
        }
    }
}
