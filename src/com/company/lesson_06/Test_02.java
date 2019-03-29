package com.company.lesson_06;

public class Test_02 {
    public static void main(String[] args){
        Cat cat1 = new Cat("Alex", 4, 47);
        System.out.println(cat1.getName);
        cat1.setName("Jora");



    }
}
class Cat{
    private String name
    private int age;
    private int power;

    public Cat(){

    }

    public Cat(String name,int a, int power){
        this.name = name;
        this.age = a;
        this.power = power;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}