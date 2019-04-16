package com.company.lesson_08;

/*
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.sql.SQLOutput;

public class Task_01 {
    public static void main(String[] args){
        Human grandmother1 = new Human("Olya",false, 50,null,null);
        Human grandfather1 = new Human("Ivan",true,45,null,null);

        Human grandmother2 = new Human("Luda",false,60,null,null);
        Human grandfather2 = new Human("Oleg",true,55,null,null);

        Human mother = new Human("Ala", false,35,grandmother1.getMother(),grandfather1.getFather());
        Human father = new Human("Aleksandr", true, 34,grandmother2,grandfather2);

        Human children1 = new Human("Stepa",false, 6,mother, father);
        Human children2 = new Human("Pasha",false, 9,mother, father);
        Human children3 = new Human("Dasha",false, 9,mother, father);
        System.out.println(grandmother1);
        System.out.println(grandfather1);
        System.out.println(grandmother2);
        System.out.println(grandfather2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);


    }

}
class Human {
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name,boolean sex,int age,Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
         this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
    public Human getMother(){
        return mother;

    }
    public void setMother(Human mother){
        this.mother = mother;
    }


    public String toString() {
        String res = "";
        res+= "Name: " + getName() +" ";
        res+="Age: " + getAge();
        res+="Sex: "+ getSex();
        res+= "Mother: " + getMother();
        res+="Father: " + getFather();


        return  res;
    }
}
