package com.company.lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
//Реализовать метод closeToTen.
//Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
// аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
//Если оба числа на равной длине к 10, то вывести на экран любое из них.
*/
public class Task_02 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());
       closeToTen(a , b);
    }
    public static void closeToTen(int a, int b){
        int c = (a - 10)* (a - 10);
        int d = (b - 10)* (b-10);
        if (c<d){
            System.out.println(a);
        }else if (d<c){
            System.out.println (b);
        }else
            System.out.println(a + " " + b);
    }
}
