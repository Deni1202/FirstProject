package com.company.lesson_23;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Task_2301 {
    public static void main (String[] args){
        System.out.println("Begin try");
    try{
        int a = 42 / 0;
        System.out.println("Before try");
    }catch(ArithmeticException a){
        System.out.println("Arithmetic exc");
        }
        System.out.println("After try");
    }
}
