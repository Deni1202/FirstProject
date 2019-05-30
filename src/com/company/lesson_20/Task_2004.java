package com.company.lesson_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
  map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
*/

public class Task_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> nameAndName = new HashMap<>();
        for(int i =0 i<5;i++){
            nameAndName.put(reader.readLine(), reader2.readLine());
        }
        Iterator<Map.Entry<String,String>>allNames = nameAndName.entrySet().iterator();
        while(allNames.hasNext()){
            Map.Entry<String,String> nameRepeet = allNames.next();
            int count = 0;
            for(int i = 0; i<5;i++){
            if(nameRepeet.getValue().equals())
        }
    }
}
