package com.company.lesson_23;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Task_2302 {
    public static void main(String[] args){
        System.out.println("Start");
        try{
            String s = null;
            String m = s.toLowerCase();
        }catch(Exception m){
            System.out.println(m);
        }
    }
}
