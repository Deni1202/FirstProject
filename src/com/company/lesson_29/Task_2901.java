package com.company.lesson_29;

/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/

public class Task_2901 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Cat2 cat = new Cat2();
        Dog dog = new Dog();
        pet.getChildren();
        cat.getChildren();
        dog.getChildren();
    }
}
class Pet{
    public Pet getChildren(){
            Pet pet = new Pet();
            return pet;
    }
}
class Cat2 extends Pet {
    @Override
    public Cat2 getChildren() {
        Cat2 cat = new Cat2();
        return cat;
    }
}
class Dog extends Pet {
    @Override
    public Dog getChildren() {
        Dog dog = new Dog();
        return dog;
    }
}
