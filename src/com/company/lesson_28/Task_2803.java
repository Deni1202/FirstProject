package com.company.lesson_28;

/*
 Создать классы Cat и Dog с параметрами name и speed
 Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/

public class Task_2803 {
    public static void main(String[]args){
        Cat1 cat = new Cat1("Мурзик",5);
        Dog dog = new Dog("Лорд",4);
        System.out.println("Мурзик догоняет: " + cat.isDogNear(dog));
        System.out.println("Лорд догоняет: " + dog.isCatNear(cat));
    }
}
class Cat1{
    private String name;
    private int speed;

    public Cat1(String name, int speed){
        this.name = name;
        this.speed = speed;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSpeed(){
        return  speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean isDogNear(Dog dog){
        if(dog.getSpeed()<this.speed){
            return true;
        }else{
            return false;
        }

    }
}
class Dog extends Cat1 {
    public Dog(String name, int speed) {
        super(name, speed);
    }

    public boolean isCatNear(Cat1 cat) {
        if (cat.getSpeed()<getSpeed()) {
            return true;
        } else {
            return false;
        }
    }
}

