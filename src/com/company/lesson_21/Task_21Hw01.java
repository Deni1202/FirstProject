package com.company.lesson_21;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».

        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_21Hw01 {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> allMonth = new HashMap<>();
        allMonth.put("January",1);
        allMonth.put("February",2);
        allMonth.put("March",3);
        allMonth.put("April",4);
        allMonth.put("May",5);
        allMonth.put("June",6);
        allMonth.put("July",7);
        allMonth.put("August",8);
        allMonth.put("September",9);
        allMonth.put("October",10);
        allMonth.put("November",11);
        allMonth.put("December",12);
        whatMonthNumberIs(allMonth);
    }
    private static void whatMonthNumberIs(Map<String,Integer> allMonth) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Iterator<Map.Entry<String,Integer>> allMonth2 = allMonth.entrySet().iterator();
        while(allMonth2.hasNext()){
            Map.Entry<String,Integer> needMonth = allMonth2.next();
            if(needMonth.getKey().equals(month)){
                System.out.println(needMonth.getKey() + " is " + needMonth.getValue() + " month.");
            }
        }
    }
}
