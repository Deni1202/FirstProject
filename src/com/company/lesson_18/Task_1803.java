package com.company.lesson_18;

/*
 Вычислить разницу между двумя датами
 1) Сохранить текущую дату
 2) Отправить поток в сон на 3 секунды
 3) Считать дату ещё раз
 4) Высчитать разницу между двумя датами и вывести её в консоль
*/


import java.util.Date;

public class Task_1803 {
    public static void main(String[] args) throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(4000);
        Date date2 = new Date();
        long a = (date2.getTime() - date1.getTime())/1000;
        System.out.println(a);
    }
}
