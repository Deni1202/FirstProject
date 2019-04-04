package com.company.HomeWork.HW_05;

/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.
*/
public class womanVsMan {
    public static void main(String[] args){
        Woman1 woman = new Woman1("Ira", 30, null);
        Man man = new Man("Igor",35, woman);
        woman.setHusband(man);
        System.out.format("My name is: %s, I`m: %d, My husband is : %s.\n",woman.getName(), woman.getAge(), woman.getHusband().getName1());
        System.out.format("My name is: %s, I`m: %d, My wife is : %s. ",man.getName1(), man.getAge1(), man.getWife().getName());
    }
}

class Woman1{
    private String name;
    private int age;
    private Man husband;

    public Woman1(String name, int age, Man husband){
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Man getHusband(){
        return husband;
    }
    public void setHusband(Man husband){
        this.husband = husband;
    }
}
class Man{
    private String name1;
    private int age1;
    private Woman1 wife;

    public Man(String name1, int age1, Woman1 wife){
        this.name1 = name1;
        this.age1 = age1;
        this.wife = wife;
    }
    public String getName1(){
        return name1;
    }
    public void setName1(String name1){
        this.name1 = name1;
    }
    public int getAge1(){
        return age1;
    }
    public void setAge1(int age1){
        this.age1 = age1;
    }
    public Woman1 getWife(){
        return wife;
    }
    public void setWife(Woman1 wife){
        this.wife = wife;
    }
}