package com.company.lesson_21;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//TODO: 23.06.2019
public class Task_2102 {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> allPeople = new HashMap<>();
        allPeople.put("Rooney", "Leo");
        allPeople.put("Lloris", "Hugo");
        allPeople.put("Messi", "Leo");
        allPeople.put("Ronaldo", "Cristiano");
        allPeople.put("Maldini", "Paolo");
        allPeople.put("Indzaghi", "Pipo");
        allPeople.put("Del Piero", "Alesandro");
        allPeople.put("Balotelli", "Mario");
        allPeople.put("Gotze", "Mario");
        allPeople.put("Gomez", "Mario");
        System.out.println(userRemove(allPeople));
    }

    private static Map<String,String> userRemove(Map<String, String> allPeople) throws IOException {
        HashMap<String,String>result = new HashMap<>();
        Iterator<Map.Entry<String, String>> user = allPeople.entrySet().iterator();
            while (user.hasNext()) {
                    Map.Entry<String, String> user2 = user.next();
                    if (user2.getValue().equals(user.next().getValue())) {
                        user.remove();
                    }
                }
        return allPeople;
    }

    }
