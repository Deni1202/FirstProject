package com.company.lesson_18;

// Посчитать сколько дней прошло с начала года.
// Используйте класс Date.



import java.text.ParseException;
import java.util.Date;

// Посчитать сколько дней прошло с начала года. Используйте класс Date.
public class Task_1805 {
    public static void main(String[] args) throws ParseException {
        Date nowDay = new Date();
        nowDay.setMinutes(0);
        nowDay.setHours(0);
        nowDay.setMonth(0);
        nowDay.setDate(1);
        Date yearBegin = new Date();
        long allDays = yearBegin.getTime() - nowDay.getTime();
        long day = 24*60*60*1000;
        Long result = allDays/day;
System.out.println(result);
    }
}


