package com.company.lesson_28;

/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/

public class Task_2804 {
    public static void main(String[]args){
        Cow cow = new Cow();
        Whale whale = new Whale();
        cow.getName();
        whale.getName();
    }
}
class Cow {

    public void getName() {
        System.out.println("Я - корова");
    }
}
class Whale extends Cow {
    @Override
    public void getName(){
        System.out.println("Я не корова, Я - кит.");
    }
}
