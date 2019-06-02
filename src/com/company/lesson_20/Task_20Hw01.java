package com.company.lesson_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/

public class Task_20Hw01 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getTimeMsOfGet(list1()));
        System.out.println(getTimeMsOfGet(list2()));
    }
    private static List<Integer>list1(){
        List<Integer>list1 = new ArrayList<>();
       for(int i = 0; i<10000;i++){
           list1.add(i);
       }
       return list1;
    }
    private static List<Integer>list2(){
        List<Integer>list2 = new LinkedList<>();
        for(int i = 0; i<10000;i++){
            list2.add(i);
        }
        return list2;
    }
    private static long getTimeMsOfGet(List<Integer>list){
        long time;
        Date beginTime = new Date();
        for(int i = 0; i<10000; i++){
            list.get(i);
        }

        Date endTime = new Date();
        time = endTime.getTime() - beginTime.getTime();
        return time;



    }

}
