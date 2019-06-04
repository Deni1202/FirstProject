package com.company.lesson_21;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_2101 {
    public static void main(String[] args){
        HashMap<String,Date>userAndDate = new HashMap<>();
        userAndDate.put("Stallone", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone1", new Date("JUNE 5 1999"));
        userAndDate.put("Stallone2", new Date("JUNE 13 1996"));
        userAndDate.put("Stallone3", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone4", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone5", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone6", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone7", new Date("JUNE 1 1980"));
        userAndDate.put("Stallone8", new Date("DECEMBER 1 1980"));
        userAndDate.put("Stallone9", new Date("MARCH 1 1980"));

        System.out.println(allUser(userAndDate));

    }
    private static Map<String, Date> allUser(Map<String,Date>userAndDate) {
        Iterator<Map.Entry<String, Date>> user = userAndDate.entrySet().iterator();
        while (user.hasNext()) {
            Map.Entry<String, Date> user2 = user.next();
            Date date = user2.getValue();
            int month = date.getMonth();
            if(month>=5 && month<=7){
                user.remove();
            }
        }
        return userAndDate;
    }
}
