package com.company.lesson_19;
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task_1901 {
    public static void main(String[] args) throws IOException {

     getTime();
    }
    private static long getTime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date dateBegin = new Date();
        int c = Integer.parseInt(reader.readLine());
        if(c=0){
        List list = new LinkedList();
        for(int i = 0; i<10000;i++) {
            list.add(5000, i);
        }
            if (c == 1) {
                List list = new ArrayList();
                for(int i = 0; i<10000;i++) {
                    list.add(5000, i);
                }
            }
        }
        Date dateInTheEnd = new Date();
        long time = dateInTheEnd.getTime() - dateBegin.getTime();
        return time;
    }

}
