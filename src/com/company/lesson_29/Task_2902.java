package com.company.lesson_29;

/* Или «Кошка», или «Птица», или «Лампа», или «Собака»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Кошка», «Птица», «Лампа», «Собака».
*/

public class Task_2902 {
    public static void main(String[]args){
        whoAreYou(new Bird());
    }
    public static void whoAreYou(Object name){
        if(name instanceof Bird){
            System.out.println("Птица");
        }else if(name instanceof Cat3){
            System.out.println("Кот");
        }else if(name instanceof Fonaric){
        System.out.println("Лампа");
    }else if(name instanceof Dog2){
        System.out.println("Собака");
    }
    }
}
class Bird{

}
class Cat3{

}
class Fonaric{

}
class Dog2{

}
