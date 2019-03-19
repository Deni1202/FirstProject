package com.company.HomeWork.HW_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Введите с клавиатуры три целых числа.
Выведите их на экран в порядке возрастания, используя if/else.
*/
public class Fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(a<b && a<c && b>c){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }if (b<a && b<c && c>a){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }if (c<a && c<b && a>b)
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
    }
}

