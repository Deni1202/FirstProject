package com.company.lesson_07;

/*
Создать класс Cat с параметрами: name, age, power
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от силы.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Task_02 {
    public static void main(String[] args){
        Cat cat1 = new Cat("Vaska",3,20);
        Cat cat2 = new Cat("Semen", 4,30);
        System.out.println(cat1.fight(cat2));
    }
}
class Cat {
    private String name;
    private int age;
    private int power;

    public Cat(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean fight(Cat anotherCat) {
        if(anotherCat.power>this.power){
            return false;
        }else{
            return true;
        }


    }
}

