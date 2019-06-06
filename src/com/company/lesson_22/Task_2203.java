package com.company.lesson_22;

/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_2203 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String>allFamily = new HashMap<>();
        allFamily.put("Москва","Ивановы");
        allFamily.put("Киев","Петровы");
        allFamily.put("Лондон","Абрамовичи");
        allFamily.put("Иерусалим","Просто Изя");
        cityLiving(allFamily);
    }
    private static void cityLiving(Map<String,String>allFamily) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city = reader.readLine();
        Iterator<Map.Entry<String,String>> familyCity = allFamily.entrySet().iterator();
        while(familyCity.hasNext()){
            Map.Entry<String,String>result = familyCity.next();
            if(result.getKey().equals(city)){
                System.out.println(result.getValue());
            }
        }
    }
}
