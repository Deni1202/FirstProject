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
        Date dateBegin = new Date();
        List list1 = new LinkedList();
        for(int i = 0; i<10000;i++) {
            list1.add(5000, i);
        }

                List list2 = new ArrayList();
                for(int i = 0; i<10000;i++) {
                    list2.add(5000, i);

            }
        Date dateInTheEnd = new Date();
        long time = dateInTheEnd.getTime() - dateBegin.getTime();
        return time;
        }

    }

