package com.company.lesson_23;

/* Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
List<String> list = new ArrayList<String>();
String s = list.get(18);
*/

import java.util.ArrayList;
import java.util.List;

public class Task_2304 {
    public static void main(String[] args){
        System.out.println("We begin try");
        try{
            List<String> list = new ArrayList<String>();
            String s = list.get(18);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("We catch this exception");
        }
    }
}
