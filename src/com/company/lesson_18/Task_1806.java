package com.company.lesson_18;

// Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.

import java.util.Date;

public class Task_1806 {
    public static void main(String[] args){
        Date dateNow = new Date();
        dateNow.setMinutes(0);
        dateNow.setHours(0);
        Date dayBegin = new Date();
        long time = dayBegin.getTime() - dateNow.getTime();
        long timeInAll = 60*60*1000;
        long result = time/timeInAll;
        System.out.println(result);
    }
}
