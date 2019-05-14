package com.company.lesson_17;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1702 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Cat>allCat = new ArrayList<>();
        while(true) {
            int age = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(age, name, weight, tail);
            allCat.add(cat);
        }
        System.out.println(allCat);
    }
}
class Cat{
    int age;
    String name;
    int weight;
    int tail;

    public Cat(int age,String name,int weight, int tail){
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.tail = tail;
    }
    private int getAge(){
        return age;
    }
    private void setAge(int age){
        this.age =age;
    }
    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name=name;
    }
    private int getWeight(){
        return weight;
    }
    private void setWeight(int weight){
        this.weight=weight;
    }
    private int  getTail(){
        return tail;
    }
    private void setTail(int tail){
        this.tail=tail;
    }


    public String toString() {
    String par = "";
    par+="Cat name is " + name;
    par+="age = "+ age;
    par+="tail = " + tail;
    par+="weight = " + weight;

    return par;
    }

}
