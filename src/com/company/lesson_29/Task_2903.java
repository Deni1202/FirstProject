package com.company.lesson_29;

/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Создать интерфейсы Fly(летать), Move(передвигаться), Eat(есть) с методами fly, move, eat соответсвенно.
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Task_2903 {
    public static void main(String[] args) {

    }
}
interface Fly{
    public void fly();
}
interface Move{
    public void move();
}
interface Eat{
    public void eat();
}
class Dog3 implements Move, Eat{

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}
class Car implements Move{

    @Override
    public void move() {

    }
}
class Duck implements Fly,Move,Eat{
    @Override
    public void fly() {

    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}
class Airplane implements Fly{
    @Override
    public void fly() {

    }
}
