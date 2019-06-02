package com.company.lesson_20;

/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
груша - фрукт
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_20Hw04 {
    public static void main(String[] args){
        printMap(mapInitialisation());
    }
    public static Map<String,String> mapInitialisation(){
        Map<String,String> allMap = new HashMap<>();
        allMap.put("арбуз","ягода");
        allMap.put("банан","трава");
        allMap.put("вишня","ягода");
        allMap.put("груша","фрукт");
        return allMap;
    }
    public static void printMap(Map<String,String>allMap){
        Iterator<Map.Entry<String,String>> Names = allMap.entrySet().iterator();
        while (Names.hasNext()) {
            Map.Entry<String,String> Name= Names.next();
            System.out.println(Name.getKey() + " - " + Name.getValue());
        }

    }
}
