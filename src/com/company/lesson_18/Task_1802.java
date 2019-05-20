package com.company.lesson_18;

/* Получение текущей даты
Посчитать сколько лет прошло с 1970 года */

import java.util.Date;

public class Task_1802 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date(); //определение сегодняшней даты и время.
        System.out.println(date);
        Thread.sleep(4000); //Задержка вывода на (милисекунды).

        int a = 24*60*60*1000; //Количество милисекунд в одних сутках.
        System.out.println(date.getTime()/a/365); //количество лет с 1970 года по сегодня.
    }
}
