package com.company.lesson_28;

/*
1. Создать класс Cat с переменными name, age, weight.
2. Скрыть все внутренние переменные класса Cat:
- создать геттеры и сеттеры
- скрыть методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/

public class Task_2802 {
    public static void main(String[]args){
        Cat cat = new Cat("Васька", 3,4);
    }
}

class Cat{
    private String name;
    private int age;
    private int weight;
     public Cat(String name, int age, int weight){
         this.name = name;
         this.age = age;
         this.weight = weight;
     }
     private String getName(){
         return name;
     }
     private void setName(String name){
         this.name = name;
     }
     private int getAge(){
         return age;
     }
     private void setAge(int age){
         this.age = age;
     }
     private int getWeight(){
         return weight;
     }
     private void setWeight(int weight){
         this.weight = weight;
     }

     private void sayMyau(){
         System.out.println("Мяу-Мяу");
     }
}