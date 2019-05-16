package com.company.HomeWork.HW_06;

/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test_0602 {
    public static void main(String[] args) throws IOException {

        Human grandfather = new Human("ded Makar",true,60,);
        Human grandfather2 = new Human("ded Misha",true,65,);

        Human grandmother = new Human("baba Luda",false,60,);
        Human grandmother2 = new Human("baba Olya",false,62,);

        Human father = new Human("papa Oleksandr",true,38,);
        Human mother = new Human("mama Olya",true,35,);

    }
}
class Human{
    private String name;
    private boolean sex;
    private int age;
    private ArrayList<Human>children;

    public Human(String name,boolean sex, int age,ArrayList<Human>children){
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.children = children;
    }
    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
    private boolean getSex(){
        return sex;
    }
    private void setSex(boolean sex){
        this.sex = sex;
    }
    private int getAge(){
        return age;
    }
    private void setAge(int age){
        this.age = age;
    }
    private ArrayList<Human>getChildren(){
        return children;
    }
    private void setChildren(ArrayList<Human>children){
        this.children = children;
    }
}

*/