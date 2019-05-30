package com.company.lesson_20;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_2002 {
    public static void main(String[] args){
    Map<String,String> names = new HashMap<>();
    names.put("first", "I am");
    names.put("second", "I will");
    names.put("third", "I was");
        printKeys(names);
    }
    private static void printKeys(Map<String,String>names){
        Iterator<Map.Entry<String,String>>allNames = names.entrySet().iterator();
        while(allNames.hasNext()){
            Map.Entry<String,String> text = allNames.next();
            System.out.println(text.getKey());
        }
    }
}
