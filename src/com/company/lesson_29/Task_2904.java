package com.company.lesson_29;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */

public class Task_2904 {
    public static void main(String[] args) {
        whoAreYou(new noNameAnimal());
    }
    public static void whoAreYou(Object animal){
        if(animal instanceof Cow){
            System.out.println("Корова");
        }else if(animal instanceof Whale){
            System.out.println("Кит");
        }else if(animal instanceof Dog4){
            System.out.println("Собака");
        }else if(animal instanceof noNameAnimal){
            System.out.println("Неизвестный пушной зверёк!!!");
        }

    }
}
class Cow{

}
class Whale{

}
class Dog4{

}
class noNameAnimal{

}
