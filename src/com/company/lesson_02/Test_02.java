package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    ¬вести с клавиатуры два числа, вывести на экран минимальное из них.
*/
public class Test_02{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        if (n<m){
            System.out.println(n);
        } else{
            System.out.println(m);
        }
    }
}
