package com.company.lesson_18;

// Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.

import java.util.Date;

public class Task_1806 {
    public static void main(String[] args){
        Date dateNow = new Date();

        System.out.print("Секунд:" + dateNow.getSeconds() +" "+ "Минут: " + dateNow.getMinutes() +" " + "Часов: " + dateNow.getHours());
    }
}
