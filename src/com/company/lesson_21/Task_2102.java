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
import java.util.*;

//TODO: 23.06.2019
public class Task_2102 {
    public static void main(String[] args) throws IOException {

        Map<String, String> allPeople = new HashMap<>();
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
        userRemove(allPeople,resultFootballPeople(aha(allPeople)));
    }

    private static List<String> aha(Map<String, String> allPeople) {
        List<String> footballPoeple = new ArrayList<>();
        Map<String, String> result = new HashMap<>();
        Iterator<Map.Entry<String, String>> userRemove = allPeople.entrySet().iterator();
        while (userRemove.hasNext()) {
            Map.Entry<String, String> user = userRemove.next();
                footballPoeple.add(user.getValue());
            }
        return footballPoeple;
    }

    private static List<String> resultFootballPeople(List<String> footballPeople) {
        List<String>result = new ArrayList<>();
            for (int i = 0; i < footballPeople.size() - 1; i++) {
                if (footballPeople.get(i).equals(footballPeople.get(i + 1))){
                   result.add(footballPeople.get(i));
                }
            }
        return result;
    }

   private static void userRemove(Map<String, String> allPeople,List<String>result) throws IOException {
       Map<String, String> result2 = new HashMap<>();
       Iterator<Map.Entry<String, String>> userRemove = allPeople.entrySet().iterator();
       for(int i = 0; i<result.size();i++){
       while (userRemove.hasNext()) {
               Map.Entry<String, String> user = userRemove.next();
               if (!user.getValue().equals(result.get(i))) {
                   result2.put(user.getKey(),user.getValue());

               }
           }
       }

       System.out.println(result2);
   }
}
