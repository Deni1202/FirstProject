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
        System.out.println(findFirstName(mapInitialisation(),"Simn"));
        System.out.println(findLastNameRepeet(mapInitialisation(),"Simn"));
        }
        private static Map<String,String> mapInitialisation(){
            Map<String,String> nameAndName = new HashMap<String,String>();
            nameAndName.put("Sim1", "Simn");
            nameAndName.put("Simn", "Tomn");
            nameAndName.put("Simn", "Arbusn");
            nameAndName.put("Baby", "Simn");
            nameAndName.put("Art", "Simn");
            nameAndName.put("Sim", "Dogn");
            nameAndName.put("Eat", "Eatn");
            nameAndName.put("Food", "Foodn");
            nameAndName.put("Gevey", "Geveyn");
            nameAndName.put("Hugs", "Hugsn");
            return nameAndName;
        }

            private static int findFirstName(Map<String,String>allNames,String firstName){
                int count = 0;
                Iterator<Map.Entry<String,String>>Names = allNames.entrySet().iterator();

        while(Names.hasNext()){
            Map.Entry<String,String> nameRepeet = Names.next();
            String key = nameRepeet.getKey();
                if (firstName.equals(key)) {
                    count++;

                }
            }
        return count;

    }
    private static int findLastNameRepeet(Map<String,String>allName, String lastName){
        Iterator<Map.Entry<String,String>>LastName = allName.entrySet().iterator();
        int count2 = 0;
        while(LastName.hasNext()){
            Map.Entry<String,String>lastNameRepeet = LastName.next();
            String value = lastNameRepeet.getValue();
            if(lastName.equals(value)){
                count2++;
            }
        }
        return count2;
    }
}
