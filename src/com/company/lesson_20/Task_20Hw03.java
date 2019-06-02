package com.company.lesson_20;

/*
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для
выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

Набор методов:
 public static List getListForGet(){}
 public static List getListForSet(){}
 public static List getListForAddOrInsert(){}
 public static List getListForRemove(){}
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task_20Hw03 {
    public static void main(String[] args){
        System.out.println(getListForGet(list1(),list2()));
        System.out.println(getListForSet(list1(),list2()));
        System.out.println(getListForAddOrInsert(list1(),list2()));
        System.out.println(getListForRemove(list1(),list2()));
    }
    public static List<Integer>list1(){
        List<Integer>list1 = new ArrayList<>();
        for(int i = 0; i<100;i++){
            list1.add(i);
        }
        return list1;
    }
    public static List<Integer>list2(){
        List<Integer>list2 = new LinkedList<>();
        for(int a = 100; a<200;a++){
            list2.add(a);
        }
        return list2;
    }
    public static long timeToGet(List<Integer>list){
        long time = 0;
        Date dateBegin = new Date();
        for(int a = 0; a<list.size();a++){
            list.get(a);
        }
        Date dateEnd = new Date();
        time = dateEnd.getTime() - dateBegin.getTime();
        return time;
    }
    public static long timeToSet(List<Integer>list){
        long time = 0;
        Date dateBegin = new Date();
        for(int a = 0; a<list.size();a++){
            list.set(0,a);
        }
        Date dateEnd = new Date();
        time = dateEnd.getTime() - dateBegin.getTime();
        return time;
    }
    public static long timeToInsert(List<Integer>list){
        long time = 0;
        Date dateBegin = new Date();
        for(int a = 0; a<list.size();a++){
            list.add(list.size()/2,a);
        }
        Date dateEnd = new Date();
        time = dateEnd.getTime() - dateBegin.getTime();
        return time;
    }
    public static long timeToRemove(List<Integer>list){
        long time = 0;
        Date dateBegin = new Date();
        for(int a = 0; a<list.size();a++){
            list.remove(a);
        }
        Date dateEnd = new Date();
        time = dateEnd.getTime() - dateBegin.getTime();
        return time;
    }
    public static List getListForGet(List<Integer>list1,List<Integer>list2){
        long a = timeToGet(list1);
        long b = timeToGet(list1);
        if(a<b){
            return list1;
        }else{
            return list2;
        }
    }
    public static List getListForSet(List<Integer>list1,List<Integer>list2){
        long a = timeToGet(list1);
        long b = timeToGet(list1);
        if(a<b){
            return list1;
        }else{
            return list2;
        }
    }
    public static List getListForAddOrInsert(List<Integer>list1,List<Integer>list2){
        long a = timeToGet(list1);
        long b = timeToGet(list1);
        if(a<b){
            return list1;
        }else{
            return list2;
        }
    }
    public static List getListForRemove(List<Integer>list1,List<Integer>list2){
        long a = timeToGet(list1);
        long b = timeToGet(list1);
        if(a<b){
            return list1;
        }else{
            return list2;
        }
    }

}
