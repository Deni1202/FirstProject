package com.company.lesson_23;

/* Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/

import java.util.HashMap;
import java.util.Map;

public class Task_2305 {
    public static void main(String[] args){
        System.out.println("Start");
        try{
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch(Exception e){
            System.out.println("This is " + e);
        }
    }

}
