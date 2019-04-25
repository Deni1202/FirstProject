package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Создать список чисел и заполнить его с консоли следующим образом:
 чётные числа добавляють в конец списка, нечётные — в начало. */

public class Task_1403 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while(true){
            int a = Integer.parseInt(reader.readLine());
            if(a == 0){
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                break;
            }
            if(a%2 == 0){
                list.add(0,a);
            }else{
                list.add(list.size(),a);
            }

        }
    }
}
