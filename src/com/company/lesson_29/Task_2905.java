package com.company.lesson_29;

/* Создать класс Pet с методом getName, который возвращает строку "Я - пушистик"
Создать класс Cat и унаследоваться от Pet
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/

public class Task_2905 {
    public static void main(String[]args){
        Cat5 cat = new Cat5();
        cat.getName();
    }
}
abstract class Animal{
    public void getName(){
        System.out.println("Я - пушистик!");
    }
}
class Cat5 extends Animal{

    @Override
    public void getName() {
        System.out.println("Ничего подобного, я тот ещё Котяра!!!");
    }
}

