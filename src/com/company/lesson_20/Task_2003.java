package com.company.lesson_20;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 5 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i< 5; i++) {
            allNumbers.add(Integer.parseInt(reader.readLine()));

        }
        System.out.println(removeAllNumbersMoreThan10(allNumbers));
    }
    private static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> allNumbers) {
        Iterator<Integer> nums = allNumbers.iterator();
        while (nums.hasNext()) {
            int num = nums.next();
            if(num>10){
                nums.remove();
            }
        }
        return allNumbers;
    }
    }
