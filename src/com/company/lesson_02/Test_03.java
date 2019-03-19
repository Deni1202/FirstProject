package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Ввести с клавиатуры три числа, вывести на экран максимальное из них.
 */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        if (n>m && n>k){
            System.out.println(n);
        }else if (m>n && m>k){
            System.out.println(m);

        }else if(k>n && k>m){
            System.out.println(k);
        }

    }
}
