package com.company.HomeWork.HW_05;

/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и таже женщина.
*/

public class PetOwner {
    public static void main(String[] args){
        Woman woman = new Woman("Sara", 30);
        Cat cat = new Cat("Jora", 3, "Sara");
        Dog1 dog1 = new Dog1("Jora", 3,"Sara");
        Fish fish = new Fish("Dora",1,"Sara");
        System.out.format("Hello, My name is %S, I`m %d\n", woman.getName(), woman.getAge());
        System.out.format("This is dog it`s name %s, it is %d, it`s owner is %s\n", dog1.getName1(),dog1.getAge1(), dog1.getOwner());
        System.out.format("This is cat it`s name%s, it is %d, it`s owner is %s\n", cat.getName1(),cat.getAge1(), cat.getOwner());
        System.out.format("This is fish it`s name %s, it is %d, it`s owner is %s\n", fish.getName1(),fish.getAge1(), fish.getOwner());
    }
}

class Woman{
    private String name;
    private int age;

    public Woman(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
class Cat {
    private String name1;
    private int age1;
    private String owner;

    public Cat(String name1, int age1, String owner) {
        this.name1 = name1;
        this.age1 = age1;
        this.owner = owner;
    }
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
    class Dog1 {
        private String name1;
        private int age1;
        private String owner;

        public Dog1(String name1, int age1, String owner) {
            this.name1 = name1;
            this.age1 = age1;
            this.owner = owner;
        }
        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }

        public int getAge1() {
            return age1;
        }

        public void setAge1(int age1) {
            this.age1 = age1;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }

        class Fish {
            private String name1;
            private int age1;
            private String owner;

            public Fish(String name1, int age1, String owner) {
                this.name1 = name1;
                this.age1 = age1;
                this.owner = owner;
            }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}

