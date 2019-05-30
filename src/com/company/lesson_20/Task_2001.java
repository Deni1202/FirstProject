package com.company.lesson_20;

import java.util.*;

public class Task_2001 {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(2);
        numSet.add(12);
        numSet.add(24);
        numSet.add(36);
        Iterator<Integer> allNumbers = numSet.iterator();
        while (allNumbers.hasNext()) {
            int num = allNumbers.next();
            if (num == 12) {
                allNumbers.remove();
                break;
            }
            System.out.println(num);
        }
        Map<String, String> name = new HashMap<>();
        name.put("taxt1", "au");
        name.put("text2", "Yes");
        name.put("text3", "No");
        name.put("text4", "Yes");
        name.put("text3", "find");

        for (Map.Entry<String, String> entry : name.entrySet()) {
            System.out.println(name.entrySet());
        }
    }
}
