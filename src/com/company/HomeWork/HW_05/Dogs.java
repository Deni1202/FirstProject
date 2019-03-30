package com.company.HomeWork.HW_05;
/* 1) Создать класс Dog с параметрами: name, age, tailLength. Подумай, какого типа должна быть каждая переменная.
 2) В выполняющем методе создать два объекта класса Dog и инициализировать их поля
 3) Вывести в консоль данные о каждой собаке в виде - "Name: [dog.name], age: [dog.age], tail length: [dog.tailLength]." */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Инициализируем ввод информации с консоли.
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        int tailLength = Integer.parseInt(reader.readLine());
        // Создаём объекты.
        Dog dog1 = new Dog(name, age, tailLength);
        Dog dog2 = new Dog(name,age,tailLength);
        //Выводим данные на экран.
        System.out.println("Вестти данные собаки №1:");
        System.out.format("Name1 is %s, Age1 is %d, TailLength1 is %d", dog1.getName(), dog1.getAge(), dog1.getTailLength());
        System.out.println("Ввести данные собаки №2:");
        System.out.format("Name2 i %s, Age2 is %d, TailLength2 is %d",dog2.getName(), dog2.getAge(), dog2.getTailLength());
    }

}
//Создаём клас Dog и добавляем поля.
class Dog {
    private String name;
    private int age;
    private int tailLength;

    // Создаём конструктор для определиния переменных объекта.
    public Dog(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }
    // создаём методы get и set для передачи значений переменных объекту.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getTailLength(){
        return tailLength;
    }
    public void setTailLength(int tailLength){
        this.tailLength = tailLength;
    }
}

