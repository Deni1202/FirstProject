package com.company.lesson_23;

/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Task_2303 {
    public static void main(String[] args){
       System.out.println("Start try");
       try{
           int[] m = new int[2];
           m[8] = 5;
       }catch(Exception m){
           System.out.println(m);
       }finally {
           System.out.println("We found our exception");
       }
    }
}
