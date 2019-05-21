package com.company.lesson_19;
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
*/


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task_1901 {
    public static void main(String[] args){
       Date dateBegin = new Date();
       List list = new LinkedList();
       for(int i = 0; i<10000;i++){
           list.add(i);
       }
       Date dateInTheEnd = new Date();
       long time = dateInTheEnd.getTime() - dateBegin.getTime();
        System.out.println(dateBegin.getTime());
        System.out.println(dateInTheEnd.getTime());
       System.out.println(time);
    }
}
