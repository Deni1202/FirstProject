package com.company.lesson_28;

public class Task_2805 {
        public static void main(String[] args) {
            com.company.lesson_28.Cow cow = new com.company.lesson_28.Cow();
            com.company.lesson_28.Whale whale = new com.company.lesson_28.Whale();
            cow.printName();
            whale.printName();
        }
    }

    class Cow {

        public void printName() {
            System.out.println("Я - корова");
        }
    }

    class Whale extends Cow {
        @Override
        public void printName() {
            System.out.println("Я не корова, Я - кит.");
        }
    }

